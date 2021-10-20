package com.practica.starter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.bootcamp.config.SaludoProperties;

@SpringBootApplication
public class Starter2Application {

	@Autowired SaludoProperties saludoProperties;
	public static void main(String[] args) {
		SpringApplication.run(Starter2Application.class, args);
//		Saludo saludo = new Saludo("Ingles");
//		System.out.println(saludoProperties);
//		saludo.setIdioma("Castellano");
//		System.out.println(saludo.mensajeSaludo());
	}

}
