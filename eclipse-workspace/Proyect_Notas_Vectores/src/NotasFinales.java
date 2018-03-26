import java.util.Scanner;

public class NotasFinales {
	int nf;
	int Notas[];
	Scanner leer=new Scanner(System.in);
	public NotasFinales()
	{
		nf=0;
	}
	public void LeerCantidad()
	{
		System.out.println("Ingrese la cantidad de Notas finales que Registrara........");
		nf=leer.nextInt();
		Notas=new int[nf];
	}
	public void IngresaNF()
	{
		for(int i=0;i<Notas.length;i++)
		{
			System.out.println("NF(" + (i+1) + ") = ");
			Notas[i]=leer.nextInt();
		}
	}
	public void MostrarAprobados()
	{
		System.out.println("\n" +"*******Aprobados*******");
		for(int i=0;i<Notas.length;i++)
		{
			if(Notas[i]>=60)
			System.out.println(Notas[i]);
		}
	}
	public void Ordenado() 
	{
		int aux;
		for(int i=0;i<Notas.length;i++)
		{
			for(int j=i+1;j<Notas.length;j++) {
				if (Notas[j]<Notas[i]) {
					aux=Notas[i];
					Notas[i]=Notas[j];
					Notas[j]=aux;
				} 
				
                }
			for (; i < Notas.length; i++){
				System.out.print(Notas[i]+" ");
			}
		}
	}

}
