
public class Huevo {
	
	// Atributos
	public String fila;
	public String columna;
	private int puntajeObtenido;
	
	// Constructor
	public Huevo() {
	}

	public Huevo(String fila, String columna, int puntajeObtenido) {
		this.fila = fila;
		this.columna = columna;
		this.puntajeObtenido = puntajeObtenido;
	}

	// Getters & Setters
	public String getFila() {
		return fila;
	}

	public String getColumna() {
		return columna;
	}

	public int getPuntajeObtenido() {
		return puntajeObtenido;
	}

	public void setFila(String fila) {
		this.fila = fila;
	}

	public void setColumna(String columna) {
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