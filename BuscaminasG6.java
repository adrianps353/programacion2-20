public class BuscaminasG6{
	private int [][] tablero;
	private int minas;

	public BuscaminasG6(int filas, int columnas, int minas){
		tablero = new int[filas][columnas];
		this.minas = minas;
	}

	public void colocarMinas(){
		int minasColocadas = 0;
		while(minasColocadas < minas && minas < tablero.length*tablero[0].length){
			//sacar un numero aleatorio para las filas /
			//sacar un numero aleatorio para las columnas /
			//fijar si en esa celda ya hay una mina
			//Si hay no hago nada
			//Si no hay entonces? colocar la mina, minasColocadas + 1 :)
			int filaAleatoria = (int)(Math.random() * tablero.length);
			int columnaAleatoria = (int)(Math.random() * tablero[filaAleatoria].length);
			if(tablero[filaAleatoria][columnaAleatoria] == 0){
				tablero[filaAleatoria][columnaAleatoria] = -1;
				minasColocadas++;
			}
		}
	}

	public void colocarNumeros(){
		int [] corrimientoFilas = {-1, 0, 1, 0,-1, 1, 1,-1 };
		int [] corrimientoCols  = { 0, 1, 0,-1, 1, 1,-1,-1 };
		for (int f = 0 ; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				if (tablero[f][c] == -1){
					// Buscamos las 8 direcciones y sumamos 1 a la celda
					int contador = 0;
					while(contador < 8){
						int nuevaFila = f + corrimientoFilas[contador];
						int nuevaColumna = c + corrimientoCols[contador];
						if (nuevaFila >= 0 && nuevaFila < tablero.length && 
							nuevaColumna >= 0 && nuevaColumna < tablero[f].length &&
							tablero[nuevaFila][nuevaColumna] != -1){
							tablero[nuevaFila][nuevaColumna] += 1;
						}
						contador++;
					}
				}
			}
		}

	}

	public void imprimir(){
		for (int f = 0; f< tablero.length; f++){
			for(int c = 0 ; c < tablero[f].length; c++){
				System.out.print(tablero[f][c] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main (String [] args){
		BuscaminasG6 buscaminas = new BuscaminasG6(6,5,10);
		buscaminas.imprimir();
		buscaminas.colocarMinas();
		buscaminas.imprimir();
		buscaminas.colocarNumeros();
		buscaminas.imprimir();
	}
}