
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal p1=new Principal();
		p1.ejecutar();
		
	}
	
	
	public void ejecutar()
	{
		Puntos P1=new Puntos();
		P1.puntos();
		/*
		Circulo C1=new Circulo();
		C1.Circulo();*/
		
		Circulo c2=new Circulo();
		c2.circulo();
		
		Coeficientes C3=new Coeficientes();
		C3.coeficientes();
		
		Distancia D1=new Distancia();
		D1.dist();
		
	}
	

}
