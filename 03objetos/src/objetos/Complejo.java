package objetos;

import java.util.Objects;

public class Complejo {
	
	// atributos
	double real;
	double imaginaria;
	
	/*
	 * ENCAPSULADA: cuando la clase tinee los metodos tales que ella es responsable de si misma
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
	
	// ctor
	public Complejo(double real, double imaginaria) {
		
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	// metodo sumar()
	public Complejo sumar(Complejo otro) {
		
		return new Complejo(this.real + otro.real, this.imaginaria + otro.imaginaria);
	}


	
	// .equals es un metodo de Object como la clase madre de todos los objetos que permite comparar objetos justamente
	// c1.equals(c2) va a existir porque yo creé la clase Complejo
	// solo tenemos que redefinirlo para que sepa cómo comparar
	
	@Override
	public boolean equals(Object obj) {
		
		// referencias
		if (this == obj)
			return true;
		
		// null
		if (obj == null)
			return false;
		
		// clases
		if (getClass() != obj.getClass())
			return false;
		
		// atributos
		Complejo other = (Complejo) obj; 
		// este obj que ya sé que es Complejo lo casteo para comparar puntualmente los att		
		return Double.doubleToLongBits(imaginaria) == Double.doubleToLongBits(other.imaginaria)
				&& Double.doubleToLongBits(real) == Double.doubleToLongBits(other.real);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(imaginaria, real);
	}

	// con el toString() ya sabe mostrar el objeto completo, sin tener que poner en el syso cada atributo
	@Override
	public String toString() {
		return this.real + " + " + this.imaginaria + "i";
	}
	
	// public mostrarModulo(){}
	
	

}
