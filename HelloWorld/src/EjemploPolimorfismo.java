
public class EjemploPolimorfismo {

	private static Coche honda;
	private static Avion boeing;
	private static Bicicleta bh;
	public static void main(String[]args {
		// TODO Auto-generated method stub
		Bicicleta  bicicleta bh = new Bicicleta();
		Coche coche honda = new Coche();
		Avion avion boeing = new Avion();
		Main.invocarParar(bicicleta);
		Main.invocaParar(coche);
		Main.invocarParar(avion);
	}
     public static void invocarParar(Vehiculo vehiculo) {
    	 vehiculo.parar();
     }
     
    	 

