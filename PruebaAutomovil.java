public class PruebaAutomovil{
	public static void main (String [] args){
		Automovil nissan = new Automovil(67);
		int velocidadActual = nissan.getVelocidad();
		System.out.println("Nissan - Velocidad: " + velocidadActual);
		nissan.acelerar();
		System.out.println("Nissan - Velocidad: " + nissan.getVelocidad());
		nissan.frenar();
		System.out.println("Nissan - Velocidad: " + nissan.getVelocidad());

		Automovil fiat = new Automovil(54);
		fiat.acelerar();
		fiat.acelerar();
		System.out.println("Fiat - Velocidad: " + fiat.getVelocidad());



	}
}