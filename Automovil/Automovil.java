public class Automovil{
		
	private int velocidad;

	public Automovil(int velocidadParametro){
		velocidad = velocidadParametro;
	}

	private int cambioVelocidad(){
		return 15;
	}

	public void acelerar(){
		velocidad = velocidad + cambioVelocidad();
	}

	public void frenar(){
		velocidad = velocidad - 5;
	}

	public int getVelocidad(){
		return velocidad;
	}




}