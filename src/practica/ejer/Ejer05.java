package practica.ejer;

import javax.swing.JOptionPane;

public class Ejer05 {
	
	public static int numeroEnteroProximo(int num, int base) {
		if(num == 1)
			return 0;
		if(num<=0)
			JOptionPane.showMessageDialog(null, "No se permiten numeros negativos","Error", JOptionPane.ERROR_MESSAGE);
		
		double aux = Math.log(num)/Math.log(base);
		int aux2 =(int) (Math.log(num)/Math.log(base));
		aux = aux - aux2;
		if(aux != 0) {
			if(aux>=0.5)
				aux2++;
		}
		return aux2;
		
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		
		System.out.println(Ejer05.numeroEnteroProximo(n,10));
	}

}
