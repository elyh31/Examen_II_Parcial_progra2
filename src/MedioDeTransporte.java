import static org.junit.Assert.assertEquals;


public class MedioDeTransporte {
	
	int CantidadPasajeros;
	double Velocidadmaxima;

	public MedioDeTransporte(int cantidadpasajeros, double velocidadmaxima)
	{
		this.CantidadPasajeros = cantidadpasajeros;
		this.Velocidadmaxima = velocidadmaxima;
	}
	
	int getCantidadPasajeros()
	{
		return CantidadPasajeros;
	}
	
	double getVelocidadMaxima()
	{
		return Velocidadmaxima;
	}
	
	int getCantidadDeLLantas()
	{
	return 0;
	}
}
