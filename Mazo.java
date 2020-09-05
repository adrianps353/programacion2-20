public class Mazo{

	public Mazo(){
		this.crearCartas();
	}

	public void crearCartas(){
		// ciclo que itere 13
		for (int j = 0; j < 4; j++){
			for (int i = 1; i < 14; i++){
				Carta carta = new Carta(i, obtenerSimbolo(j));
				carta.imprimir();
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
	}
}