import java.util.Comparator;

public class CompCedula implements Comparator<Persona>{

	public int compare(Persona o1, Persona o2) {
		return (int)(o1.getCedula()-o2.getCedula());
	}

}
