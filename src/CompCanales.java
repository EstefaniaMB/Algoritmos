import java.util.Comparator;

public class CompCanales implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return (int) (o1.getCanales() - o2.getCanales());
	}

}
