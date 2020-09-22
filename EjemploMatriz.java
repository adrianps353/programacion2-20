public class EjemploMatriz{

	public void imprimir(int [][] matriz){
		for(int f = 0 ; f < matriz.length; f++){
			for(int c = 0; matriz[f] != null && c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void imprimirArreglo(int [] arreglo){
		for (int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();	
	}

	public int [] obtenerFila(int [][] matriz, int f){
		int [] resultado = null;
		if (f >= 0 && f < matriz.length){
			resultado = matriz[f];
		}
		return resultado;
	}

	// 3 * 4 base 2
	// 2  4  6  8
	// 10 12 14 16
	// 18 20 22 24
	public int[][] crearMatrizMultiplos(int filas, int columnas, int base){
		int [][] resultado = null;
		int contador = 1;
		if (filas > 0 && columnas > 0){
			resultado = new int[filas][columnas];
			for (int f = 0 ; f < resultado.length; f++){
				for (int c = 0; c < resultado[f].length; c++){
					resultado[f][c] = base * contador;
					contador++;
				}
			}
		}
		return resultado;
	}

	public int[][] crearTablaMultiplicar(int filas, int columnas, int base){
		int [][] resultado = null;
		if (filas > 0 && columnas > 0){
			resultado = new int[filas][columnas];
			for (int f = 0 ; f < resultado.length; f++){
				for (int c = 0; c <  resultado[f].length; c++){
					resultado[f][c] = (f+1)*(c+1);
				}
			}
		}
		return resultado;
	}


	public static void main(String [] args){
		EjemploMatriz em = new EjemploMatriz();
		int [][] matriz = new int [10][5];
		/*
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
			0	0	0	0	0	
		*/
		em.imprimir(matriz);

		matriz[1][2] = 12;
		em.imprimir(matriz);

		int [][] matrizMultiplos = em.crearTablaMultiplicar(10,8,1); 
		em.imprimir(matrizMultiplos);

		// 1 2 3 
		// 4 5 6
		// 7 8 9
		// 10 11 12
		// 13 14 15

		em.imprimir(em.crearMatrizMultiplos(5,5,2));
		
		
		int [] arreglo = {1,3,5,7};

		int [][] matrizExtension = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		em.imprimir(matrizExtension);

		int [][] matrizExtension2 = {
			{1,2,3,4,5},
			{4,5},
			{7,8,9}
		};
		em.imprimir(matrizExtension2);

		int [][] matriz2 = new int [5][];
		matriz2[0] = new int [4];
		matriz2[1] = new int [6];
		matriz2[2] = new int [2];
		matriz2[3] = new int [10];
		

		em.imprimir(matriz2);

		arreglo = em.obtenerFila(matrizExtension2, 0);
		em.imprimirArreglo(arreglo);

		arreglo = em.obtenerFila(matrizExtension2, 1);
		em.imprimirArreglo(arreglo);

		arreglo = em.obtenerFila(matrizExtension2, 2);
		em.imprimirArreglo(arreglo);

		arreglo = em.obtenerFila(matrizExtension2, 3);
		if (arreglo != null)
			em.imprimirArreglo(arreglo);
	}	
}