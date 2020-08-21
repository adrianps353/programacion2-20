public class TipoDatos{
	
	public static void main(String [] argv){
		System.out.println("Hola mundo");
		System.out.println("Hola\n\tmundo");
		System.out.println("Hola \u0040 mundo");

		// Crear una variable:
		// Tipo dato (Primitivo o no primitivo)
		// Nombre de la variable
		// =
		// valor (literal)
		// ;
		String hilera = "Esta es mi variable llamada hilera";
		System.out.println(hilera);
		int numero1 = 12;
		System.out.println(numero1);
		int numero2 = numero1 * 10;
		System.out.println(numero2);
		System.out.println(numero1);
		numero1 = numero1 * 5; 
		System.out.println(numero1);


		String hilera2 = "10";
		System.out.println(hilera2);
		System.out.println(hilera2 + 2);
		int numero3 = Integer.parseInt(hilera2);
		System.out.println(numero3+2);

		//Descomentar las siguientes dos líneas 
		//provocará un error de ejecución en la línea 33
		//String hilera3 = "10a";
		//int numero4 = Integer.parseInt(hilera3);
		System.out.println("Operaciones matemáticas:");
		System.out.println(5/2);
		System.out.println(5/2.0);
		System.out.println(5.0/2);
		System.out.println((double)5/2);

		System.out.println(5%2);
		System.out.println(4%3);

	}

}