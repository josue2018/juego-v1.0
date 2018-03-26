import java.util.Scanner;

public class Menu {
	int op;
	public Menu()
	{
		op=0;
	}
	
	public void mostraraMenu()
	{
		Scanner leer=new Scanner(System.in);
		do
		{
			System.out.println("\n* * *MENU PRINCIPAL* * *\n");
			System.out.println("1 <- Tabla de Multiplicar");
			System.out.println("2 <- Tabla de Sumar");
			System.out.println("3 <- Tabla de Restar");
			System.out.println("4 <- tabla de dividir");
			System.out.println("5 <- salir");
			System.out.println("\n ELIJA SU OPCION:");
			op=leer.nextInt();
			
			switch(op)
			{
			case 1:{
				Operaciones mult=new Operaciones();
				mult.TMultiplicar();
			}break;
			case 2:{
				Operaciones sum=new Operaciones();
				sum.TSumar();
				
			}break;
			case 3:{
				Operaciones res=new Operaciones();
				res.TRestar();

				
			}break;
			case 4:{
				Operaciones div=new Operaciones();
				div.TDividir();
				
			}break;
			   
			default:{
				System.out.println("No existe esa opcion");
			}
			
			}
		}while(op!=5);
		System.out.println("Gracias por usar el sistema Fin.....");
	}

}
