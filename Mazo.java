public class Mazo{

	private Carta [] cartas;

	public Mazo(){
		this.crearCartas();
	}

	public void revolver(){
		for(int i = 0 ; i < cartas.length; i++){
			int celdaAleatoria = (int)(Math.random()*52);
			Carta temporal = cartas[i];
			cartas[i] = cartas[celdaAleatoria];
			cartas[celdaAleatoria] = temporal;
		}
	}

	public void imprimir(){
		for (int i = 0 ; i < cartas.length; i++){
			cartas[i].imprimir();
		}
	}

	public void crearCartas(){
		cartas = new Carta [52];
		// ciclo que itere 13
		int contador = 0;
		for (int j = 0; j < 4; j++){
			for (int i = 1; i < 14; i++){
				Carta carta = new Carta(i, obtenerSimbolo(j));
				cartas[contador] = carta;
				contador++;
			}
		}
	}

	public String obtenerSimbolo(int valor){
		String resultado = "";
		switch(valor){
			case 0:
				resultado = "Corazones";
			break;
			case 1:
				resultado = "Diamantes";
			break;
			case 2:
				resultado = "Espadas";
			break;
			case 3:
				resultado = "Treboles";
			break;
		}
		return resultado;
	}


	public static void main(String args[]){
		Mazo mazo = new Mazo();
		mazo.imprimir();
		mazo.revolver();
		System.out.println();
		mazo.imprimir();
	}
}