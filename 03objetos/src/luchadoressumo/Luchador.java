package luchadoressumo;

import java.util.Objects;

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
		
	        if(this.peso == otro.peso && this.altura == otro.altura) {
	            throw new RuntimeException("Error de datos");
	        }
	        // deberia ser responsabilidad de Luchador validar la altura y el peso y !null???

	        return this.peso >= otro.peso && this.altura >= otro.altura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Luchador other = (Luchador) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
	
	
	

}

/*
if(this.peso > otro.peso && this.altura > otro.altura) {
	return true;
}
else if(this.peso == otro.peso && this.altura > otro.altura) {
	return true;
}
else if(this.peso > otro.peso && this.altura == otro.altura) {
	return true;
}		
*/