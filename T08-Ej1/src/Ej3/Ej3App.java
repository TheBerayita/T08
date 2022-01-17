package Ej3;

import javax.swing.JOptionPane;

public class Ej3App {
	public static void main(String[] args) {
		Electrodomesticos e1 = new Electrodomesticos();
		Electrodomesticos e2 = new Electrodomesticos(150, 8);
		int precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce un precio"));
		String consumo = JOptionPane.showInputDialog("Introduce un consumo(A,B,C,D,E,F)");
		consumo = consumo.toUpperCase();
		Consumo cs = Consumo.F;
		switch (consumo) {
		case "A":
			cs = Consumo.A;
			break;
		case "B":
			cs = Consumo.B;
			break;
		case "C":
			cs = Consumo.C;
			break;
		case "D":
			cs = Consumo.D;
			break;
		case "E":
			cs = Consumo.E;
			break;
		case "F":
			cs = Consumo.F;
			break;

		default:
			System.out.println("Opcion no disponible");
			cs = Consumo.F;
			break;

		}
		String colore = JOptionPane.showInputDialog("Introduce un Color(blanco, negro, rojo, azul, gris)");
		colore=colore.toLowerCase();
		Color c = Color.blanco;
		switch (colore) {
		case "blanco":
			c = Color.blanco;
			break;
		case "negro":
			c = Color.negro;
			break;
		case "rojo":
			c = Color.rojo;
			break;
		case "azul":
			c = Color.azul;
			break;
		case "gris":
			c = Color.gris;
			break;
		default:
			System.out.println("Color no disponible, color blanco seleccionado");
			c = Color.blanco;
			break;
		}
		int peso = Integer.parseInt(JOptionPane.showInputDialog("Introduce un peso"));

		Electrodomesticos e3 = new Electrodomesticos(precio, cs, c, peso);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}
}
