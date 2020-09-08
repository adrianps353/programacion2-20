public class Arreglo{
	

	public static void main (String [] args){

		System.out.println("args.length: "+ args.length);
		int suma = 0;
		for (int i = 0 ; i < args.length; i++){
			System.out.println(args[i]);
			suma += Integer.parseInt(args[i]);
		}
		System.out.println("La suma es: "+ suma);

		int [] arreglo = new int [10];
		System.out.println(arreglo);

		for (int i = 0 ; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();

		arreglo[4] = 125;

		for (int i = 0 ; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + "\t");
		}
		System.out.println();


		int valor = arreglo[4];
		System.out.println(valor);
		System.out.println(arreglo[4]);




	}


}