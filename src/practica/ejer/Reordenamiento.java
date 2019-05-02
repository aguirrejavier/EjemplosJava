package practica.ejer;

public class Reordenamiento {
	
	private double[] vec;
	
	public Reordenamiento(double[] vec) {
		this.vec = vec;
	}
	
	public boolean reordenarVector(int num) {
		
		if(this.vec.length<num)
			return false;
		
		int a= num+1;
		int b=vec.length-a;
		int inicio=0;
		int finB= vec.length-1;
		int finA=a;
		double aux;
		
		while(a>0 && b>0) {
		
			if(a>b) {
				for(int i=finA;i<=finB;i++) {
					aux = vec[i];
					vec[i]=vec[i-b];
					vec[i-b]=aux;
				}
				a-=b;
				finB-=b;
				finA-=b;
			}
			else {
				for(int j=inicio;j<finA;j++) {
					aux=vec[j];
					vec[j]=vec[j+a];
					vec[j+a]=aux;
				}
				inicio+=a;
				b-=a;		
				finA+=a;
			}
		}
		return true;
	}
	public void mostrarVector() {
		for (double d : vec) 
			System.out.print(d+" ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		double[] vector = {0,1,2,3,4,5,6,7,8,9};
		int num = 5;
		Reordenamiento ord = new Reordenamiento(vector);
		ord.mostrarVector();
		ord.reordenarVector(num);
		ord.mostrarVector();
	}

}
