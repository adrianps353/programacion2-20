public class Persona{
	
	private String nombre;
	private int edad;

	public Persona(){
		nombre = "desconocido";
		edad = 0;
	}

	public void bautizar(String nombre){
		this.nombre = nombre;
	}

	public void cumplirAnyos(){
		edad = edad + 1;
	}

	public void saludar(){
		System.out.println("Hola me llamo " + nombre + " y tengo " + edad + " años");
	}


}