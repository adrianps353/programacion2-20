public class ListaDoblementeEnlazada{
/*
-insertar elemento (posicion, valor) 

-eliminar elemento (valor) // con respecto a valores
 
-imprimir ascendentemente y descendentemente 

*/
	private Nodo cabeza; // puntero al primer nodo de la lista
	private Nodo cola; // puntero al ultimo nodo de la lista

	private class Nodo{ // Contiene un valor y los puntero al siguiente y anterior nodo
		private int valor;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo(int valor){
			this.valor = valor;
			this.siguiente = null;
			this.anterior = null;
		}

		public String toString(){
			return "Nodo: "+ this.valor;
		}
	}

	public ListaDoblementeEnlazada(){
			this.cabeza = null;
			this.cola = null;
	}

	public void agregarAlInicio(int elemento){
		Nodo nuevo = new Nodo(elemento);

		if(this.cabeza == null){ // La lista está vacía
			this.cabeza = nuevo;
			this.cola = nuevo;
		}
		else{
			Nodo cabezaVieja = this.cabeza;
			nuevo.siguiente = cabezaVieja;
			cabezaVieja.anterior = nuevo;
			this.cabeza = nuevo;
		}
	}

	public void agregarAlFinal(int elemento){
		Nodo nuevo = new Nodo(elemento);
		if(this.cabeza == null && this.cola == null){ // La lista está vacía
			this.cabeza = nuevo;
			this.cola = nuevo;
		}
		else{ // Iterar hasta el último elemento y actualizar los nodos
			Nodo colaVieja = this.cola;
			colaVieja.siguiente = nuevo;
			nuevo.anterior = colaVieja;

			this.cola = nuevo;
		}
	}

	// Agrega un nodo en la posicion pasada por el parametro
	public boolean agregarElemento(int posicion, int valor){
		int posicionActual = 0;
		Nodo actual = this.cabeza;
		boolean asignado = false;

		if(posicion >= 0){ // Entre si la posicion existe en la lista
			while(actual != null && posicionActual != posicion){
				actual = actual.siguiente;
				posicionActual++;
			}
			if (actual != null){
				if(actual == cola){ // 
					agregarAlFinal(valor);
					asignado = true;
				}else{
					Nodo nuevo = new Nodo(valor);
					Nodo siguienteViejo = actual.siguiente; // para no perder el resto de la lista
					siguienteViejo.anterior = nuevo;
					nuevo.siguiente = siguienteViejo;
					nuevo.anterior = actual;
					actual.siguiente = nuevo;

					asignado = true;
				}
			}
		}
		return asignado;
	}

	// elimina todos los elementos de la lista con el mismo valor
	// retorna el numero de elementos borrados de la lista
	public int eliminarElemento(int valor){
		int borrados = 0;
		Nodo actual = this.cabeza;

		while(actual != null){
			
			if (actual.valor == valor){

				if(actual == cabeza){ // borrado en cabeza
					Nodo cabezaVieja = cabeza;
					cabeza = cabeza.siguiente;
					cabeza.anterior = null;
					cabezaVieja.siguiente = null;
					cabezaVieja = null;
				} // borrado en cola
				else if(actual == cola){
					Nodo colaVieja = cola;
					cola = cola.anterior;
					cola.siguiente = null;
					colaVieja.anterior = null;
					colaVieja = null;
				}
				else{ // borrado en demás posiciones
					Nodo actualViejo = actual; 
					actualViejo.anterior.siguiente = actualViejo.siguiente;
					actualViejo.siguiente.anterior = actualViejo.anterior;
					actualViejo = null;
				}

				borrados++;
			}
			actual = actual.siguiente;
		}
		return borrados;
	}


	// Imprime de cabeza a cola.
	public String imprimirDesdeCabeza(){
		String contenido = "";
		Nodo actual = this.cabeza;
		while(actual != null){
			String valor = actual.toString();
			contenido += valor + "\n";
			actual = actual.siguiente;
		}
		return contenido;
	}

	// Imprime de la cola a cabeza.
	public String imprimirDesdeCola(){
		String contenido = "";
		Nodo actual = this.cola;
		while(actual != null){
			String valor = actual.toString();
			contenido += valor + "\n";
			actual = actual.anterior;
		}
		return contenido;
	}

	public static void main(String args[]){
		ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
		//lista.agregarAlFinal(1);
		lista.agregarAlFinal(1);
		lista.agregarAlFinal(2);
		lista.agregarAlFinal(3);
		lista.agregarAlFinal(4);
		lista.agregarAlFinal(5);
		lista.agregarAlFinal(6);
		lista.agregarAlFinal(7);

		System.out.println( lista.imprimirDesdeCabeza()+"\n");

		System.out.println("Elementos borrados: " + lista.eliminarElemento(3));

		System.out.println( lista.imprimirDesdeCabeza()+"\n");
		System.out.println( lista.imprimirDesdeCola()+"\n");
	}	
}