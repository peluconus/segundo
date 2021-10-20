package com.practica.starter2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.config.SaludoProperties;

@RestController
public class IndexController {
	
	@Autowired SaludoProperties s;
	
	@GetMapping("/saludo")
	public String getSaludos() {
		return s.getIdioma();
	}
	
	@GetMapping("/")
	public String getSaludo() {
		return "ok";
	}

}
