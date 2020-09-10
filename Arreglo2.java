public class Arreglo2{

	public int [] duplicar(int [] arreglo){
		int [] copia = new int [arreglo.length];
		for (int i = 0 ; i < copia.length; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}

	public int modificarPrimitivo(int numero){
		numero = numero + 10;
		return numero;
	}
	
	public void imprimir(int [] arreglo){
		for (int i = 0; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public void modificarArreglo(int [] miArreglo){
		miArreglo[0] = 625;
	}

	public int [] intercambiarElementos(int [] refArreglo, int indice1, int indice2){
		int [] arreglo = duplicar(refArreglo);
		if(indice1 >= 0 && indice1 < arreglo.length && indice2 >=0 && indice2 < arreglo.length){
			int temporal = arreglo[indice1];
			arreglo[indice1] = arreglo[indice2];
			arreglo[indice2] = temporal;
		}
		return arreglo;
	}

	public int buscarElemento(int [] arreglo, int elemento){
		int posicion = -1;
		for(int i = 0 ; i < arreglo.length; i++){
			if (arreglo[i] == elemento){
				posicion = i;
			}
		}
		return posicion;
	}

	public static void main (String [] args){
		int [] arreglo1 = {10,20,30,40};
		int [] vector2 = new int [100];

		Arreglo2 instanciaArreglo = new Arreglo2();
		instanciaArreglo.imprimir(arreglo1);
		int[] copiaArreglo1 = instanciaArreglo.duplicar(arreglo1);

		instanciaArreglo.modificarArreglo(copiaArreglo1);
		instanciaArreglo.imprimir(copiaArreglo1);
		instanciaArreglo.imprimir(arreglo1);

		int numero = 40;
		System.out.println(numero);
		int valorSuma = instanciaArreglo.modificarPrimitivo(numero);
		System.out.println(numero);
		System.out.println(valorSuma);


		int[] refIntercambio = instanciaArreglo.intercambiarElementos(arreglo1, 0, 2);
		instanciaArreglo.imprimir(arreglo1);
		instanciaArreglo.imprimir(refIntercambio);

		int pos1 = instanciaArreglo.buscarElemento(arreglo1, 20);
		int pos2 = instanciaArreglo.buscarElemento(arreglo1, 40);
		int [] ref2 = instanciaArreglo.intercambiarElementos(arreglo1, pos1, pos2);
		instanciaArreglo.imprimir(ref2);

	}
}