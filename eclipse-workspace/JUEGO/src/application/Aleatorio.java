package application;

public class Aleatorio {
	
	double X,Y;
	
	public Aleatorio() {
		X=Y=0;
	}
	public double PosicionX() {
		X=(Math.random()*400+40);
		Math.round(X);
		return X;
	}
	public double PosicionY() {
		Y=(Math.random()*10+0);
		Math.round(Y);
		return Y;
	}
	
	public double aparicionAleatoria() {
		double T = (Math.random()*(-100)+0);
		Math.round(T);
		return T;
	}
}
