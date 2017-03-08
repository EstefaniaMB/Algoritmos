import processing.core.PApplet;

public class MainParcial_EstefaniaMontaņa extends PApplet {

	public static void main(String[] args) {
		PApplet.main("MainParcial_EstefaniaMontaņa");
	}

	@Override
	public void settings() {
		size(1200, 700);
	}

	Logica logica;

	@Override
	public void setup() {
		logica = new Logica(this);
	}

	@Override
	public void draw() {
		background(255);
		logica.pintar();
	}
	
	public void keyPressed(){
		logica.key();
	}

}
