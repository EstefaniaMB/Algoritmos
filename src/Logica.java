import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private LinkedList<Persona> personaL;
	private TreeSet<Persona> personaT;

	public Logica(PApplet app) {
		this.app = app;
		personaL = new LinkedList<Persona>();
		personaT = new TreeSet<Persona>();
		readText();

	}

	public void readText() {

		// String[] usuarios = app.loadStrings("../data/usuarios.txt");
		// for (int i = 0; i < usuarios.length; i++) {
		// String[] datosU = usuarios[i].split(":");
		// }
		//
		// String[] informacion = app.loadStrings("../data/informacion.txt");
		// for (int i = 0; i < informacion.length; i++) {
		// String[] datosI = informacion[i].split(":");
		// float[] datosInfo = new float[datosI.length];
		// for (int j = 0; j < datosI.length; j++) {
		// datosInfo[i] = Float.parseFloat(datosI[i]);
		// }
		// }
		//
		// String[] tonos = app.loadStrings("../data/tonos.txt");
		// for (int i = 0; i < tonos.length; i++) {
		// String[] datosT = tonos[i].split(":");
		// int[] datosTono = new int[datosT.length];
		// for (int j = 0; j < datosT.length; j++) {
		// datosTono[i] = Integer.parseInt(datosT[i]);
		// }
		// }

		String[] usuarios = app.loadStrings("../data/usuarios.txt");
		String[] informacion = app.loadStrings("../data/informacion.txt");
		String[] tonos = app.loadStrings("../data/tonos.txt");

		for (int i = 0; i < usuarios.length; i++) {
			String[] datosU = usuarios[i].split(":");
			String[] datosI = informacion[i].split(":");
			String[] datosT = tonos[i].split(":");

			float[] datosInfo = new float[informacion.length];
			for (int j = 0; j < datosI.length; j++) {
				datosInfo[j] = Float.parseFloat(datosI[j]);
			}

			int[] datosTono = new int[tonos.length];
			for (int j = 0; j < datosT.length; j++) {
				datosTono[j] = Integer.parseInt(datosT[j]);
			}

			personaL.add(new Persona(app, datosU[0], datosU[1], datosInfo[0], datosInfo[1], datosInfo[2], datosTono[0],
					datosTono[1], datosTono[2], 100, i + 100));
		}

	}

	public void pintar() {
		for (int i = 0; i < personaL.size(); i++) {
			personaL.get(i).pintar();
		}

		int j = 0;
		Iterator<Persona> it = personaT.iterator();
		while (it.hasNext()) {
			Persona p = (Persona) it.next();
			p.pintar();
			j++;
		}

	}

	public void key() {
		switch (app.key) {
		case 1:
			break;

		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}

	}

}