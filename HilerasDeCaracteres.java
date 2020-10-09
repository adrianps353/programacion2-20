public class HilerasDeCaracteres{
	public static void main(String [] args){
		String hilera = "Hola mundo bonito";
		
		System.out.println("Ejemplo de index of");
		int indice = hilera.indexOf("Hol");
		System.out.println(indice);

		System.out.println("Ejemplo de split");
		String [] partes = hilera.split(" ");
		for(int i= 0 ; i < partes.length; i++){
			System.out.println("["+i+"] " +partes[i]);
		}

		System.out.println("Ejemplo de split Numero 2");
		partes = hilera.split("a");
		for(int i= 0 ; i < partes.length; i++){
			System.out.println("["+i+"] " +partes[i]);
		}

		System.out.println("hola.equals(hola): "+ "hola".equals("hola"));
		System.out.println("hOla.equals(hola): "+ "hOla".equals("hola"));
		System.out.println("HOLA.equalsIgnoreCase(hola): "+ "HOLA".equalsIgnoreCase("hola"));
		System.out.println("HOLA.compareTo(adios): "+ "HOLA".compareTo("adios"));
		System.out.println("hola.toUpperCase(): "+ "hola".toUpperCase());
		System.out.println("HOLA.toLowerCase(): "+ "HOLA".toLowerCase());
		System.out.println("      HOLA MUNDO     .trim(): "+ "     HOLA      MUNDO     ".trim());

		
	}
}