public class OperacionesMatrices{
	
	public int calcularProductoPunto(int [] a, int [] b){
		int resultado = 0;
		for (int i = 0 ; i < a.length; i++){
			resultado += (a[i]*b[i]);
		}
		return resultado;
	}

	public int [] obtenerColumna (int [][] matriz, int columna){
		int [] resultado = new  int [matriz.length];
		for (int i = 0 ; i < matriz.length ; i ++){
			resultado[i] = matriz[i][columna];
		}
		return resultado;
	}

	public void imprimir(int [][] matriz){
		for(int f = 0 ; f < matriz.length; f++){
			for(int c = 0; matriz[f] != null && c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void imprimir(int [] arreglo){
		for(int f = 0 ; f < arreglo.length; f++){
			System.out.print(arreglo[f] + "\t");
		}
		System.out.println();
	}

	public int [][] multiplicar (int [][] m1, int [][] m2){
		int [][] resultado = null;
		if (m1[0].length == m2.length){
			resultado = new int [m1.length][m2[0].length];
			for (int f = 0 ; f < resultado.length; f++){
				for (int c = 0 ; c < resultado[f].length ; c++){
					resultado[f][c] = calcularProductoPunto(m1[f], obtenerColumna(m2, c));
				}
			}
		}
		return resultado;
	}




	public static void main (String[] args){
		OperacionesMatrices om = new OperacionesMatrices();
		int [][] m1 = {{1,0,2}, {-1,3,1}};
		int [][] m2 = {{3,1},{2,1},{1,0}};
		om.imprimir(om.obtenerColumna(m1, 1));
		om.imprimir(om.obtenerColumna(m2, 1));
		om.imprimir(om.multiplicar(m1,m2));
	}



}