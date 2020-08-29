public class Bombillo{
	private int watts;// watts
	private boolean estado;// estado

	public void setEstado(boolean estadoParametro){
		estado = estadoParametro;
	}

	public void setWatts(int watts){
		this.watts = watts;
	}

	public int getWatts(){
		return watts;
	}

	public boolean getEstado(){
		return estado;
	}

}