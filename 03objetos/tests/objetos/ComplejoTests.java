package objetos;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



// PROJECT > CREAR "SOURCE FOLDER" LLAMADA "TESTS" > PACKAGE LLAMADO IGUAL AL DE LA CLASE A TESTEAR >
// CREAR JUNIT TEST CASE

class ComplejoTests {
	
//	Complejo miComplejo;
//	
//	@BeforeEach
//	void inicializar() {
//		miComplejo = new Complejo();
//	}

	@Test
	void sumar() {
		
		// Arrange
		Complejo c1 = new Complejo(1, 0.1);
		Complejo c2 = new Complejo(-1, 0.2);
		
		// Act
		Complejo obtenido = c1.sumar(c2);
		
		// Assert
		Complejo esperado = new Complejo(0, 0.1+0.2); // rompe sin el margen de error si no sumamos acá
		assertEquals(esperado, obtenido);
		
		
//		double margenError = 0.000000001; // las ctes no se setean así, solo por ahora
//		assertEquals(esperado.real, obtenido.real, margenError);
//		assertEquals(esperado.imaginaria, obtenido.imaginaria, 0.000000001);
		
		// falla porque los doubles se redondean entonces no dan igual
//		assertEquals(esperado.real, obtenido.real);
//		assertEquals(esperado.imaginario, obtenido.imaginario);
		
		
		
		
	}

}
