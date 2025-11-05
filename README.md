# 📝 Sistema de Gestión de Tareas – Spring Boot

Proyecto realizado para **Programación III – UTN FRM**, aplicando los fundamentos de **Spring Boot**:  
inyección de dependencias, estereotipos, configuración con `application.properties` y gestión de entornos con *profiles*.

---

## 🚀 Descripción
Aplicación de consola que simula un gestor de tareas (To-Do List).  
Permite listar, agregar, marcar como completadas y obtener estadísticas de tareas.  
Incluye perfiles de ejecución para **desarrollo (dev)** y **producción (prod)**, con mensajes y configuraciones diferentes.

---

## ⚙️ Tecnologías utilizadas
- Java 21  
- Spring Boot 3.x  
- Gradle  
- Lombok  
- Spring DevTools  

---

## ▶️ Ejecución del proyecto
Desde la carpeta raíz del proyecto:
bash
./gradlew bootRun

---

## 🔧 Cambiar entre perfiles

En el archivo `src/main/resources/application.properties`, modificá la línea:

properties
spring.profiles.active=dev

Por:

spring.profiles.active=prod

Luego volvés a ejecutar el proyecto para ver el cambio de comportamiento.

---

📸 Capturas de consola
🧩 Modo Desarrollo (dev)

<img width="1440" height="900" alt="captura-dev" src="https://github.com/user-attachments/assets/98ce39fb-f9cd-4d54-b46b-0c0966e35e99" />

🏭 Modo Producción (prod)

<img width="1440" height="900" alt="captura-prod" src="https://github.com/user-attachments/assets/cde65362-e439-4291-ab78-0aa6a2233778" />

💭 Conclusiones personales

Durante el desarrollo de este trabajo práctico se aplicaron los principales conceptos de Spring Boot, incluyendo:

Inyección de dependencias por constructor

Uso de estereotipos @Service y @Repository

Configuración mediante application.properties

Gestión de diferentes entornos con @Profile

Implementación de CommandLineRunner para ejecutar lógica inicial

Este ejercicio permitió comprender cómo estructurar un proyecto profesional en Spring Boot
y cómo aprovechar la automatización de configuración que ofrece el framework.

---

👤 Autora

Guillermina Fiore – Legajo 50024
Universidad Tecnológica Nacional – Facultad Regional Mendoza
Ingeniería en Sistemas de Información
