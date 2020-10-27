public class ListaSimplementeEnlazada{
	
	private Nodo primero; // puntero al primer nodo de la lista

	private class Nodo{ // Contiene un valor y el puntero al siguiente nodo
		private int valor;
		private Nodo siguiente;

		public Nodo(int valor){
			this.valor = valor;
			this.siguiente = null;
		}

		public String toString(){
			return "Nodo: "+ this.valor;
		}
	}

	public ListaSimplementeEnlazada(){
		this.primero = null;
	}

	public void agregarAlInicio(int elemento){
		Nodo nuevo = new Nodo(elemento);
		Nodo primeroViejo = this.primero;
		nuevo.siguiente = primeroViejo;
		this.primero = nuevo;
	}

	public void agregarAlFinal(int elemento){
		Nodo nuevo = new Nodo(elemento);
		if(this.primero == null){// La lista está vacía
			this.primero = nuevo;
		}
		else{ // Iterar hasta el último elemento y actualizar el siguiente
			Nodo actual = this.primero;
			while(actual.siguiente != null){
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}

	public boolean setValor(int posicion, int valor){
		int posicionActual = 0;
		Nodo actual = this.primero;
		boolean asignado = false;

		if(posicion >= 0){
			while(actual != null && posicionActual != posicion){
				actual = actual.siguiente;
				posicionActual++;
			}
			if (actual != null){
				actual.valor = valor;
				asignado = true;
			}
		}

		return asignado;
	}

	public String toString(){
		String contenido = "";
		Nodo actual = this.primero;
		while(actual != null){
			String valor = actual.toString();
			contenido += valor + "\n";
			actual = actual.siguiente;
		}
		return contenido;
	}

	public static void main (String [] args){
		ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
		lista.agregarAlInicio(3);
		lista.agregarAlInicio(2);
		lista.agregarAlInicio(1);
		lista.agregarAlInicio(10);
		System.out.println(lista);
		lista.agregarAlFinal(6);
		lista.agregarAlFinal(7);
		lista.agregarAlFinal(8);
		System.out.println(lista);

		lista.setValor(2,1337);
		System.out.println(lista);

		lista.setValor(200,1337);

	}

}