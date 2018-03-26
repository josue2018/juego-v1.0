import java.util.Scanner;

public class Esquinas {
	int obj,m=140;
	public void esquina()
	{
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingresar obj=");
		obj=leer.nextInt();
	
		do {
			int n=1;
			for(int c=1;c<=m;c++)
			{
				System.out.print(" ");	
			}
			do {
				System.out.print("*");
				n++;
			}while(n<obj);
			m++;
			if(obj!=1)
			{
			System.out.println();
			
			}
			obj--;
		}while(obj>0);
	}

}
