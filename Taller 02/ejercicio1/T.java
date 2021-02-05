package ejercicio1;

import java.util.Random;

public class T extends Thread
{
	private static Identificar objId;

	private static Maximo maximo;

	private static int [][] matriz;

	public static void inicializar(int numM)
	{
		matriz = new int[numM][numM];

		Random r = new Random();

		for(int i = 0; i < matriz.length; i++)
		{
			for(int j = 0; j < matriz[i].length; j++)
			{
				matriz[i][j] = r.nextInt(1000000) + 1;
			}
		}
	}

	public void run()
	{
		int locMax = 0;
		int id = objId.darNumId ();
		
		for (int j=0; j < matriz[id].length; j++)
		{
			if (matriz[id][j] > locMax)
			{
				locMax = matriz[id][j] ;
			}
			if (maximo.anotar(locMax))
			{
				System.out.println("Maximo: " + maximo.darMaximo());
			}
		}
	}

	public static void main(String[] args)
	{
		int n = 10;
		inicializar(n);		
		objId = new Identificar();
		maximo = new Maximo(n);

		for(int i = 0; i < n; i++)
		{
			new T().start();
		}
	}

}
