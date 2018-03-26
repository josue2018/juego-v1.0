import java.util.Scanner;

public class Menu2 {
	int ap;
	
	public Menu2()
	{
		ap=0;
		
	}
	public void mostrarMenu2()
	{
		Scanner leer=new Scanner(System.in);
		do
		{
			System.out.println("\n* * *MENU 2 PRINCIPAL* * *\n");
			System.out.println("1 <- * ");
			System.out.println("2 <- + ");
			System.out.println("3 <- - ");
			System.out.println("4 <- / ");
			System.out.println("5 <- salir ");
			System.out.println("\n ELIJA SU OPCION:");
			ap=leer.nextInt();
			
			switch(ap)
			{
			case 1:{
				Operacion mult=new Operacion();
				mult.Multi();
				
			}break;
			case 2:{
				Operacion sum=new Operacion();
				sum.Sum();;
			}break;
			case 3:{
				Operacion res=new Operacion();
				res.Rest();
				
			}break;
			case 4:{
				Operacion div=new Operacion();
				div.Div();
			}break;
			
			default:{
				System.out.println("No existe esa opcion");
			}
		
			}
		}while(ap!=5);
		System.out.println("Gracias por revisar nuestro sistema 2......Fin");
	}

}
