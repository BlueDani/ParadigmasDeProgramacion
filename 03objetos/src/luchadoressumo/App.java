package luchadoressumo;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		
		Luchador[] luchadoresTorneo = {
                new Luchador(300, 1500),
                new Luchador(320, 1500),
                new Luchador(299, 1580), 
                new Luchador(330, 1690),
                new Luchador(330, 1540),
                new Luchador(339, 1500),
                new Luchador(298, 1700),
                new Luchador(344, 1570),
                new Luchador(276, 1678),
                new Luchador(289, 1499)
		};
		
		Luchador lucho = new Luchador(200,1500);
		
		Luchador[] luchadoresOtros = {
                new Luchador(100, 1500), // contra este GANA por peso
                new Luchador(200, 1400), // contra este GANA por altura
                new Luchador(300, 1500), // contra este PIERDE por peso
                new Luchador(200, 2000), // contra este PIERDE por altura
        };
		
		Torneo torneo = new Torneo();
		
		for (Luchador luchador : luchadoresTorneo) {
			torneo.agregarLuchador(luchador);
		}
		
		torneo.calcularResultadosTorneo();
		torneo.mostrarResultados();
		
		//torneo.agregarLuchador(null);

	}

}
