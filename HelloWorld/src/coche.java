
public class coche {
	private float velocidad;
	private int asientos;
	private int ruedas;

	//Constructores
	public coche() {
		this.velocidad = 100.0f;
		this.caballos = 200.0f;
		this.asientos = 5;
		this.ruedas = 4;
	}
	public coche(float velocidad) {
		this.velocidad = velocidad;
		this.caballos = 150.0f;
		this.asientos = 5;
		this.ruedas = 4;
	}
	public coche(float velocidad, float caballos) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = 6;
		this.ruedas = 6;
	}
	public coche(float velocidad, float caballos, 
			int asientos) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = asientos;
		this.ruedas = 4;
	}
	public coche(float velocidad, float caballos, 
			int asientos, int ruedas) {
		this.velocidad = velocidad;
		this.caballos = caballos;
		this.asientos = asientos;
		this.ruedas = ruedas;
	}
	//Atributos
    private float caballos;
    
    public void coche1(float velocidad, float caballos, int asientos int orientacionRuedas) {
       this.velocidad = velocidad;
       this.asientos = asientos;
       this.orientacionRuedas = orientacionRuedas;
    // inicializacion de los atributos especificos del 
       this.caballos = caballos;
    }
	//Métodos
	public void parar() {}
	public void acelerar() {
	   this.velocidad += 5;
	}
	public void desacelerar() {}
	public void girarIzquierda() {}
	public void girarDerecha() {}
	
	public static float convertirCvKw(float caballos) {
		return caballos/factorConversionCvKw;
	}
	public static float convertirKwCv(float kilowatios) {
		return kilowatios*factorConversionCvKw;
	}
	
	//Métodos Setter y Getters
	public float getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	public float getCaballos() {
		return caballos;
	}
	public void setCaballos(float caballos) {
		this.caballos = caballos;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
}
