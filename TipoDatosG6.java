public class TipoDatosG6{
	public static void main (String [] args){
		System.out.println("Hoy es 24\\nde agosto\n\tdel 2020 \u0040\u0021");

		// Como crear variables
		// Tipo de dato (int, String, char, ...)
		// Nombre
		// = 
		// valor (literal)
		// ;
		String hilera1 = "Hola ";
		String hilera2 = "hoy es 24 de agosto";
		String hilera3 = hilera1 + hilera2;
		System.out.println(hilera3);

		double numero1 = 3.14;
		double resultado1 = numero1 * numero1;
		System.out.println(numero1);
		System.out.println(resultado1);

		String hilera4 = "5";
		System.out.println(hilera4 + 2);

		int numero2 = Integer.parseInt(hilera4);
		System.out.println(numero2 + 2);

		//Las siguientes dos líneas ocasionan un error ya que el 
		//String no se puede convertir a un número
		//String hilera5 = "3abc";
		//int numero3 = Integer.parseInt(hilera5);

		System.out.println(5/2);
		System.out.println(5/2.0);
		System.out.println(5.0/2);
		System.out.println((double)5/2);
		System.out.println((int)0.859999999999999999999999999999999999909999999999999999);

	}
}