package com.clase.info;

public abstract class Estudiante {

	public static void main(String[] args) {
	}
		// TODO Auto-generated method stub
			//Constructores
			public Estudiante() {
				this.id=1;
				this.edad=36;
				this.telefono=654321987;
				this.numeroNotas=6;
				this.sumaNotas=36;
				this.notaMedia=sumaNotas/numeroNotas;
			}
			
			public Estudiante(int id) {
				this.id=id;
				this.edad=36;
				this.telefono=654321987;
				this.numeroNotas=6;
				this.sumaNotas=36;
				this.notaMedia=sumaNotas/numeroNotas;
			}
			public Estudiante(int id, int edad) {
				this.id=id;
				this.edad=edad;
				this.telefono=654321987;
				this.numeroNotas=6;
				this.sumaNotas=36;
				this.notaMedia=sumaNotas/numeroNotas;
			}
			public Estudiante(int id, int edad, int telefono) {
				this.id=id;
				this.edad=edad;
				this.telefono=telefono;
				this.numeroNotas=6;
				this.sumaNotas=36;
				this.notaMedia=sumaNotas/numeroNotas;
			}
			
			//Atributos
			private int id;
			private int edad;
			private int telefono;
			private int numeroNotas;
			private float sumaNotas;
			private float notaMedia;
			private boolean reinicio;
			//Métodos
			public void mostrarInfo() {}
			public void agregarNuevaNote() {
			this.numeroNotas++;
			this.sumaNotas  +=notaMedia()
			// Para mantener la nota media
			public void agregarNuevaNota() {
				if(reinicio) {
					this.numeroNotas=0;	
					this.sumaNotas=0.0f;	
					this.notaMedia=0.0f;
				}
				else agregarNuevaNota();

			}
			
			public static Estudiante crearEstudiante() {
			
			}
			
			//Setters y getters
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public int getEdad() {
				return edad;
			}
			public void setEdad(int edad) {
				this.edad = edad;
			}
			public int getTelefono() {
				return telefono;
			}
			public void setTelefono(int telefono) {
				this.telefono = telefono;
			}
			public int getNumeroNotas() {
				return numeroNotas;
			}
			public void setNumeroNotas(int numeroNotas) {
				this.numeroNotas = numeroNotas;
			}
			public int getSumaNotas() {
				return (int) sumaNotas;
			}
			public void setSumaNotas(float sumaNotas) {
				this.sumaNotas = sumaNotas;
			}
			public float getNotaMedia() {
				return notaMedia;
			}
			public void setNotaMedia(float notaMedia) {
				this.notaMedia = notaMedia;
			}
		

	

}
