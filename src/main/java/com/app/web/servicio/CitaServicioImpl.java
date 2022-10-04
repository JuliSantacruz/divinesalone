package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Cita;
import com.app.web.repositorio.CitaRepositorio;

@Service
public class CitaServicioImpl implements CitaServicio {

	@Autowired
	private CitaRepositorio repositorio;
	@Override
	public List<Cita> listarTodasLasCitas() {
		
		return repositorio.findAll();
	}
	@Override
	public Cita guardarCita(Cita cita) {
		
		return repositorio.save(cita);
	}
	@Override
	public Cita obtenerCitaPorId(Long id) {
		
		return repositorio.findById(id).get();
	}
	@Override
	public Cita actualizarCita(Cita cita) {
		// TODO Auto-generated method stub
		return repositorio.save(cita);
	}
	@Override
	public void eliminarCita(long id) {
		repositorio.deleteById(id);
		
	}
	
}
