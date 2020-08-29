public class EstructurasDeRepeticion{
	// while
	// do-while
	// for

	// imprimir pares desde el 2 hasta el 10
	public void imprimirWhile(){
		System.out.println("Inicio del método imprimirWhile");
		int n = 2;
		while(n <= 10){
			// bloque que se repita
			System.out.println(n);
			n += 2;
		}
		System.out.println("Fin del método imprimirWhile");
	}

	public void imprimirDoWhile(){
		System.out.println("Inicio del método imprimirDoWhile");
		int n = 2;
		do{
			System.out.println(n);
			n += 2;
		}while(n <= 10);
		System.out.println("Fin del método imprimirDoWhile");
	}

	public void imprimirFor(){
		System.out.println("Inicio del método imprimirFor");
		for (int n = 2; n <= 10; n +=2 ){
			System.out.println(n);
		}
		System.out.println("Fin del método imprimirFor");
	}


	public int sumarValoresWhile(int limInf, int limSup){
		int suma = 0;
		while(limInf <= limSup){
			suma += limInf;
			limInf++;
		}
		return suma;
	}

	public int sumarValoresDoWhile(int limInf, int limSup){
		int suma = 0;
		if (limInf <= limSup){
			do{
				suma += limInf;
				limInf++;
			}while(limInf <= limSup);
		}
		return suma;
	}

	public int sumarValoresFor(int limInf, int limSup){
		int suma = 0;
		for(int i = limInf; i <= limSup; i++){
			suma += i;
		}
		return suma;
	}


	public static void main (String [] args){
		EstructurasDeRepeticion repeticion = new EstructurasDeRepeticion();
		repeticion.imprimirWhile();
		repeticion.imprimirDoWhile();
		repeticion.imprimirFor();
	}
}