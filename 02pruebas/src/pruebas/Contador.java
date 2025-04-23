package pruebas;

public class Contador {
	
	long valor = 0;

	// responsabilidades
	// 1. contar: x += 1 (SIEMPRE se puede)
	// 2. reiniciar: x = 0 (SIEMPRE se puede)
	// 3. mostrar: x (SIEMPRE se puede)
	
	/*
	 * 	ENCAPSULADA: cuando la clase tinee los metodos tales que ella es responsable de si misma
		que no permita que otros objetos de otras clases curioseen sobre sus cosas
		 
		Principios SOLID
		S = responsabilidad única = es responsabilidad de Complejo sabr sumar Complejos
		Pensar: 1) qué necesito que un objeto de esa haga? (métodos), 2) qué necesita el objeto para hacerlo? (atributos), 3) defino el nombre de la clase
		no poner cosas que no se necesitan, aunque sean cosas que suele tener ese objeto
		esta responsabilidad puede estar repartida cuando hay distintos objetos, por ej cuando el cilindro es responsable de calcular su volumen y el circulo es responsable de calcular su superficie para colaborar con otra clase
		también está la composición cuando una clase es atributo de otra.
		O = 
		L = 
		I = 
		D = 
 
	 */
	
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
