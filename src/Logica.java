
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private LinkedList<Persona> personaI;
	private TreeSet<Persona> personaT;

	public Logica(PApplet app) {
		this.app = app;
		personaI = new LinkedList<Persona>();
		personaT = new TreeSet<Persona>();
		readText();

	}

	public void readText() {

		String[] usuarios = app.loadStrings("../data/usuarios.txt");
		String[] informacion = app.loadStrings("../data/informacion.txt");
		String[] tonos = app.loadStrings("../data/tonos.txt");

		for (int i = 0; i < usuarios.length; i++) {
			String[] datosU = usuarios[i].split(":");
			String[] datosI = informacion[i].split("/");
			String[] datosT = tonos[i].split("/");

			float[] datosInfo = new float[informacion.length];
			for (int j = 0; j < datosI.length; j++) {
				datosInfo[j] = Float.parseFloat(datosI[j]);
			}

			int[] datosTono = new int[tonos.length];
			for (int j = 0; j < datosT.length; j++) {
				datosTono[j] = Integer.parseInt(datosT[j]);
			}

			personaI.add(new Persona(app, datosU[0], datosU[1], datosInfo[0], datosInfo[1], datosInfo[2], datosTono[0],
					datosTono[1], datosTono[2]));
			personaT.add(new Persona(app, datosU[0], datosU[1], datosInfo[0], datosInfo[1], datosInfo[2], datosTono[0],
					datosTono[1], datosTono[2]));
		}

	}

	public void pintar() {

		Iterator<Persona> it = personaI.iterator();
		int i = 0;
		while (it.hasNext()) {
			Persona p = it.next();
			p.pintar(100, 50 + (i * 50));
			i++;
		}

	}

	public void key() {
		if (app.key == '1') {
			Collections.sort(personaI);
		}
		if (app.key == '2') {
			Collections.sort(personaI, new CompPeso());
		}
		if (app.key == '3') {
			personaI.clear();
			personaI.addAll(personaT);
			Collections.sort(personaI, new CompPeso());
			Collections.reverse(personaI);
		}
		if (app.key == '4') {
			Collections.sort(personaI, new CompCanales());
//			Collections.shuffle(personaI);
		}

	}

}