package org.example.miprimerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiPrimerSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(MiPrimerSpringApplication.class, args);

        Persona persona = new Persona("Luis", "Montero", 31);
        System.out.println(persona);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
    }

}
