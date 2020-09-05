public class Primos{
	public boolean esPrimo(int n){
		boolean resultado = true;
		int i = 2;
		while(i <= n/2 && resultado){
			if (n%i == 0){
				resultado = false;
			}
			i++;
		}
		return resultado;
	}

	public void encontrarPrimos(int limSup){
		for (int i = 0; i < limSup; i++){
			String resultado = ""+ i + ": "+ esPrimo(i);
			System.out.println(resultado);
		}
	}

	// [Finished in 174.5s]
	// [Finished in 8.8s]

	public static void main (String args [] ){
		Primos primo = new Primos();
		/*System.out.println(primo.esPrimo(2));
		System.out.println(primo.esPrimo(22));
		System.out.println(primo.esPrimo(6));
		System.out.println(primo.esPrimo(999999999));*/
		primo.encontrarPrimos(330000);
	}
}