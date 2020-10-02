public class MatrizG9{
	
	public void imprimir(char [][] matriz){
		for (int f = 0; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void imprimir(int [][] matriz){
		for (int f = 0; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public int[][] crearMatrizNumerosConsecutivos(int filas, int columnas){
		int [][] resultado = null;
		if (filas > 0 && columnas > 0){
			resultado = new int[filas][columnas];
			int contador = 1;
			for (int f = 0 ; f < resultado.length ; f++){
				for (int c = 0; c < resultado[f].length; c++){
					resultado[f][c] = contador;
					contador++;
				}
			}
		}
		return resultado;
	}

	// a b c
	// d e f
	public char [][] crearMatrizLetras(int filas, int columnas){
		char [][] matriz = new char [filas][columnas];
		char [] letra = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int contador = 0;
		for(int f = 0; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				matriz[f][c] = letra[contador%letra.length];
				contador++;
			}
		}
		return matriz;
	}

	public char [][] crearMatrizLetrasV2(int filas, int columnas){
		char [][] matriz = new char [filas][columnas];
		int letraEntero = 0;
		for(int f = 0; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				// Son 26 letras
				// % 26 -> 0 - 25
				// ? [65 , 65 + 26 [
				matriz[f][c] = (char)(letraEntero%26 + 65);
				letraEntero++;
			}
		}
		return matriz;
	}

	public static void main(String [] args){
		MatrizG9 instanciaMatriz = new MatrizG9();
		// 3 formas de declarar e inicializar matrices
		int [] arreglo = new int [3];
		// 0 0 0
		int [][] matriz = new int [3][6];
		// 0 0 0 0 0 0
		// 0 0 0 0 0 0
		// 0 0 0 0 0 0
		instanciaMatriz.imprimir(matriz);


		matriz[1][3] = 8;
		// 0 0 0 0 0 0
		// 0 0 0 8 0 0
		// 0 0 0 0 0 0
		instanciaMatriz.imprimir(matriz);
		
		matriz[0][1] = 6;
		// 0 6 0 0 0 0
		// 0 0 0 8 0 0
		// 0 0 0 0 0 0
		instanciaMatriz.imprimir(matriz);
		int valor = matriz[1][3];
		// valor contiene el número 8

		int [][] matrizConsecutivos = instanciaMatriz.crearMatrizNumerosConsecutivos(4,12);
		if (matrizConsecutivos != null)
			instanciaMatriz.imprimir(matrizConsecutivos);



		int [] arregloExtension = {1,2,3,4};

		int [][] matrizExtension = {
			{1,2,3},
			{2,3,4,5},
			{5,6}
		};

		instanciaMatriz.imprimir(matrizExtension);

		int [][] matriz2 = new int [4][];
		// [null,null,null,null]
		matriz2[0] = new int [5];
		matriz2[1] = new int [3];
		matriz2[2] = new int [7];
		matriz2[3] = new int [9];
		instanciaMatriz.imprimir(matriz2);


		char [][] miMatrizDeLetras =  instanciaMatriz.crearMatrizLetras(6,5);
		instanciaMatriz.imprimir(miMatrizDeLetras);


		int a = 66;
		char c = (char)a;
		System.out.println(c);

		miMatrizDeLetras =  instanciaMatriz.crearMatrizLetrasV2(6,7);
		instanciaMatriz.imprimir(miMatrizDeLetras);



	}


}