import javax.swing.JOptionPane;
public class PruebaManejoExcepciones{
	
	public static void main (String [] args){
		ManejoDeExcepciones manejoExcepcionesInstancia = new ManejoDeExcepciones();
		Interfaz interfaz = new Interfaz();
		int numero1 = interfaz.solicitarNumeroEntero("Digite el primer numero");
		int numero2 = interfaz.solicitarNumeroEntero("Digite otro mas");
		/*
		int numero1;	
		String dato1 = JOptionPane.showInputDialog("Digite un numero");
		try{
			numero1 = Integer.parseInt(dato1);
		}
		catch(NumberFormatException e){
			System.err.println("El número digitado es inválido");
			numero1 = 0;
		}

		String dato2 = JOptionPane.showInputDialog("Digite otro numero");
		int numero2 = 0;
		try{
			numero2 = Integer.parseInt(dato2);
		}
		catch(NumberFormatException e){
			System.err.println("El número digitado es inválido");
		}*/

		int suma = manejoExcepcionesInstancia.sumar(numero1,numero2);
		System.out.println(suma);
	}

}