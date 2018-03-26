
public class Distancia extends Coeficientes{
	double D;
	public void dist()
	{
		Puntos p1=new Puntos();
		
 
		D=(A*p1.X+B*p1.Y+C)/DEN;
		
		
		System.out.println("D =" + D );
		
		
	}

}
