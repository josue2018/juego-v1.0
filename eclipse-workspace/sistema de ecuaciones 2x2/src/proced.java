import java.util.Scanner;

public class proced {
	double A,B,Q,C,D,P,X,Y,N;
	
	public void IngresarDatos()
	{
		Scanner Ingresar=new Scanner(System.in);
		
		System.out.println("Ingresar A =");
		A=Ingresar.nextDouble();
		System.out.println("Ingresar B =");
		B=Ingresar.nextDouble();
		System.out.println("Ingresar Q =");
		Q=Ingresar.nextDouble();
		System.out.println("Ingresar C =");
		C=Ingresar.nextDouble();
		System.out.println("Ingresar D =");
		D=Ingresar.nextDouble();
		System.out.println("Ingresar P =");
		P=Ingresar.nextDouble();
	}
    public String Calcular()
    {
    	N=(A*D)-(B*C);
    	if(N==0)
    	{
    		return ("infinito");
    	}
    	else
    	{
    		
    		return("Calculabe");
    		 
    	}
    }
    public void Valor(double a, double b,double q,double c,double d,double p)
    		{
    	System.out.println("El valor de x es="+((q*d)-(p*b))/((a*d)-(b*c)));
    	System.out.println("El valor de y es="+((a*p)-(c*q))/((a*d)-(b*c)));
    	
    		}
    public double Calc(double x,double y,double z,double g,double h,double i)
    
    {
    	return(Y=((x*i)-(g*z))/(x*h)-(y*g));
    }
}
