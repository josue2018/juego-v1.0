package practicando;

import java.util.Scanner;

public class Esquina {
	public void Esquinas() {
		int ast;
		int h=140;
		Scanner leer=new Scanner(System.in);
		System.out.println("ingresar limite de asteriscos :");
		ast=leer.nextInt();
		
		for(int i=1;1<=ast;)
		{
			for(int c=0;c<=h;c++)
			{
				System.out.print(" ");
			}
			h++;
			for(int n=1;n<=ast;n++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
			ast --;
		}
		
	}

}
