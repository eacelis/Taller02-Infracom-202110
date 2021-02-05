package ejercicio1;

public class Maximo
{
	private int cont;

	private int maximo;

	private int nThreads;

	public Maximo (int numT)
	{
		nThreads = numT;
		maximo = 0;
		cont = 0;
	}

	public synchronized boolean anotar (int n)
	{
		if (n > maximo)
		{
			maximo = n ;
		}
		return(++cont == nThreads) ? true: false;
	}

	public int darMaximo()
	{
		return maximo;
	}
}