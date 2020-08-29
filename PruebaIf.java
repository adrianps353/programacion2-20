public class PruebaIf{
	
	public static void main (String[] args){
		double nota = 60;

		if (nota >= 67.5){
			System.out.println("El estudiante pasa el curso");
		}
		else{
			if (nota >= 57.5 && nota < 67.5){
				System.out.println("El estudiante va a ampliación");
			}
			else{
				System.out.println("El estudiante reprueba");
			}
		}

	}

}