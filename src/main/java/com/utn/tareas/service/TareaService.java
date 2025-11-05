package com.utn.tareas.service;

import com.utn.tareas.model.Tarea;
import com.utn.tareas.model.Prioridad;
import com.utn.tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TareaService {

    private final TareaRepository repo;

    @Value("${app.nombre}")
    private String nombre;

    @Value("${app.max-tareas}")
    private int maxTareas;

    @Value("${app.mostrar-estadisticas}")
    private boolean mostrarEstadisticas;

    public TareaService(TareaRepository repo) {
        this.repo = repo;
    }

    public void imprimirConfiguracion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Máx. tareas: " + maxTareas);
        System.out.println("Mostrar estadísticas: " + mostrarEstadisticas);
    }

    public void agregarTarea(String descripcion, Prioridad prioridad) {
        if (repo.obtenerTodas().size() >= maxTareas) {
            System.out.println("⚠ No se pueden agregar más tareas (límite alcanzado).");
            return;
        }
        repo.guardar(new Tarea(null, descripcion, false, prioridad));
    }

    public List<Tarea> listarTodas() {
        return repo.obtenerTodas();
    }

    public List<Tarea> listarPendientes() {
        return repo.obtenerTodas().stream().filter(t -> !t.isCompletada()).collect(Collectors.toList());
    }

    public List<Tarea> listarCompletadas() {
        return repo.obtenerTodas().stream().filter(Tarea::isCompletada).collect(Collectors.toList());
    }

    public void marcarComoCompletada(Long id) {
        repo.buscarPorId(id).ifPresent(t -> t.setCompletada(true));
    }

    public String obtenerEstadisticas() {
        long total = repo.obtenerTodas().size();
        long comp = listarCompletadas().size();
        long pend = total - comp;
        return String.format("Total: %d | Completadas: %d | Pendientes: %d", total, comp, pend);
    }
}