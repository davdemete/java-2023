
public class EjemploPolimorfismo {

	public static void main(String[]args {
		// TODO Auto-generated method stub
		Bicicleta bicicleta = new Bicicleta();
		Coche coche = new Coche();
		Avion avion = new Avion();
		Main.invocarParar(bicicleta);
		Main.invocaParar(coche);
		Main.invocarParar(avion);
	}
     public static void invocarParar(Vehiculo vehiculo) {
    	 vehiculo.parar();
     }
     
    	 

