public class AlgoritmosOrdenamiento{

	public void imprimir(int [] arreglo){
		for (int i = 0; i < arreglo.length ; i++){
			System.out.print( arreglo[i] + " ");
		}
		System.out.println();
	}

	public int [] clonar (int [] arreglo){
		int [] resultado = new int[arreglo.length];
		for (int i = 0 ; i < arreglo.length; i++){
			resultado[i] = arreglo[i];
		}
		return resultado;
	}

	public int [] intercambiar (int [] arreglo, int i, int j){
		int temporal = arreglo[i];
		arreglo[i] = arreglo[j];
		arreglo[j] = temporal;
		return arreglo;
	}

	public int [] ordernarSeleccion(int [] arreglo){
		int [] copia = clonar(arreglo);
		for (int i = 0; i < copia.length; i++){
			for(int j = i+1; j < copia.length; j++){
				if(copia[i] > copia[j]){
					copia = intercambiar(arreglo, i, j);
				}
			}
		}
		return copia;
	}

	public int [] ordenarBurbuja (int [] arreglo){
		int [] copia = clonar(arreglo);
		int tamanio = copia.length;
		for (int i = 0 ; i < tamanio; i++){
			for (int j = 1; j < tamanio-i; j++){
				if (copia[j-1] > copia[j]){
					copia = intercambiar(copia, j-1,j);	
				}
			}
		}
		return copia;
	}


	public int [] ordenarInsercion (int [] arreglo){
		int [] copia = clonar(arreglo);
		for (int i = 1; i < arreglo.length; i++){
			int valor = copia[i];
			int contador = i-1;
			while(contador >= 0 && copia[contador] > valor){
				copia[contador+1] = copia[contador];
				contador--;
			}
			copia[contador+1] = valor;
		}
		return copia;
	}

	public static void main (String args []) {
		int [] arreglo = {1,4,2,7,9,0,6,100,-4,10,50,100,6,66,0,34,-10};
		AlgoritmosOrdenamiento ao = new AlgoritmosOrdenamiento();
		int [] ordenadoSeleccion = ao.ordernarSeleccion(arreglo);
		ao.imprimir(ordenadoSeleccion);

		int [] ordenadoBurbuja = ao.ordenarBurbuja(arreglo);
		ao.imprimir(ordenadoBurbuja);

		int [] ordernadoInsercion = ao.ordenarInsercion(arreglo);
		ao.imprimir(ordernadoInsercion);
	}

}