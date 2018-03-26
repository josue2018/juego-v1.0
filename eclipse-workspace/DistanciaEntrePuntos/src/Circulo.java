
public class Circulo extends Puntos {
	double R;
	
	public Circulo()
	{
		R=2.5;
	}
	public void circulo()
	{
		System.out.println("El radio dado es =" + R);
	}
	public Circulo(double x,double y, double Radio)
	{
		super(x,y);
		Radio=R;
	}
	

}
