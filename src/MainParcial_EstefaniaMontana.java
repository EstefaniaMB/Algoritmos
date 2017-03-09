import processing.core.PApplet;

public class MainParcial_EstefaniaMontana extends PApplet {

	public static void main(String[] args) {
		PApplet.main("MainParcial_EstefaniaMontana");
	}

	public void settings() {
		size(1200, 700);
	}

	Logica logica;

	public void setup() {
		logica = new Logica(this);
	}

	public void draw() {
		background(0);
		logica.pintar();
	}
	
	public void keyPressed(){
		logica.key();
	}

}
