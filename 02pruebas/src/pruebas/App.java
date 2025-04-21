package pruebas;

public class App {

	public static void main(String[] args) {
		
		Contador miContador = new Contador();
		
		// miContador = 1000; // VIOLA EL ENCAPSULAMIENTO
		
		System.out.println(miContador.mostrar());
		
		miContador.contar();
		System.out.println(miContador.mostrar());
		
		miContador.reiniciar();
		System.out.println(miContador.mostrar());
		

	}

}
