package practicando;

import java.util.Scanner;

public class Piramide {
	public void Esquineado()
	{
		int ast,n=1;
		Scanner leer=new Scanner(System.in);
		System.out.println("ingresar limite de asteriscos :");
		ast=leer.nextInt();
		for(int i=1;i<=ast;i++) {
			for(int x=70;x>=i;x--){
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			n=n+2;
			System.out.println();
		}
		
		
		
		
	}

}
