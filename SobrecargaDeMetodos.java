public class SobrecargaDeMetodos{
	

	public double sumar(double num1, double num2){
		return num1 + num2;
	}

	public int sumar(int num1, int num2){
		return num1 + num2;
	}

	public int sumar(int n1, int n2, int n3){
		return n1 + n2 + n3; 
	}



	public static void main(String[] args){
		SobrecargaDeMetodos so = new SobrecargaDeMetodos();
		int n = 10;
		double n2 = 15;

		System.out.println(so.sumar(n,n2));
		System.out.println(so.sumar(5,1));
		System.out.println(so.sumar(5,1.101));
		System.out.println(so.sumar(5,1,8));
	}

}