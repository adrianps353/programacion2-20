import javax.swing.JOptionPane;
public class PruebaCalculadora{
	
	public static void main(String [] args){
		Calculadora calcu1 = new Calculadora();
		Interfaz interfaz1 = new Interfaz();

		String titulo = "Digite un numero real que se llama numero 1";
		String titulo2 = "Digite otro numero real que vamos a llamar numero 2 de forma arbitraria";

		double numero1 = interfaz1.solicitarNumeroReal(titulo);
		double numero2 = interfaz1.solicitarNumeroReal(titulo2);
		double numero3 = interfaz1.solicitarNumeroReal("Digite el lado");
		double numero4 = interfaz1.solicitarNumeroReal("Digite el ancho");


		/*String numeroHilera1 = JOptionPane.showInputDialog("Digite un numero");
		double numero1 = 0;
		try{
			numero1 = Double.parseDouble(numeroHilera1);
		}
		catch(NumberFormatException exception){
			System.err.println("Ocurrió un error al convertir el número: " + numeroHilera1);
		}

		String numeroHilera2 = JOptionPane.showInputDialog("Digite otro numero");
		double numero2 = 0;
		try{
			numero2 = Double.parseDouble(numeroHilera2);
		}
		catch(NumberFormatException exception){
			System.err.println("Ocurrió un error al convertir el número: " + numeroHilera2);
		}*/


		double valor1 = calcu1.multiplicar(numero1,numero2);
		System.out.println("El resultado es: " + valor1);
	}


}