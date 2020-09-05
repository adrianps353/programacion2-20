import javax.swing.JOptionPane;

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

	public int calcularFactorial(int numero){
		//4! => 1 * 2 *3 * 4
		int resultado = 1;
		for (int i = 1; i <= numero; i++){
			resultado *= i;
		}
		return resultado;
	}

	public int calcularPotencia(int base, int exponente){
		// b=2 e=4 => 2*2*2*2 
		int resultado = 1;
		for(int i = 0 ; i < exponente; i++){
			resultado *= base;
		}
		return resultado;
	}

	public double calcularCoseno(int x, int n){
		double resultado = 1;
		int contador = 2;
		int signo = -1;
		if(n%2!=0){
			n++;
		}
		while(contador <= n){
			double numerador = (double) calcularPotencia(x, contador);
			double denominador = (double) calcularFactorial(contador);
			double fraccion = signo * numerador / denominador;
			resultado += fraccion;
			contador += 2;
			signo *= -1; 
		}
		return resultado;
	} 


	public int obtenerCantidadDeDigitos(int numero){
		int cantidad = 0;
		while (numero != 0){
			cantidad++;
			numero = numero / 10;
		}
		return cantidad;
	}

	public boolean calcularArmstrong(int numero){
		int cantidad = obtenerCantidadDeDigitos(numero);
		int numeroTemporal = numero;
		int resultado = 0;
		while(numeroTemporal != 0){
			int digito = numeroTemporal%10;
			resultado += calcularPotencia(digito, cantidad);
			numeroTemporal /= 10;
		}
		return resultado == numero;
	}

	public void imprimirNumerosArmstrong(int limSup){
		for(int i = 1; i < limSup; i++){
			if(calcularArmstrong(i)){
				System.out.println("El numero "+i+ " es de Armstrong");
			}
		}
	}

	public void imprimirMayorYMenor(){
		Interfaz interfaz = new Interfaz();
		int cantidad = interfaz.solicitarNumeroEntero("Digite la cantidad de numeros que desea ingresar");
		if (cantidad > 0){
			int numero = interfaz.solicitarNumeroEntero("Digite el primer numero");
			int mayor = numero;
			int menor = numero;
			for(int i = 1; i < cantidad; i++){
				numero = interfaz.solicitarNumeroEntero(""+ (i+1) + " Digite el siguiente numero:");
				if(numero > mayor){
					mayor = numero;
				}
				if(numero < menor){
					menor = numero;
				}
			}
			String resultados = "Mayor: "+ mayor + ", menor: "+ menor;
			System.out.println(resultados);
			JOptionPane.showMessageDialog(null, resultados, "Resultados", 1);
		}
	}

	public static void main (String [] args){
		Calculadora calcu1 = new Calculadora();
		//System.out.println("5: "+ calcu1.esPrimo(5));
		//System.out.println("6: "+ calcu1.esPrimo(6));
		System.out.println(calcu1.calcularFactorial(5));
		System.out.println(calcu1.calcularPotencia(2,4));
		calcu1.imprimirNumerosArmstrong(500000);
		calcu1.imprimirMayorYMenor();
	}

}