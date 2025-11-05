package com.utn.tareas.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class MensajeDevService implements MensajeService {

    public void mostrarBienvenida() { System.out.println("Bienvenido al modo Desarrollo (dev)"); }
    public void mostrarDespedida() { System.out.println("Fin del modo Desarrollo"); }
}