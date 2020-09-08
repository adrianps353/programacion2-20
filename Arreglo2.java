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

	}


}