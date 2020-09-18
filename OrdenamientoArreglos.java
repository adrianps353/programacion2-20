public class OrdenamientoArreglos{
	
	public void imprimir (int [] arreglo){
		int contador = 0;
		while(contador < arreglo.length){
			System.out.print(arreglo[contador] + " ");
			contador++;
		}
		System.out.println();
	}

	public int [] clonar (int [] arreglo){
		int [] copia = new int[arreglo.length];
		for (int i = 0 ; i < copia.length; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}

	public int[] intercambiar(int [] arreglo, int i, int j){
		int temporal = arreglo[i];
		arreglo[i] = arreglo[j];
		arreglo[j] = temporal;
		return arreglo;
	}

	public int[] ordenarSeleccion(int[] parametro){
		int [] arreglo = clonar(parametro);
		for (int i = 0; i < arreglo.length; i++){
			for (int j = i+1 ; j < arreglo.length; j++){
				if(arreglo[i] > arreglo[j]){
					arreglo = intercambiar(arreglo,i,j);
				}
			}
		}
		return arreglo;
	}

	public int [] ordenarBurbuja(int[] parametro){
		int [] arreglo = clonar(parametro);
		for (int i = 0 ; i < arreglo.length; i++){
			for (int j = 1; j < arreglo.length - i ; j++){
				if(arreglo[j-1] > arreglo[j]){
					arreglo = intercambiar(arreglo,j-1,j);
				}
			}
		}
		return arreglo;
	}


	public int[] ordenarInsercion(int[] parametro){
		int [] arreglo = clonar(parametro);
		for (int i = 1 ; i < arreglo.length; i++){
			int valor = arreglo[i];
			int contador = i-1;
			while(contador >= 0 && arreglo[contador] > valor){
				arreglo[contador+1] = arreglo[contador];
				contador--;
			}
			arreglo[contador+1] = valor;
		}
		return arreglo;
	}


	public static void main (String [] args){
		int [] numeros = {9,8,90,1,0,6,5,3,2,1,1,3,45,6000,100,-100,90,100,101,34,2};
		OrdenamientoArreglos oa = new OrdenamientoArreglos();
		oa.imprimir(numeros);
		int [] ordenadoSeleccion = oa.ordenarSeleccion(numeros);
		oa.imprimir(ordenadoSeleccion);
		
		oa.imprimir(oa.ordenarBurbuja(numeros));
		oa.imprimir(oa.ordenarInsercion(numeros));
	}

}