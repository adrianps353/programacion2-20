public class PruebaPersona{
		
	public static void main(String args[]){

		Persona persona1 = new Persona();
		persona1.saludar();
		persona1.bautizar("Daniel");
		persona1.saludar();
		persona1.cumplirAnyos();
		persona1.cumplirAnyos();
		persona1.cumplirAnyos();
		persona1.cumplirAnyos();
		persona1.saludar();

		Persona persona2 = new Persona();
		persona2.bautizar("Eiran");
		persona2.cumplirAnyos();
		persona2.cumplirAnyos();
		persona2.saludar();

	}


}