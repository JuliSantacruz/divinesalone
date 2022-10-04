package com.app.web.entidad;

import java.sql.Time;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="citas")

public class Cita {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name="nombre",nullable=false)
private String nombre;

@Column(name="apellido",nullable=false)
private String apellido;

@Column(name="telefono",nullable=false)
private String telefono;

@Column(name="email",nullable=false)
private String email;

@Column(name="servicio",nullable=false)
private String servicio;

@Temporal(TemporalType.DATE)
@DateTimeFormat(iso=ISO.DATE)
@Column(name="fecha",nullable=false)
private Date fecha;




private String hora;



public Cita() {
	
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getServicio() {
	return servicio;
}

public void setServicio(String servicio) {
	this.servicio = servicio;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

public Cita(Long id, String nombre, String apellido, String telefono, String email, String servicio, Date fecha,
		String hora) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefono = telefono;
	this.email = email;
	this.servicio = servicio;
	this.fecha = fecha;
	this.hora = hora;
}

public Cita( String nombre, String apellido, String telefono, String email, String servicio, Date fecha,
		String hora) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.telefono = telefono;
	this.email = email;
	this.servicio = servicio;
	this.fecha = fecha;
	this.hora = hora;
}

@Override
public String toString() {
	return "Cita [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email="
			+ email + ", servicio=" + servicio + ", fecha=" + fecha + ", hora=" + hora + "]";
}

}
