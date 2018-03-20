package application;

public class Aleatorio {
	double X,Y;
	
	public Aleatorio()
	{
		X=Y=0;
	}
	public double PosicionX()
	{
		X =(Math.random()*300);
		Math.round(X);
		return X;
		
	}
	public double PosicionY()
	{
		Y =(Math.random()*300);
		Math.round(Y);
		return Y;
	}

}
