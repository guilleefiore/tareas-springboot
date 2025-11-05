package com.utn.tareas.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class MensajeProdService implements MensajeService {

    public void mostrarBienvenida() { System.out.println("Sistema de Tareas iniciado (PROD)"); }
    public void mostrarDespedida() { System.out.println("Ejecución finalizada (PROD)"); }
}