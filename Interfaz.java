import javax.swing.JOptionPane;
public class Interfaz{
	
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