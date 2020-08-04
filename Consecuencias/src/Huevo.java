
public class Huevo {
	
	// Atributos
	private int fila;
	private int columna;
	private int puntajeObtenido;
	
	// Constructor
	public Huevo() {
	}

	public Huevo(int fila, int columna, int puntajeObtenido) {
		this.fila = fila;
		this.columna = columna;
		this.puntajeObtenido = puntajeObtenido;
	}

	// Getters & Setters
	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	public int getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public void setPuntajeObtenido(int puntajeObtenido) {
		this.puntajeObtenido = puntajeObtenido;
	}

	@Override
	public String toString() {
		return "Huevo [fila=" + fila + ", columna=" + columna + ", puntajeObtenido=" + puntajeObtenido + "]";
	}

}