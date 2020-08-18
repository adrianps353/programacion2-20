public class Carta{
	// Atributos

	// Para definir un tipo de dato:
	// Declaramos el valor privado
	// Definir qué tipo de dato es
	// Definir un nombre a la variable (para identificarla)
	private int numero; // un atributo de tipo entero que contiene el número de la carta (9,7,J)
	private String simbolo; // un atributo de tipo String que contiene el simbolo (Corazones)

	public Carta(){
		numero = 3;
		simbolo = "Corazones";
	}

	public Carta(int numeroParametro, String simboloParametro){
		numero = numeroParametro;
		simbolo = simboloParametro;
	}



	public void setNumero(int numeroNuevo){
		numero = numeroNuevo;
	}

	public void setSimbolo(String nuevoSimbolo){
		simbolo = nuevoSimbolo;
	}

	public int getNumero(){
		return numero;
	}

	public String getSimbolo(){
		return simbolo;
	}

	// Declaración de un método:
	// 1. Si es publico o privado (accesible desde una instancia)
	// 2. Qué necesito que retorne el método
	// 3. Cómo se llama el método (como lo identificamos)
	// 4. Qué parámetros necesita (que necesita para que el método funcione)
	public void imprimir(){
		String contenidoDeLaCarta = "La carta es: ";
		contenidoDeLaCarta = contenidoDeLaCarta + numero + " de " + simbolo;
		System.out.println(contenidoDeLaCarta);
	}

}