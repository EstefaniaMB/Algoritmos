import java.util.Comparator;

public class CompEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return (int) (o1.getEdad() - o2.getEdad());
	}

}
