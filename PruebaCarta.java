public class PruebaCarta{

	public static void main (String [] args){
		System.out.println("Carta 1");
		Carta carta1 = new Carta();
		carta1.imprimir();
		carta1.setNumero(10);
		carta1.imprimir();
		carta1.setSimbolo("Espadas");
		carta1.imprimir();
		System.out.println("\nUtilizando los métodos get:");
		String simboloCarta1 = carta1.getSimbolo();
		System.out.println("La variable simboloCarta1 es: " + simboloCarta1);
		int numeroCarta1 = carta1.getNumero();
		System.out.println("La variable numeroCarta1 es: " + numeroCarta1);


		System.out.println("\nCarta 2");
		Carta carta2 = new Carta();
		carta2.imprimir();

		System.out.println("\nCarta 3");
		Carta carta3 = new Carta(5, "Diamantes");
		carta3.imprimir();
	}
}