import javax.swing.JOptionPane;
public class Interfaz{
	
	public double solicitarNumeroReal(String titulo){
	
		String numeroHilera = JOptionPane.showInputDialog(titulo);
		double numero = 0;
		try{
			numero = Double.parseDouble(numeroHilera);
		}
		catch(NumberFormatException exception){
			System.err.println("Ocurrió un error al convertir el número: " + numeroHilera);
		}
		return numero;
	}

	public int solicitarNumeroEntero(String titulo){
		int numero;	
		String dato = JOptionPane.showInputDialog(titulo);
		try{
			numero = Integer.parseInt(dato);
		}
		catch(NumberFormatException e){
			System.err.println("El número digitado es inválido");
			numero = 0;
		}
		return numero;
	}


}