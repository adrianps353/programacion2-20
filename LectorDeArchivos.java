import java.io.*;

public class LectorDeArchivos{
	private BufferedReader lector;
	private boolean estaAbierto;

	public LectorDeArchivos(String ruta){
		try{
			lector = new BufferedReader(new FileReader(ruta));
			estaAbierto = true;
		}
		catch(IOException e){
			estaAbierto = false;
			System.err.println("Ocurrio un error: "+ e);
		}
	}

	public void cerrar (){
		if (estaAbierto){
			try{
				lector.close();
			}
			catch(IOException e){
				System.err.println("Ocurrio un error @cerrar: "+ e);
			}
		}
		estaAbierto = false;
	}

	public String leerLinea(){
		String contenido = null;
		if(estaAbierto){
			try{
				contenido = lector.readLine();
			}
			catch(IOException e){
				System.err.println("Ocurrio un error @leerLinea: "+ e);
			}
		}
		return contenido;
	}

	public String leerArchivo(){
		// alguien que guarde la línea leída
		// ciclo que lea mientras línea leida no sea nula
		// concatenar al contenido la línea
		String contenido = "";
		if(estaAbierto){
			String linea = "";
			while((linea = leerLinea()) != null){
				contenido += linea;
				contenido += "\r\n";
			}
		}
		return contenido;
	}



	public static void main (String  [] args){
		LectorDeArchivos lector = new LectorDeArchivos("Carta.java");
		System.out.println(lector.leerArchivo());
		//System.out.println(lector.leerLinea());
		//System.out.println(lector.leerLinea());
		//System.out.println(lector.leerLinea());
		lector.cerrar();
	}
}