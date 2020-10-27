public class ArregloDinamico{
	
	// arreglo int/char/strings
	private int [] arreglo;

	public ArregloDinamico(int tam){
		if(tam > 0){
			arreglo = new int[tam];	
		}
		else{
			arreglo = new int [0];
		}
	}

	// agregar celdas
	public void agregarCeldas(int celdas){
		if (celdas > 0){
			int [] copia = new int [celdas + arreglo.length];
			for (int i = 0 ; i  < arreglo.length; i++){
				copia[i] = arreglo[i];
			}
			arreglo = copia;
		}
	}

	// quitar celdas
	public void quitarCeldas(int celdas){
		if(celdas > 0 && celdas < arreglo.length){
			int [] copia =  new int [arreglo.length - celdas];
			for (int i = 0 ; i  < copia.length; i++){
				copia[i] = arreglo[i];
			}
			arreglo = copia;
		}
	}
	

	// asignar celda
	public boolean setCelda(int indice, int valor){
		boolean asignado = false;
		if (indice >= 0 && indice < arreglo.length){
			arreglo[indice] = valor;
			asignado = true;
		}
		return asignado;
	}
	// retornar celda
	public int getCelda(int indice){
		int resultado = 0;
		if (indice >= 0 && indice < arreglo.length){
			resultado = arreglo[indice];
		}
		return resultado;
	}

	// imprimir (retornar un string con los datos)

	public String toString(){
		String contenido = "";
		for (int i = 0 ; arreglo != null && i < arreglo.length; i++){
			contenido += (arreglo[i]+" ");
		}
		return contenido;
	}

	public static void main (String [] args){
		int [] arreglo = new int [5];
		System.out.println(arreglo);

		ArregloDinamico arregloInstancia = new ArregloDinamico(5);
		System.out.println(arregloInstancia);		
		System.out.println(arregloInstancia.setCelda(3, 12));
		System.out.println(arregloInstancia.setCelda(0, 6));
		System.out.println(arregloInstancia.setCelda(-10, 6));
		System.out.println(arregloInstancia);
		System.out.println(arregloInstancia.getCelda(0));	

		arregloInstancia.agregarCeldas(5);
		System.out.println(arregloInstancia);
	}
}