package practica.ejer;

public class Polinomio {
		private int grado;
		private double[] coeficientes;
		
		
		public Polinomio(int grado, double[] coeficientes) {
			this.grado = grado;
			this.coeficientes = coeficientes;
			
		}
		public double evaluarMSucesivas(double x) {//

			double resultado=0;
			double[]vec = coeficientes.clone();
			for(int i = 0 ; i<=grado; i++) {	
				for (int j=i; j<grado ; j++) {
					vec[i] *= x;
				}
				resultado += vec[i];
			}
			return resultado;
		}
		
		public double evaluarRecursiva(double x) {
			double resultado=0;
			for (int i = 0; i < grado; i++) {
				resultado += coeficientes[i] * potencia(x,grado-i);
			}
			resultado += coeficientes[grado];
			return resultado;
		}
		public double potencia(double x, int n) {
			if(n==0)
				return 1;
			if(n == 1) 
				return x;
			return x * potencia(x, n-1);
		}
		public double potenciaPar(double x,int n) {
			if(n==0)
				return 1;
			if(n == 1) 
				return x;
			return n%2==0?potenciaPar(x*x,n/2):x*potenciaPar(x, n-1);
		}
		
		public double evaluarRecursivaPar(double x) {
			
			double resultado = 0;
			for (int i = 0; i <=grado; i++) {
				resultado += coeficientes[i] * potenciaPar(x,grado-i);
			}
			return resultado;
		}
		
		public double evaluarPow(double x) {
			double resultado = 0;
			for (int i = 0; i <= grado; i++) {
				resultado += coeficientes[i]*Math.pow(x, grado-i);
			}
			return resultado;
		}
		
		public double evaluarHorner(double x) {
			double resultado = 0;
			for (int i = 0; i <= grado ; i++) {
				resultado = coeficientes[i] +(resultado*x); 
			}
			return resultado;
		}
}
