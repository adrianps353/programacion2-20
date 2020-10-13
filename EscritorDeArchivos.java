import java.io.*;

public class EscritorDeArchivos{

	private BufferedWriter escritor;
	private boolean estaAbierto;

	public EscritorDeArchivos(String ruta){
		abrir(ruta,true);
	}

	public EscritorDeArchivos(String ruta, boolean agregarAlFinal){
		abrir(ruta,agregarAlFinal);
	}

	public void abrir(String ruta, boolean agregarAlFinal){
		try{
			this.escritor = new BufferedWriter(new FileWriter(ruta, agregarAlFinal));
			this.estaAbierto = true;
		}	
		catch(IOException e){
			this.estaAbierto = false;
			System.err.println("Ocurrio un error al abrir el archivo: "+ e);
		}
	}

	public void cerrar(){
		if (estaAbierto){
			try{
				this.escritor.close();
			}
			catch(IOException e){
				System.err.println("Ocurrio un error al cerrar el archivo: "+ e);	
			}
		}
		estaAbierto = false;
	}

	public boolean escribir(String texto){
		boolean escrito = false;
		if(estaAbierto){
			try{
				escritor.write(texto);
				escrito = true;
			}
			catch(IOException e){
				System.err.println("Ocurrio un error al escribir en el archivo: "+ e);
			}
		}
		return escrito;
	}

	public static void main (String [] args){
		EscritorDeArchivos escritor = new EscritorDeArchivos("Prueba13Octubre.txt", false);
		escritor.escribir("Hola mundo\r\n");
		escritor.escribir("Hoy es 13 de octubre");
		escritor.cerrar();
	}

}
