import java.util.Scanner;

public class Operaciones {
	double B,H,P,A;
	
	public void IngresarDimensiones()
	{
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingresar Base:");
		B=leer.nextDouble();
		System.out.println("Ingresar Altura:");
		H=leer.nextDouble();
	}
	public void Calcular()
	{
		P=B*2+H*2;
		A=B*H;
		System.out.println("Perimetro:" +P);
		System.out.println("perimetro:" +A);
	}
		
		
	}
	
	
	

