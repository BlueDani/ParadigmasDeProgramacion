package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContadorTests {

	Contador miContador;
	
	@BeforeEach
	void inicializar() {
		miContador = new Contador(); 
		// se ejecuta antes de cada test
		// la declaro antes y por fuera porque la usamos en todo el scope mas grande, sino muere aca mismo
	}
	
	@Test
	void contadorNuevo_IniciaEnCero() { // convencion nombre tests: contextoResultadoEsperado
		
		// ARRANGE
		// ahora esta en el @BeforeEach
		// Contador miContador = new Contador();
		
		// ACT
		long obtenido = miContador.mostrar();
		
		// ASSERT
		assertEquals(0, obtenido);
		
		// ANNIHILATE = restaurar todo, dejandolo como estaba antes
	}
	
	@Test
	void contadorNuevo_CuentaUno() {
		
		//Contador miContador = new Contador();
		miContador.contar();
	
		assertEquals(1, miContador.mostrar());
	}
	
	@Test
	void contadorNuevo_VuelveACero() {
		
		//Contador miContador = new Contador();
		miContador.contar();
		miContador.reiniciar();
	
		assertEquals(0, miContador.mostrar());
	}
	
	@Test
	void contadorNuevo_CuentaCien() {
		
		for(int i=0; i<100; i++) {
			
			miContador.contar();
		}
	
		assertEquals(100, miContador.mostrar());
	}
	
	@Test
	void contadorNuevo_RomperElCodigo() { 
		// se cambio valor de int a long
		// el next level, cuando nos quedamos cortos con long, es usar BigInteger
		
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			
			miContador.contar();
		}
		assertEquals(2147483647, miContador.mostrar());

		miContador.contar();
		assertEquals(2147483648L, miContador.mostrar()); 
	}

}
