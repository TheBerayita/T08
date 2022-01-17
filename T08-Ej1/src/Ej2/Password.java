package Ej2;

import java.util.Random;

//@author Albert Perez

public class Password {

	private int longitud;
	private String contrase�a = "";
	Random claseRandom = new Random();

	public Password() {
		this.longitud = 8;
		this.contrase�a = "12345678";
	}

	public Password(int longitud) {
		this.longitud = longitud;

		for (int i = 0; i < longitud; i++) {
			contrase�a += Integer.toString(claseRandom.nextInt(8));
		}
	}

	public String toString() {
		return "Password [Longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}

}
