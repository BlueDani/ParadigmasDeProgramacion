package luchadoressumo;

import java.util.LinkedList;
import java.util.List;

public class Torneo {
	
	
	// CON LISTAS
	private List<Luchador> luchadores;
	private List<Integer> resultados;
	
	
	public Torneo() {
		
		luchadores = new LinkedList<Luchador>();
		resultados = new LinkedList<Integer>();
	}
	
	public void agregarLuchador(Luchador luchador) {
		
		luchadores.add(luchador);
	}
	
	public void calcularResultadosTorneo() {
		
		for (Luchador luchador : luchadores) {
			
			int luchadoresDominados = 0;
						
			for (Luchador luchadorOtro : luchadores) {
				
				if(!luchador.equals(luchadorOtro) && luchador.dominaA(luchadorOtro)) {
					luchadoresDominados++;
				}
			}
			resultados.addLast(luchadoresDominados);
		}	
	}
	
	public void mostrarResultados() {
		
		for (Integer resultado : resultados) {
			System.out.println(resultado);
		}
	}
	
	
}


// CON VECTORES
//private Luchador[] luchadores; 


// public Torneo(int cantidadLuchadores) {
// 	
// 	luchadores = new Luchador[cantidadLuchadores];
//
// }

// public void agregarLuchador(Luchador luchador) {
//    if (ultimo < luchadores.length) {
//        this.luchadores[ultimo] = luchador;
//        ultimo++;
//    }

