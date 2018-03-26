import java.util.Scanner;

public class Piramid {
	
int obj;
	
	
	public void piramid()
	{
		int x=1;
		Scanner leer=new Scanner(System.in);
		System.out.println("ingresar obj=");
		obj=leer.nextInt();
		int n=obj;
		
		for(int i=1;i<=obj;i++)
		{
			for(int c=70;c>=i;c--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=x;j++)
			{
				System.out.print("*");
			}
			x=x+2;
			System.out.println();
	}	
	}
}