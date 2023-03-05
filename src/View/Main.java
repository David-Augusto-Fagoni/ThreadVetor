package View;
import controller.ThreadVetor;

public class Main 
{
	public static void main (String args[])
	{
		int Vt[] = new int [1000];
		
		for (int J=0;J<1000;J++)
		{
			Vt[J] = (int) (Math.random()*100)+1;
		}
		
		for (int J=1;J<3;J++)
		{
			ThreadVetor T = new ThreadVetor(J,Vt);
			T.start();
		}
	}
}
