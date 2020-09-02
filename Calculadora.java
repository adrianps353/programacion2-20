public class Calculadora{
	
	public double multiplicar(double valor1, double valor2){
		double resultado = valor2 * valor1;
		return resultado;
	}

	public int obtenerElMayor(int a, int b, int c){
		int mayor = 0;
		if (a > b && a > c){
			mayor = a;
		}
		else{
			if (b > c){
				mayor = b;
			}
			else{
				mayor = c;
			}
		}
		return mayor;
	}


	public boolean esPrimo(int numero){
		// suponer que el numero es primo
		// dividir desde 2 hasta la mitad
		//   - si encontramos un caso por el que sea divisible no es primo
		boolean primo = true;
		int divisor = 2;
		int numeroMedio = numero/2; 
		while(divisor <= numeroMedio && primo){
			if(numero % divisor == 0){
				primo = false;
			}
			divisor++;
		}
		return primo;
	}

	public static void main (String [] args){
		Calculadora calcu1 = new Calculadora();
		System.out.println("5: "+ calcu1.esPrimo(5));
		System.out.println("6: "+ calcu1.esPrimo(6));
	}

}