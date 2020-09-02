public class Quiz1Grupo6{
	public static final double PI = 3.14;

	public double calcularVolumenCilindro(double diametro, double altura){
		double radio = diametro/2;
		double area = radio * radio * PI;
		return area * altura;
	}
}