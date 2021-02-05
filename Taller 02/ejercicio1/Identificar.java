package ejercicio1;

public class Identificar
{
	private int numId ;
	
	public Identificar()
	{
		numId = 0 ;
	}
	
	public synchronized int darNumId ()
	{
		return numId ++;
	}
}