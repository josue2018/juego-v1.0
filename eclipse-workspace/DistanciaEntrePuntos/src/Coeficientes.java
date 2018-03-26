
public class Coeficientes {
	double A,B,C,DEN;
	public Coeficientes()
	{
		A=12;
		B=14;
		C=18;
	}
	public double coeficientes()
	{
		/*System.out.println("A es =" + A);
		System.out.println("B es =" + B);
		System.out.println("C es =" + C);*/
		DEN=Math.sqrt((A*A)+(B*B));
		System.out.println("DEN es =" + DEN);
		return(+DEN);
	}

}
