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
}