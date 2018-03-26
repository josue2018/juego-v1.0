import java.util.Scanner;

public class Calcular {
	double A,B,C,R;
	
	public void IngresarDatos()
	{
		Scanner Ingresar=new Scanner(System.in);
		System.out.println("Ingresar A =");
		A=Ingresar.nextDouble();
		System.out.println("Ingresar B =");
		B=Ingresar.nextDouble();
		System.out.println("Ingresar C =");
		C=Ingresar.nextDouble();
	}
	
	public String Restringir()
	{
		if (A==0)
		{
		
		    return ("ERROR");
		}
	    else
	    {	
		    return ("CORRECTO");
	    }	
	}
	
	public void CalcularRaices(double a, double b, double c)
	{
		System.out.println("Su primera raiz es="+(-b + Math.sqrt(Math.pow(b,2)- 4*(a*c)))/(2*a));
		System.out.println("Su segunda raiz es="+(-b - Math.sqrt(Math.pow(b,2)- 4*(a*c)))/(2*a));
		
	}
	public double Disicriminante(double E, double F, double G)
	{
		return(Math.pow(F,2)- 4*(E*G));
		
	}	
	

}
