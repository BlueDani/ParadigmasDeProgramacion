package objetos;

import java.util.Objects;

public class Circulo implements Comparable<Circulo>{
	
	private double radio;
	//private double radio = 1; REQUIERE DEL CTOR VACIO SINO NO FUNCIONA, ES MAS CLARO COMO YA ESTA HECHO
	
	public Circulo() {
		
		this(1); // para que llame al ctor de abajo ES LO QUE PREFIERE LUCAS
		//this.radio = 1; // opcion que no esta mal epro no la elegimos
	}
	
	public Circulo(double radio) {
		
		if(esNoValido(radio)) {
			throw new Error("Todo mal");
		}
		
		this.radio = radio;
	}
	
	private boolean esNoValido(double radio) {
		
		return radio <= 0;
	}
	
	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getArea() {
		// definir una variable como final implica que el valor, una vez seteado, no va a poder cambiar nunca
		// se usa para definir un valor constante
		final double pi = 3.14;
		
		// podemos invocar Constantes sin necesidad de isntanciarlo y guardarlo en una variable porque es static
		return Constantes.PI * radio * radio;
		// en realidad usamos "Math.PI"
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

	@Override
	public int compareTo(Circulo o) {
		
		return Double.compare(this.radio, o.radio);
	}
	
	

}
