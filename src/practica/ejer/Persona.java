package practica.ejer;


public class Persona {
	
	private String nombre;
	private String apellido;
	private int telefono;
	private int dni;
	
	public Persona(String nombre,String apellido,int telefono, int dni) {
		setNombre(nombre);
		setApellido(apellido);
		setTelefono(telefono);
		setDni(dni);
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public int getDni() {
		return this.dni;
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	
	
}	
