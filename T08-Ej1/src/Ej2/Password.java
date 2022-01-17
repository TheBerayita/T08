package Ej2;

import java.util.Random;

//@author Albert Perez

public class Password {

	private int longitud;
	private String contraseña = "";
	Random claseRandom = new Random();

	public Password() {
		this.longitud = 8;
		this.contraseña = "12345678";
	}

	public Password(int longitud) {
		this.longitud = longitud;

		for (int i = 0; i < longitud; i++) {
			contraseña += Integer.toString(claseRandom.nextInt(8));
		}
	}

	public String toString() {
		return "Password [Longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
