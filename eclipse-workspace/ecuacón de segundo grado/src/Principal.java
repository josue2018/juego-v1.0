
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;Principal c=new Principal();
		c.Iniciar();
	}
			public void Iniciar()
	{
				Calcular c2=new Calcular();
				c2.IngresarDatos();
				
				
				System.out.println(" La ecuacion es =" + c2.Restringir());
				
				c2.CalcularRaices(1,4,4);
				
				double Dis=c2.Disicriminante(4,3,5);
				System.out.println("El valor del discriminante es =" + Dis );
				

	}

}
