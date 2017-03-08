import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private ArrayList<Persona> personaA;
	private LinkedList<Persona> personaL;
	private HashSet<Persona> personaH;
	private TreeSet<Persona> personaT;

	public Logica(PApplet app) {
		this.app = app;
		personaA = new ArrayList<Persona>();
		personaL = new LinkedList<Persona>();
		personaH = new HashSet<Persona>();
		personaT = new TreeSet<Persona>();
		readText();

	}

	public void readText() {

		// creo un arreglo de Strings en donde voy a almacenar las lineas del
		// txt "usuarios"
		String[] usuarios = app.loadStrings("../data/usuarios.txt");

		// recorro mi arreglo de Strings
		for (int i = 0; i < usuarios.length; i++) {
			// voy a crear un nuevo arreglo de Strings en donde voy a guardar la
			// información de "usuarios" separada por ":"
			String[] datosU = usuarios[i].split(":");
		}

		// creo un arreglo de Strings en donde voy a almacenar las lineas del
		// txt "información"
		String[] informacion = app.loadStrings("../data/informacion.txt");
		// recorro mi nuevo arreglo de Strings
		for (int i = 0; i < informacion.length; i++) {
			// nuevo arreglo de Strings en donde voy a almacenar la informacion
			// de "informacion" separada por ":"
			String[] datosI = informacion[i].split(":");
			// ahora voy a guardar los datos separados en un nuevo arreglo
			int[] datosInfo = new int[datosI.length];
			for (int j = 0; j < datosI.length; j++) {
				datosInfo[i] = Integer.parseInt(datosI[i]);
			}
		}

		// creo un arreglo de Strings en donde voy a almacenar las lineas del
		// archivo txt "tonos"

		String[] tonos = app.loadStrings("../data/tonos.txt");

		// recorro mi nuevo arreglo
		for (int i = 0; i < tonos.length; i++) {
			// creo un arreglo de Strings en donde almaceno los datos de "tonos"
			// separados por ":"
			String[] datosT = tonos[i].split(":");
			// guardo los datos de "tono" separados en un nuevo arreglo,esta vez
			// de int
			int[] datosTono = new int[datosT.length];
			for (int j = 0; j < datosT.length; j++) {
				datosTono[i] = Integer.parseInt(datosT[i]);
			}
		}

	}

	public void pintar() {

	}

	public void key() {

	}

}