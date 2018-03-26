import java.util.Scanner;

public class Sumatoria {
	int n;
	public void MostrarSerie()
	{
		double s=0;
	Scanner leer=new Scanner(System.in);
	System.out.println("Ingresar n:");
	n=leer.nextInt();
	
	Numerador p=new Numerador();
	Denominador f=new Denominador();
	for(int g=1;g<=n;g++)
	{
		s= s + p.Potencia(g)/f.Factorial(g);
		System.out.print(" + (" + p.Potencia(g) +" / " + f.Factorial(g) + ") + ");
		
	}
	System.out.println();
	System.out.println(+s);
	}
	

}
