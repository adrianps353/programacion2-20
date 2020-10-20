import javax.swing.*;
public class Ahorcado {
	
	private String palabraSecreta; //hola
	private String palabraUsuario; //?o??
	private Interfaz interfaz;
	private int intentos;

	public Ahorcado(String palabra){
		interfaz = new Interfaz();
		palabraSecreta = palabra;
		palabraUsuario = "";
		intentos = 5;
		for (int i = 0 ; i < palabra.length(); i++){
			palabraUsuario+="?";
		}
	}

	public void jugar(){
		// intentos
		// (ciclo) si tiene intentos puede jugar o si no ha ganado
			// pedir letra
			// buscar la letra
			// reemplazar el patron si está
			// si no está -1 intentos
		// gano? o perdio?
		while(intentos > 0 && palabraUsuario.indexOf("?") != -1){
			String letra = interfaz.solicitarHilera(this.toString() + "\nDigite una letra");
			boolean encontrada = this.buscarLetra(letra);
			if (!encontrada){
				intentos--;
			}
		}
		if(palabraUsuario.indexOf("?") == -1){
			// Gano :)
			JOptionPane.showMessageDialog(null,"Gano :)");
		}
		else{
			JOptionPane.showMessageDialog(null,"Perdió :(");
		}
	}

	public boolean buscarLetra(String busqueda){
		boolean encontrada = false;
		StringBuilder palabra = new StringBuilder(palabraUsuario);
		for (int i = 0 ; i < palabraSecreta.length(); i++){
			if (palabraSecreta.charAt(i) == busqueda.charAt(0)){
				palabra.replace(i,i+1, ""+busqueda.charAt(0));
				encontrada = true;
			}
		}
		palabraUsuario = palabra.toString();
		return encontrada;
	}

	public String toString(){
		String contenido = palabraSecreta + "\n" + palabraUsuario +
		"\nIntentos restantes: " + intentos;
		return contenido;
	}

	public static void main (String []args){
		String palabraV2 = "????";
		System.out.println(palabraV2.substring(0,1) + "o" + palabraV2.substring(2));
		// paralelepipedo
		// ??????????????
		StringBuilder palabra = new StringBuilder("paralelepipedo");
		for (int i = 0 ; i < palabra.length(); i++){
			if (palabra.charAt(i) == 'p'){
				palabra.replace(i,i+1, "_");
			}
		}
		System.out.println(palabra);
		while (palabra.indexOf("le") != -1){
			System.out.println(palabra.indexOf("le"));
			palabra.replace(palabra.indexOf("le"),palabra.indexOf("le")+2, "..");	
		}
		System.out.println(palabra);
		Ahorcado ahorcado = new Ahorcado("paralelepipedo");
		//System.out.println(ahorcado);
		//System.out.println(ahorcado.buscarLetra("p"));
		//System.out.println(ahorcado.buscarLetra("z"));
		//System.out.println(ahorcado);
		ahorcado.jugar();
	}
}