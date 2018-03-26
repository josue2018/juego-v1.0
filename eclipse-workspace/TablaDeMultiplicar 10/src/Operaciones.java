import java.util.Scanner;

public class Operaciones {
	int numero;
	
	public Operaciones()
	{
		numero=0;
	}
	public void TMultiplicar()
	{
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingresar el numero");
		numero=leer.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + "x" + numero + "=" + (i*numero));
		}
	}
	public void TSumar()
	{
Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingresar el numero");
		numero=leer.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + "+" + numero + "=" + (i+numero));
		}
		
	}
	public void TRestar()
	{
Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingresar el numero");
		numero=leer.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + "-" + numero + "=" + (i-numero));
		}
	}
	public void TDividir()
	{
Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingresar el numero");
		numero=leer.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i + "/" + numero + "=" + (i/numero));
		}
	}

}
