package Ej1;

public class Persona {
	//nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.

	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	public Persona(String DNI) {
		super();
		this.DNI = DNI;
	}
	public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura=0;
		this.sexo=sexo;
		this.DNI="1111111Z";
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

}

