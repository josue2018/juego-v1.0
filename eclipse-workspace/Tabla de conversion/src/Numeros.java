import java.util.Scanner;

public class Numeros {
	int num;
	public void Numero()
	{
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingresar numero de maximo 4 dijitos :");
		num=leer.nextInt();
	}
		public void Mostrar()
		{
			Unidad un=new Unidad();
			Decenea dec=new Decenea();
			Centena cen=new Centena();
			UnidadDeMil umil=new UnidadDeMil();
			String texto;
			if(num>0 && num<10000){
				int u = num % 10;
				num=num/10;
				texto=un.unidad(u);
				
				int d=num%10;
				num=num/10;
				if(d==1 && u>0)
					texto=dec.decena(10+u);
				else if (d>0 && u==0)
				texto=dec.decena(d);
				else if (d>1)
				texto=dec.decena(d)+ " y " +texto;
				
				int c=num%10;
				num=num/10;
				if(u==0 && d==0 && c>0)
					texto=cen.centena(c);
				else if(c>1 && d>=0)
					texto=cen.centena(c)+" "+texto;
				else if(c==1 && d>=0)
					texto=cen.centena(c)+"to "+texto;
				/*else if(c==1 && d==1)
					texto=cen.centena(c)+"to "+dec.decena(10+u);*/
				/*else if(c>1 && d==0 && u>0)
					texto=cen.centena(c)+" "+texto;*/
				/*else if(c==1 && d==0 && u>0)
					texto=cen.centena(c)+"to "+texto;*/
				/*else if(c>1 && d==1)
					texto=cen.centena(c)+" "+texto;*/
				
				/*int um=num%10;
				num=num/10;
				if(um>0 && c==0 && d==0)
					texto=umil.Umil(um);
				else if(um>0 && c>0 && d==0)
					texto=umil.Umil(um)+" "+texto;
				else if(um>0 && c>0 && d>0)
					texto=umil.Umil(um)+" "+texto;
				else if(um>0 && c>0 && d==1)
					texto=umil.Umil(um)+" "+texto;*/
				texto=umil.Umil(num)+" "+texto;
			
				System.out.println(texto);
		}
			else System.out.println("NO existe traduccion......");
			
		}
		
		
	}


