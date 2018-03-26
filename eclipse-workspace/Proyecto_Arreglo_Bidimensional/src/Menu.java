import java.util.Scanner;

public class Menu {
	int op;
	Scanner leer=new Scanner(System.in);
	public Menu()
	{
		op=0;
	}
	public void  MenuPrincipal()
	{
		ArregloBD a=new ArregloBD();
		do
		{
		System.out.println(" ****** MENU PRINCIPAL ******** ");
		System.out.println(" 1 > Ingresarr Matriz ");
		System.out.println(" 2 > Mostrar la Matriz ");
		System.out.println(" 3 > Mostrar Transpuesta ");
		System.out.println(" 4 > Suma de Diagonales");
		System.out.println(" 5 > Suma de Matrices");
		System.out.println(" 6 > Elija su opción ");
		op=leer.nextInt();
		if(op==1)
		{
			a.IngresarFxC();
			a.IngresarDatos();
		}
		if(op==2)
		{
			a.MostrarMatriz();
		}
		if(op==3)
		{
			a.Transpuesta();
		}
		if(op==4)
		{
			a.SumaDeDiagonal();
		}
		if(op==5)
		{
			a.SumaDeMatrices();
		}
		}while(op!=6);
		
	}

}
