package Ej3;

public class Electrodomesticos {

	protected double preciob;
	protected Consumo consumo;
	protected Color color;
	protected double peso;

	public Electrodomesticos() {
		super();
		this.preciob = 100;
		this.consumo = consumo.F;
		this.color = color.blanco;
		this.peso = 5;
	}

	public Electrodomesticos(double preciob, Consumo consumo, Color color, double peso) {
		super();
		this.preciob = preciob;
		this.consumo = consumo;
		this.color = color;
		this.peso = peso;
	}

	public Electrodomesticos(double preciob, double peso) {
		super();
		this.preciob = preciob;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [preciob=" + preciob + ", consumo=" + consumo + ", color=" + color + ", peso=" + peso
				+ "]";
	}

}
