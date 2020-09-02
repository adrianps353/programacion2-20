public class EstructurasRepeticionG6{
	
	// Ejemplo cómo elevar 2 a la 10
	// Vamos a retornr el resultado final del método


	// while
	// do-while
	// for
	public int elevarWhile(){
		int resultado = 1;
		int exponente = 0;
		System.out.println("Inicio ElevarWhile");
		while(exponente < 10){
			resultado *= 2;
			System.out.println("Resultado: " +resultado+" Exponente: "+ exponente);
			exponente++;
		}
		System.out.println("Fin ElevarWhile");
		return resultado;
	}

	public int elevarDoWhile(){
		int resultado = 1;
		int exponente = 0;
		System.out.println("Inicio ElevarDoWhile");
		do{
			resultado *= 2;
			System.out.println("Resultado: " +resultado+" Exponente: "+ exponente);
			exponente++;
		}while(exponente < 10);
		System.out.println("Fin ElevarDoWhile");
		return resultado;
	}

	public int elevarFor(){
		int resultado = 1;
		System.out.println("Inicio ElevarFor");
		for (int exponente = 0; exponente < 10; exponente++){
			resultado *= 2;
			System.out.println("Resultado: " +resultado+" Exponente: "+ exponente);
		}
		System.out.println("Fin ElevarFor");
		return resultado;
	}

	public int productoria(	int limInf, int limSup){
		int resultado = 1;
		for (int i = limInf; i <= limSup; i++){
			resultado *= i;
		}
		return resultado;
	}

	

	public static void main (String args[]){
		EstructurasRepeticionG6 estructuraRepeticionInstancia = new  EstructurasRepeticionG6()	;
		System.out.println( estructuraRepeticionInstancia.elevarWhile());
		System.out.println( estructuraRepeticionInstancia.elevarDoWhile());
		System.out.println( estructuraRepeticionInstancia.elevarFor());
		System.out.println(estructuraRepeticionInstancia.productoria(5,9));
		System.out.println(estructuraRepeticionInstancia.productoria(5,6));
		System.out.println(estructuraRepeticionInstancia.productoria(1,5));
		System.out.println(estructuraRepeticionInstancia.productoria(1,6));
	}

}