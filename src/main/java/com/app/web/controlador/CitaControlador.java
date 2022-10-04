package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Cita;
import com.app.web.servicio.CitaServicio;

@Controller
public class CitaControlador {

	@Autowired
	private CitaServicio servicio;
	
	@GetMapping({"/cita","/"})
	public String ListarCitas(Model modelo) {
		modelo.addAttribute("cita" , servicio.listarTodasLasCitas());
		return "cita";
	}
	
	@GetMapping("/cita/nuevo")
	public String crearCitaFormulario(Model modelo) {
		Cita cita = new Cita();
		modelo.addAttribute("cita" , cita);
		return "crearCita";
	}
	
	@PostMapping("/cita")
	public String guardarCita(@ModelAttribute("cita") Cita cita) {
	servicio.guardarCita(cita);
	return "redirect:/cita";
	}
	
	@GetMapping("/cita/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("cita",servicio.obtenerCitaPorId(id));
		return "editarCita";
	}
	
	@PostMapping("/cita/{id}")
	public String actualizarCita(@PathVariable Long id,@ModelAttribute("cita") Cita cita) {
		Cita citaExistente = servicio.obtenerCitaPorId(id);
		citaExistente.setId(id);
		citaExistente.setNombre(cita.getNombre());
		citaExistente.setApellido(cita.getApellido());
		citaExistente.setTelefono(cita.getTelefono());
		citaExistente.setEmail(cita.getEmail());
		citaExistente.setServicio(cita.getServicio());
		citaExistente.setFecha(cita.getFecha());
		citaExistente.setHora(cita.getHora());
		
		servicio.actualizarCita(citaExistente);
		
		return"redirect:/cita";		
	}
	
	@GetMapping("/cita/{id}")
	public String eliminarCita(@PathVariable Long id) {
		servicio.eliminarCita(id);
		return"redirect:/cita";
		
	}
	
}
