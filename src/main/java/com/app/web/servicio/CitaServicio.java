package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Cita;

public interface CitaServicio {
	
	public List<Cita> listarTodasLasCitas();

	public Cita guardarCita(Cita cita);
	
	public Cita obtenerCitaPorId(Long id);
	public Cita actualizarCita(Cita cita);
	public void eliminarCita(long id);
	

}
