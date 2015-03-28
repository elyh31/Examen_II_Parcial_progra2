
public class Carro extends MedioDeTransporte{
	
	public Carro(int cantidadpasajeros, double velocidadmaxima) 
	{
		super(cantidadpasajeros, velocidadmaxima);
	}
		
	int getCantidadDeLLantas()
	{
	return 4;
	}

}