package controller;

public class ThreadVetor extends Thread
{
	private int Num;
	private int Vt[];
	
	public ThreadVetor(int Num, int [] Vt)
	{
		this.Num = Num;
		this.Vt = Vt;
	}
	
	public void run()
	{
		Vetor();
	}
	public void Vetor()
	{
		double TmpI, TmpF,TmpTT;
		TmpI = System.nanoTime();
		if (Num%2 == 0)
		{
			
			for (int J=0;J<Vt.length;J++)
			{
				Vt[J] = Vt[J];
			}
		}
		else
		{
			for( int J : Vt)
			{
				Vt[J] = Vt[J];
			}
		}
		TmpF = System.nanoTime();
		TmpTT = TmpF - TmpI;
		if (Num%2 == 0)
		{
			System.out.println("Tempo do for: "+TmpTT);
		}
		else
		{
			System.out.println("Tempo do foreach: "+TmpTT);
		}
	}
}
