import java.util.Comparator;

public class CompPeso implements Comparator<Persona> {

	public int compare(Persona o1, Persona o2) {
		return (int) (o1.getPeso() - o2.getPeso());
	}

}
