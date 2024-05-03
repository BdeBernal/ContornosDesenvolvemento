package com.bernal;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EstudianteTest {

	@Test
	public void pruebaAsignacionNombre() {
		Estudiante e = new Estudiante("Paco", 32);
		e.setNombre("Kiko");
		assertEquals("Kiko", e.getNombre());
	}
	
	@Test
	public void pruebaAsignacionEdad() {
		Estudiante e = new Estudiante("Paco", 32);
		e.setEdad(88);
		assertEquals(88, e.getEdad());
	}
	
	@Test
	public void pruebaAsignacionConstructor() {
		Estudiante e = new Estudiante("Paco", 32);
		assertEquals("Paco", e.getNombre());
		assertEquals(32, e.getEdad());
	}
	
	@Test
	public void pruebaAsignacionCalificacion() {
		Estudiante e = new Estudiante("Paco", 32);
		e.setCalificacion(7);
		assertEquals(7, e.getCalificacion());
	}
	
	@Test
	public void aprueba() {
		Estudiante e = new Estudiante("Paco", 32);
		e.setCalificacion(7);
		assertTrue(e.aprobo());
	}
	
	@Test
	public void Noaprueba() {
		Estudiante e = new Estudiante("Paco", 32);
		e.setCalificacion(3);
		assertFalse(e.aprobo());
	}
	
	@Test
	public void pruebaEsUniversitario() {
		Estudiante e = new Estudiante("Paco", 32);
		assertTrue(e.esUniversitario());
	}
	
	@Test
	public void pruebaNoEsUniversitario() {
		Estudiante e = new Estudiante("Paco", 15);
		assertFalse(e.esUniversitario());
	}
	
	@Test
	public void pruebaEdadEScolar() {
		Estudiante e = new Estudiante("Paco", 12);
		assertEquals(1, e.edadEscolar());
	}
}