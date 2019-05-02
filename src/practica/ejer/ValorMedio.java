package practica.ejer;

//import javax.swing.JOptionPane;
public class ValorMedio {
	
	public static double valorMedio(double a, double b, Polinomio pol, double error) {
		
		double E = Math.abs(b-a);
		double num=a;
		
		if(pol.evaluarHorner(a) * pol.evaluarHorner(b) > 0)
			 return num;//JOptionPane.showMessageDialog(null, "NO existe raiz entre a y b", "ERROR", JOptionPane.ERROR_MESSAGE);
		
		while(E>error) {
			num=(b+a)/2;	
			if(pol.evaluarHorner(num) * pol.evaluarHorner(b) > 0)
				b=num;
			else 
				a=num;
			E = Math.abs(b-a);
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		
		double[] vec = {-1,-1,0,0,1};
		Polinomio pol = new Polinomio(4, vec);
		
		System.out.println(ValorMedio.valorMedio(1,10, pol, 0.01));
	//	System.out.println(pol.evaluarHorner(ValorMedio.valorMedio(-2, -1, pol, 0.01)));
		
		
	}

}
