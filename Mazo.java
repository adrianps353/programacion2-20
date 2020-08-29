public class Mazo{
	// usar un for
	// usar un ciclo dentro de otro

	public Mazo(){
		for (int j = 0; j < 4 ; j++){
			for (int i = 1; i <= 13; i++){
				Carta carta = new Carta(i, this.retornarSimbolo(j));
				carta.imprimir();
			}	
		}
		/*
		for (int i = 1; i <= 13; i++){
			Carta carta = new Carta(i, "Espadas");
			carta.imprimir();
		}	
		for (int i = 1; i <= 13; i++){
			Carta carta = new Carta(i, "Diamantes");
			carta.imprimir();
		}
		for (int i = 1; i <= 13; i++){
			Carta carta = new Carta(i, "Corazones");
			carta.imprimir();
		}
		for (int i = 1; i <= 13; i++){
			Carta carta = new Carta(i, "Treboles");
			carta.imprimir();
		}*/
	}

	public String retornarSimbolo(int valor){
		String resultado = "";
		switch(valor){
			case 0:
				resultado = "Diamantes";
			break;
			case 1:
				resultado = "Corazones";
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