package pruebas;

public class Contador {
	
	long valor = 0;

	// responsabilidades
	// 1. contar: x += 1 (SIEMPRE se puede)
	// 2. reiniciar: x = 0 (SIEMPRE se puede)
	// 3. mostrar: x (SIEMPRE se puede)
	
	/*
	 * PRUEBAS
	 * clic derecho en el project > propiedades > Java Build Path > Libraries > 
	 * clic en ClassPath > Add Library > JUnit 5 que es la ultima
	 * (la JRE va en el ModulePath y la JUnit va en el Classpath)
	 */
	
	public void contar() {
		valor++;
		
		// para ponerle un tope de 9999 y reiniciarlo cuando lo alcanza:
		// this.valor = (this.valor + 1) % 10000;
	}
	
	
	public void reiniciar() {
		valor = 0;
	}
	
	public long mostrar(){
		return valor;		
	}

}
