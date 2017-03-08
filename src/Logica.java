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
	}
	
	public void pintar(){
		
	}
	
	public void key(){
		
	}

}