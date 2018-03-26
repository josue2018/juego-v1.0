
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal c=new Principal();
		c.Iniciar();
	}
public void Iniciar()
{
	proced c1=new proced();
	c1.IngresarDatos();
	
	System.out.println("El resultado de X es =" + c1.Calcular());
	
	c1.Valor(2,4,0,-3,-9,-7);
	
	double Cal=c1.Calc(6, 7, 8, 5, 4, 1);
	System.out.println("El valor de Y es="+ Cal);
	
	}
}
