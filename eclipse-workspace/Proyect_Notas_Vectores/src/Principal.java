import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal obj1=new Principal();
				obj1.ejecutar();
	}
	public void ejecutar()
	{
		int op=0;
		Scanner leer=new Scanner(System.in);
		NotasFinales nota1=new NotasFinales();
		do
		{
			System.out.println("/////////// MENU \\\\\\\\\\");
			System.out.println("1 > Cantidad de NF a ingresar");
			System.out.println("2 > Tabular las NF");
			System.out.println("3 > Mostrar Aprobados");
			System.out.println("4 > Mostrar todas las NF en orden ascendente");
			System.out.println("5 > SALIR");
			
			System.out.println("\n Elija su opcion");
			op=leer.nextInt();
			
			switch(op)
			{case 1:nota1.LeerCantidad();break;
			case 2:nota1.IngresaNF();break;
			case 3:nota1.MostrarAprobados();break;
			case 4:nota1.Ordenado();;break;
			default:System.out.println("Gracias");
			
			}
			
		}while(op !=5);
		
		
		
		
		
	}

}
