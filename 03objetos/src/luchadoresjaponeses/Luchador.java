package luchadoresjaponeses;

public class Luchador {
	
	/*
	 * un combatiente ‘domina’ a otro si lo supera en 
		ambas medidas, o bien si lo iguala en peso y lo 
		supera en altura, o viceversa.
	 */
	double peso;
	double altura;
	
	public Luchador(double peso, double altura) {
		
		this.peso = peso;
		this.altura = altura;
	}
	
	public boolean dominaA(Luchador otro) {
		
//		if(this.peso > otro.peso && this.altura > otro.altura) {
//			return true;
//		}
//		else if(this.peso == otro.peso && this.altura > otro.altura) {
//			return true;
//		}
//		else if(this.peso > otro.peso && this.altura == otro.altura) {
//			return true;
//		}
		
		if(otro.peso < this.peso || otro.altura < this.altura) { // ES SUFICIENTE ESTO
			return true;
			
		}
		
		return false;
	}
	

}
