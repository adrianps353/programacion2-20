public class Banco{
	// Clase para hacer una prueba con un if

	private int tipoCambio;

	public Banco(){
		tipoCambio = 594;
	}

	public Banco(int tipoCambioParametro){
		tipoCambio = tipoCambioParametro;
	}

	// Uno quiere comprar un producto de 350 dolares
	// Y hay 2 monedas colones y dolares
	public boolean tieneDineroParaComprarElProducto(double dolares, int colones){
		boolean puedoComprar = false;
		if ((dolares + colones/tipoCambio) >= 350){
			puedoComprar = true;
		}
		return puedoComprar;
	}

	public static void main (String args[]){
		Banco banco1 = new Banco();
		System.out.println("Puede comprar: "+  banco1.tieneDineroParaComprarElProducto(250, 90000) );
	}

}