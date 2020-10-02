public class Matriz{
	// Calcular el producto punto
	// Obtener una columna
	// Obtener una fila
	// Validar si cantidad de col de m1 == cant. filas m2
	// Crear una matriz con las filas de m1 y col de m2
	// Recorrer la matriz de resultados y asignar el producto punto de filas m1 * col m2

	public int calcularProductoPunto(int [] a, int [] b){
		int resultado = 0;
		// operador ternario
		//int [] menor = (condicion) ? que asigno si la condicion true : que asigno si es false
		int [] menor = (a.length < b.length) ? a : b;
		for (int i = 0; i < menor.length; i++){
			resultado += (a[i]*b[i]);
		}
		return resultado;
	}

	public int [] obtenerColumna(int [][] matriz, int columna){
		int [] resultado = new int [matriz.length];
		for (int i = 0; i < matriz.length; i++){
			resultado[i] = matriz[i][columna];
		}
		return resultado;
	}

	public int [][] multiplicar(int [][] m1, int [][] m2){
		int [][] resultado = null;
		if(m1[0].length == m2.length){
			resultado = new int [m1.length][m2[0].length];
			for(int f = 0; f < resultado.length; f++){
				for (int c = 0; c <resultado[f].length; c++){
					resultado[f][c] = calcularProductoPunto(m1[f], obtenerColumna(m2,c));
				}
			}
		}
		return resultado;
	}

	public void imprimir(int [] arreglo){
		for (int  i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public void imprimir(int [][] matriz){
		for (int  f = 0 ; f < matriz.length; f++){
			for (int  c = 0 ; c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}


	public static void main (String args []){
		Matriz matriz = new Matriz();
		int [] arreglo1 = {1,0,2};
		int [] arreglo2 = {3,2,1};

		int productoPunto = matriz.calcularProductoPunto(arreglo1, arreglo2);
		System.out.println("Producto punto: "+ productoPunto);

		int [][] matrizA = {{1,0,2},{-1,3,1}};
		int [][] matrizB = {{3,1},{2,1},{1,0}};
		int [] columna = matriz.obtenerColumna(matrizB,0);
		matriz.imprimir(columna);

		matriz.imprimir(matriz.obtenerColumna(matrizB,1));

		matriz.imprimir(matriz.multiplicar(matrizA,matrizB));
	}

}