import java.util.Scanner;

public class ArregloBD {
	int A[][];
	int f,c;
	int B[][];
	int s=0;

	Scanner leer=new Scanner(System.in);
	public ArregloBD()
	{
		f=c=0;
	}
	public void IngresarFxC()
	{
		
		System.out.println("Ingrese Fila = ");
		f=leer.nextInt();
		System.out.println("Ingrese la Columna = ");
		c=leer.nextInt();
		
	}
	public void IngresarDatos()
	{
		A=new int[f][c];
		for(int i=0;i<f;i++)
			for(int j=0;j<c;j++)
			{
				System.out.print("A[" + (i+1) +"][" + (j+1) + "] = ");
				A[i][j]=leer.nextInt();
			}
		
	}
	public void MostrarMatriz()
	{
		for(int i=0;i<f;i++)
		{
			for(int j=0;j<c;j++)
			{
		    System.out.print(A[i][j] + " ");
			}
		System.out.println();
		}
	}
	public void Transpuesta() 
	{
		for(int i=0;i<f;i++)
		{
			System.out.print("      ");
			for(int j=0;j<c;j++)
			{
		    System.out.print(A[j][i] + " ");
			}
		System.out.println();
		}
		
	}
	public void SumaDeDiagonal()
	{
		for(int i=0;i<f;i++)
		{
			
			for(int j=0;j<c;j++)
				s=s+A[i+1][j+1];
			
			  System.out.print("la Sumatoria de la diagonal principal es =" + s);
		System.out.println();
		}
		
	}
	public void SumaDeMatrices()
	{
		System.out.println("Ingrese Fila = ");
		f=leer.nextInt();
		System.out.println("Ingrese la Columna = ");
		c=leer.nextInt();
		
		B=new int[f][c];
		for(int i=0;i<f;i++)
			for(int j=0;j<c;j++)
			{
				System.out.print("B[" + (i+1) +"][" + (j+1) + "] = ");
				B[i][j]=leer.nextInt();
			}
		
		for(int i=0;i<f;i++)
		{
			for(int j=0;j<c;j++)
			{
		    System.out.print(B[i][j] + " ");
			}
		System.out.println();
		}
		System.out.print("LA RESPUESTA ES ===  ");
		for(int i=0;i<f;i++)
		{
			System.out.print(" ");
			for(int j=0;j<c;j++)
			{
		    System.out.print(A[i][j]  +  B[i][j]+ " ");
		    
			}
		System.out.println();
		}
	}
	
}
