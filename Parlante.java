public class Parlante{
		
	private int volumen; // 1-100
	private boolean estado;// true false

	public void setVolumen(int volumen){
		this.volumen = volumen;
	}

	public void setEstado(boolean estadoParametro){
		estado = estadoParametro;
	}

	public int getVolumen(){
		return volumen;
	}

	public boolean getEstado(){
		return estado;
	}
}
