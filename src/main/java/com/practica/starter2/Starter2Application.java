package com.practica.starter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.model.Saludo;

@SpringBootApplication
public class Starter2Application {

	public static void main(String[] args) {
		SpringApplication.run(Starter2Application.class, args);
		Saludo saludo = new Saludo("Ingles");
		System.out.println(saludo.mensajeSaludo());
		saludo.setIdioma("Castellano");
		System.out.println(saludo.mensajeSaludo());
	}

}
