package objetos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CirculoTests {

	@Test
	void testArea() {
		Circulo c = new Circulo(1);
		
		assertEquals(Math.PI, c.getArea(), 0.01);
	}
	
	@Test
	void sonObjetosDistintosPeroIguales() {
		
		Circulo c1 = new Circulo(5);
		Circulo c2 = new Circulo(5);
		
		assertFalse(c1 == c2);
		assertTrue(c1.equals(c2));
	}
	
	@Test
	void ordenar() { // requiere interfaz Comparable
		
		Circulo c1 = new Circulo(50);
		Circulo c2 = new Circulo(5);
		Circulo c3 = new Circulo(15);
		Circulo c4 = new Circulo(8);
		
		
		Circulo[] circulos = { c1, c2, c3, c4};
		Circulo[] ordenados = { c2, c4, c3, c1};
		
		Arrays.sort(circulos);
		assertArrayEquals(ordenados, circulos);
	}
	
	
	
	

}
