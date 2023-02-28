
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Estudiante {

		    // Atributos
		    private int id;
		    private int edad;
		    private String telefono;
		    private int numeroDeNotas;
		    private int sumaDeNotas;
		    private float notaMedia;

		    // Constructor por defecto
		    public Estudiante() {
		        this.id = 0;
		        this.edad = 0;
		        this.telefono = "";
		        this.numeroDeNotas = 0;
		        this.sumaDeNotas =  (int) 0.0;
		        this.notaMedia = (float) 0.0;
		    }

		    // Constructor parametrizado con id, edad y teléfono
		    public Estudiante(int id, int edad, String telefono) {
		        this.id = id;
		        this.edad = edad;
		        this.telefono = telefono;
		        this.numeroDeNotas = 0;
		        this.sumaDeNotas = (int) 0.0;
		        this.notaMedia = (float) 0.0;
		    }

		    // Constructor parametrizado con todos los atributos de la clase
		    public Estudiante(int id, int edad, String telefono, int numeroDeNotas, int sumaDeNotas, float notaMedia) {
		        this.id = id;
		        this.edad = edad;
		        this.telefono = telefono;
		        this.numeroDeNotas = numeroDeNotas;
		        this.sumaDeNotas = sumaDeNotas;
		        this.notaMedia = notaMedia;
		    }

		    // Métodos
		    public void mostrarInfo() {
		    public void agregarnuevanota() {}
		    System.out.println("ID: " + id);
		    System.out.println("Edad: " + edad);
		    System.out.println("Teléfono: " + telefono);
		    System.out.println("Número de notas: " + numeroDeNotas);
		    System.out.println("Nota media: " + notaMedia);
		    }

		    public void agregarNuevaNota(double nota) {
		        sumaDeNotas += nota;
		        numeroDeNotas++;
		        notaMedia = sumaDeNotas / numeroDeNotas;
		    }

		}

	}

}
