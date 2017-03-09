import processing.core.PApplet;

public class Persona implements Comparable<Persona> {

	private PApplet app;
	private String nombre, apellido;
	private float cedula, edad, peso;
	private int r, g, b, x, y;

	public Persona(PApplet app, String nombre, String apellido, float cedula, float edad, float peso, int r, int g,
			int b) {
		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;
		this.x = x;
		this.y = y;
	}

	public void pintar(int x, int y) {
		app.textSize(30);
		app.fill(r, g, b);
		app.text(nombre + " " + apellido + ", " + cedula + ", " + edad + ", " + peso, x, y);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCedula() {
		return cedula;
	}

	public void setCedula(float cedula) {
		this.cedula = cedula;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int compareTo(Persona a) {
		return getNombre().compareTo(a.getNombre());

	}

}
