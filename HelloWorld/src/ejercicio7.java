
public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 class Estudiante {

		    // Atributos
		    private int id;
		    private int edad;
		    private String telefono;
		    private int numeroDeNotas;
		    private double sumaDeNotas;
		    private double notaMedia;

		    // Constructor por defecto
		    public Estudiante() {
		        this.id = 0;
		        this.edad = 0;
		        this.telefono = "";
		        this.numeroDeNotas = 0;
		        this.sumaDeNotas = 0.0;
		        this.notaMedia = 0.0;
		    }

		    // Constructor parametrizado con id, edad y teléfono
		    public Estudiante(int id, int edad, String telefono) {
		        this.id = id;
		        this.edad = edad;
		        this.telefono = telefono;
		        this.numeroDeNotas = 0;
		        this.sumaDeNotas = 0.0;
		        this.notaMedia = 0.0;
		    }

		    // Constructor parametrizado con todos los atributos de la clase
		    public Estudiante(int id, int edad, String telefono, int numeroDeNotas, double sumaDeNotas, double notaMedia) {
		        this.id = id;
		        this.edad = edad;
		        this.telefono = telefono;
		        this.numeroDeNotas = numeroDeNotas;
		        this.sumaDeNotas = sumaDeNotas;
		        this.notaMedia = notaMedia;
		    }

		    // Métodos get y set para el atributo id
		    public int getId() {
		        return id;
		    }

		    public void setId(int id) {
		        this.id = id;
		    }

		    // Métodos get y set para el atributo edad
		    public int getEdad() {
		        return edad;
		    }

		    public void setEdad(int edad) {
		        this.edad = edad;
		    }

		    // Métodos get y set para el atributo telefono
		    public String getTelefono() {
		        return telefono;
		    }

		    public void setTelefono(String telefono) {
		        this.telefono = telefono;
		    }

		    // Métodos get y set para el atributo numeroDeNotas
		    public int getNumeroDeNotas() {
		        return numeroDeNotas;
		    }

		    public void setNumeroDeNotas(int numeroDeNotas) {
		        this.numeroDeNotas = numeroDeNotas;
		    }

		    // Métodos get y set para el atributo sumaDeNotas
		    public double getSumaDeNotas() {
		        return sumaDeNotas;
		    }

		    public void setSumaDeNotas(double sumaDeNotas) {
		        this.sumaDeNotas = sumaDeNotas;
		    }

		    // Métodos get y set para el atributo notaMedia
		    public double getNotaMedia() {
		        return notaMedia;
		    }

		    public void setNotaMedia(double notaMedia) {
		        this.notaMedia = notaMedia;
		    }

		    // Métodos
		    public void mostrarInfo() {
		        System.out.println("ID: " + id);
		        System.out.println("Edad: " + edad);
		        System.out.println("Teléfono: " + telefono);
		        System.out.println("Número de notas: " + numeroDeNotas);
		        System.out.println("Nota media: " + notaMedia);
		    }

		    public void agregarNuevaNota(double nota) {
		        sumaDeNotas += nota;
		        numeroDeNotas++;
		        
	}


