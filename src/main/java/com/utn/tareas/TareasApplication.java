package com.utn.tareas;

import com.utn.tareas.model.Prioridad;
import com.utn.tareas.service.MensajeService;
import com.utn.tareas.service.TareaService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication implements CommandLineRunner {

    private final TareaService tareaService;
    private final MensajeService mensajeService;

    public TareasApplication(TareaService tareaService, MensajeService mensajeService) {
        this.tareaService = tareaService;
        this.mensajeService = mensajeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TareasApplication.class, args);
    }

    @Override
    public void run(String... args) {
        mensajeService.mostrarBienvenida();
        tareaService.imprimirConfiguracion();
        System.out.println(tareaService.listarTodas());
        tareaService.agregarTarea("Hacer el TP de Spring", Prioridad.ALTA);
        System.out.println("Pendientes: " + tareaService.listarPendientes());
        tareaService.marcarComoCompletada(1L);
        System.out.println(tareaService.obtenerEstadisticas());
        System.out.println("Completadas: " + tareaService.listarCompletadas());
        mensajeService.mostrarDespedida();
    }
}