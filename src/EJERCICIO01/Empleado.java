package EJERCICIO01;

import java.time.LocalDate;

public class Empleado extends Persona
{
	private int legajo;
	private String puesto; 
	
	//Constructores	

	public Empleado() {
		super();
		this.puesto = "sin puesto";
	}

	public Empleado(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email, String puesto) {
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		this.puesto = puesto;
	}
	
	//Getters y Setters
	
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Empleado [Legajo=" + legajo +  ", Puesto=" + puesto +  "]" + ", " + super.toString();
	}
}
