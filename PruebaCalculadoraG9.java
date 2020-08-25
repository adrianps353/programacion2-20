public class PruebaCalculadoraG9{

	public static void main (String [] args){
		Calculadora calculadora1 = new Calculadora();
		Interfaz interfaz1 = new Interfaz();

		int num1 = interfaz1.solicitarNumeroEntero("Digite un numero");
		int num2 = interfaz1.solicitarNumeroEntero("Digite otro numero");
		int num3 = interfaz1.solicitarNumeroEntero("Digite otro numero mas");

		int mayor = calculadora1.obtenerElMayor(num1, num2, num3);
		System.out.println("El mayor es: "+ mayor);
	}


}