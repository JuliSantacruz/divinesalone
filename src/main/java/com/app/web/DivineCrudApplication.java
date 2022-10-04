package com.app.web;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Cita;
import com.app.web.repositorio.CitaRepositorio;

@SpringBootApplication
public class DivineCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DivineCrudApplication.class, args);
	}
	@Autowired
	private CitaRepositorio repositorio;
	@Override
	public void run(String... args) throws Exception {
		
		/*SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = formato.parse("23/11/2015");
		Cita cita1 = new Cita( "Alexandra","Muñoz","3015556437","alexa@gmail.com","pedicure" ,fecha,"30:00");
		repositorio.save(cita1);*/
		
	}

}
