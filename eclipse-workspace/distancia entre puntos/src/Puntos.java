import java.util.Scanner;

public class Puntos {
double x,x2,x3,D,D2,D3;
	
	double y,y2,y3;
	
	public void IngresarPuntos()
	{
		Scanner leer=new Scanner (System.in);
		
		System.out.println("ingresa x=");
		x=leer .nextDouble();
		System.out.println("ingresa x2=");
		x2=leer .nextDouble();
		System.out.println("ingresa x3=");
		x3=leer .nextDouble();
		System.out.println("ingresa y=");
		y=leer .nextDouble();
		System.out.println("ingresa y2=");
		y2=leer .nextDouble();
		System.out.println("ingresa y3=");
		y3=leer .nextDouble();
		
	}
	
	public void Resultados()
	{
		D=Math.sqrt(Math.pow(x-x2, 2)+ Math.pow(y-y2, 2));
		D2=Math.sqrt(Math.pow(x-x3, 2)+ Math.pow(y-y3, 2));
		D3=Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
		
		System.out.println(D);
		System.out.println(D2);
		System.out.println(D3);
		
		
	}
}
