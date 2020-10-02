public class OperacionesDeMatrices{
	
	public int calcularProductoPunto(int [] a, int [] b){
		int resultado = 0;
		if (a.length == b.length){
			for(int i = 0; i < a.length ; i++){
				resultado += (a[i] * b[i]);
			}
		}
		return resultado;
	}

	public int [] obtenerColumna(int[][] matriz, int numeroColumna)
	{
		int [] resultado = new int [matriz.length];
		for (int i = 0; i < matriz.length; i++){
			resultado[i] = matriz[i][numeroColumna];
		}
		return resultado;
	}

	public int [][] multiplicar(int [][] matrizA, int [][] matrizB){
		int [][] resultado = null;
		if (matrizA[0].length == matrizB.length){
			resultado = new int[matrizA.length][matrizB[0].length];
			for (int f = 0 ; f < resultado.length; f++){
				for (int c = 0; c < resultado[f].length; c++){
					int [] columna = obtenerColumna(matrizB,c);
					resultado[f][c] = calcularProductoPunto(matrizA[f], columna);
				}
			}

		}
		return resultado;
	}

	public void imprimir(int [] arreglo){
		for (int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();
	}

	public void imprimir(int [][] matriz){
		for (int f = 0; f< matriz.length; f++){
			for(int c = 0 ; c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}



	public static void main (String [] args){
		int [] arreglo1 = {1,0,2};
		int [] arreglo2 = {3,2,1};
		// Producto punto del arreglo1 y arreglo2 => 5
		OperacionesDeMatrices instanciaMatriz = new OperacionesDeMatrices();
		int productoPunto = instanciaMatriz.calcularProductoPunto(arreglo1, arreglo2);
		System.out.println("El producto punto es: " + productoPunto);

		int [][] matriz1 = {{1,0,2}, {-1,3,1}};
		int [][] matriz2 = {{3,1},{2,1},{1,0}};

		instanciaMatriz.imprimir(instanciaMatriz.obtenerColumna(matriz1,0));// [1,-1]

		int [][] matrizMultiplicada = instanciaMatriz.multiplicar(matriz1, matriz2);
		instanciaMatriz.imprimir(matrizMultiplicada);
	}




}