public class Recursividad{
	

	public int calcularSumatoria(int n){
		// Caso(s) base
		int resultado = 0;
		if (n <= 0){
			resultado = 0;
		}
		// Caso Recursivo
		else{
			resultado = n + calcularSumatoria(n-1);
		}
		return resultado;
	}

	//        n 0 1 2 3 4 5 6 7  8  9
	//Secuencia 0 1 1 2 3 5 8 13 21 34...

	// f(n) = f(n-1) + f(n-2)
	// f(0) = 0
	// f(1) = 1
	public int calcularFibonacci(int n){
		int resultado = 0;
		// Casos triviales?
		if(n <= 0){
			System.out.println("En el caso base: " + n);
			resultado = 0;
		}
		else if (n == 1){
			System.out.println("En el caso base: " + n);
			resultado = 1;
		}// Casos recursivos?
		else{
			System.out.println("En el caso recursivo con n: " + n);
			resultado = calcularFibonacci(n-1) + calcularFibonacci(n-2);
		}
		return resultado;
	}


	public static void main (String args[]){
		Recursividad recursividad = new Recursividad();
		System.out.println(recursividad.calcularSumatoria(4));
		System.out.println(recursividad.calcularSumatoria(5));
		System.out.println(recursividad.calcularSumatoria(-1));
		System.out.println(recursividad.calcularSumatoria(500));

		System.out.println(recursividad.calcularFibonacci(10));
	}

}