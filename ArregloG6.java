public class ArregloG6{

	public void imprimir(int [] arreglo){
		for (int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();
	}


	public int sumar (int numero){
		numero = numero + 10;
		return numero;
	}

	public void sumarArreglo(int [] arreglo){
		arreglo[0] = arreglo[0] + 10; 
	}

	public int [] clonar (int [] arreglo){
		int [] copia = new int [arreglo.length];
		for (int i = 0 ; i < copia.length; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}


	public int [] intercambiarElementos(int [] arreglo, int pos1, int pos2){
		int [] copia = clonar(arreglo);
		if (pos1 >= 0 && pos1 < copia.length && pos2 >= 0 && pos2 < copia.length){
			int temporal = copia[pos1];
			copia[pos1] = copia[pos2];
			copia[pos2] = temporal;	
		}
		return copia;
		
	}



	public static void main (String [] args){
		System.out.println( "args.length "+ args.length);
		int multiplicacion = 1;
		for (int i = 0 ; i < args.length; ++i){
			multiplicacion *= Integer.parseInt(args[i]);
		}
		System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);
		int [] arreglo = new int [30];
		ArregloG6 instancia = new ArregloG6();
		System.out.println(arreglo);		
		instancia.imprimir(arreglo);
		arreglo[4] = 61;
		instancia.imprimir(arreglo);
		int x = arreglo[4];
		System.out.println(arreglo[4]);
		System.out.println(x);
		for (int i = 0 ; i < arreglo.length; i++){
			arreglo[i] = 2*i+7;
		}
		instancia.imprimir(arreglo);
		int [] arreglo2 = {1,3,5,7,9};
		instancia.imprimir(arreglo);



		// Paso por copia, paso por referencia

		int numero = 45;
		System.out.println(instancia.sumar(numero));
		System.out.println(numero);

		int [] arreglo3 = {3,5,8};
		int [] copia = instancia.clonar(arreglo3);
		instancia.sumarArreglo(copia);
		instancia.imprimir(arreglo3);
		instancia.imprimir(copia);


		int [] arreglo4 = {1,10,100,1000};
		int[] arreglo4Copia = instancia.intercambiarElementos(arreglo4, 0,2);
		instancia.imprimir(arreglo4);
		instancia.imprimir(arreglo4Copia);

	}
}