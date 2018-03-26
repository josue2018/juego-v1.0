
public class Denominador {
	public double Factorial(int n)
	{
		int f=1;
		int r=1;
		
			f=(2*n)-1;
			
			for(int k=1;k<=f;k++)
			{
				r=r*k;
			}
		
		return(r);
	}

}
