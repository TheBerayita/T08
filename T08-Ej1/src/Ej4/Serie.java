package Ej4;

public class Serie {

	private String Titulo;
	private double numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {

		this.Titulo = "";
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {

		this.Titulo = titulo;
		this.numTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, double numTemporadas, String genero, String creador) {
		super();
		this.Titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String toString() {
		return "Serie [Titulo=" + Titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

}
