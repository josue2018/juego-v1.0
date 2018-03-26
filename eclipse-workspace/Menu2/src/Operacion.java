
public class Operacion {
	/*int i;*/
	
	public void Multi()
	{
		for(int i=1;i<=10;i++)
		{
		for(int j=1;j<=10;j++)
		{
			System.out.println(j + "x" + i + "=" + (j*i));
		}
		System.out.println("");
		}
	}
	public void Sum()
	{
		for(int i=1;i<=10;i++)
		{
		for(int j=1;j<=10;j++)
		{
			System.out.println(j + "+" + i + "=" + (j+i));
		}
		System.out.println("");
		}
		
	}
	public void Rest()
	{
		for(int i=1;i<=10;i++)
		{
		for(int j=1;j<=10;j++)
		{
			System.out.println(j + "-" + i + "=" + (j-i));
		}
		System.out.println("");
		}
	}
	public void Div()
	{
		for(int i=1;i<=10;i++)
		{
		for(int j=1;j<=10;j++)
		{
			System.out.println(j + "/" + i + "=" + (j/i));
		}
		System.out.println("");
		}
	}
	

}
