package objetos;

import java.util.Comparator;

public class CirculoComparator implements Comparator<Circulo>{
	
	@Override
	public int compare(Circulo o1, Circulo o2) {
		
		// ordena Por Paridad
		return -(int) ( o1.getRadio() % 2 - o2.getRadio() % 2);
	}

}
