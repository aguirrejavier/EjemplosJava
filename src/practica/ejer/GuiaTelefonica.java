package practica.ejer;

import java.util.ArrayList;

public class GuiaTelefonica {
	
	ArrayList<Persona> guia;
		
	public GuiaTelefonica() {
		guia = new ArrayList<Persona>();
	}	
	
	public void agregarPersona(Persona per) {
		guia.add(per);
	}

	private static String generarCodigo(Persona per) {
		
		String codigo=per.getApellido().toLowerCase().concat("*"+per.getNombre().toLowerCase().charAt(0)+"*");
		codigo = codigo.replaceAll("[a|b|c]", "2");
		codigo = codigo.replaceAll("[d|e|f]", "3");
		codigo = codigo.replaceAll("[g|h|i]", "4");
		codigo = codigo.replaceAll("[j|k|l]", "5");
		codigo = codigo.replaceAll("[m|n|ñ|o]", "6");
		codigo = codigo.replaceAll("[p|q|r|s]", "7");
		codigo = codigo.replaceAll("[t|u|v]", "8");
		codigo = codigo.replaceAll("[w|x|y|z]", "9");
		return codigo;
	}
	
	public int buscarTelefono(String codigo) {
		
		for (Persona per : guia) {
			if(codigo.equals(GuiaTelefonica.generarCodigo(per)))
				return per.getTelefono();
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Persona per = new Persona("Carlos", "Aguirre", 46949405, 38700231);
		Persona per1 = new Persona("Diego","Becerra",46940011,38700154);
		Persona per2 = new Persona("Sebastian","Aguirre",46941100,42500123);
		Persona per3 = new Persona("Juan","Fernandez",46940053,38700014);
		GuiaTelefonica guia = new GuiaTelefonica();
		guia.agregarPersona(per);
		guia.agregarPersona(per1);
		guia.agregarPersona(per2);
		guia.agregarPersona(per3);
		
		//System.out.println("aacsacs");
		System.out.println("Telefono: ");
		System.out.println(guia.buscarTelefono("2484773*2*"));
		System.out.println(guia.buscarTelefono("2484773*2*"));
	}
}
