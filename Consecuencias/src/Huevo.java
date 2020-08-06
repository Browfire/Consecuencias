public class Huevo {

    // Atributos
    private int posFila;
    private int posColumna;
    private int puntajeObtenido;

    // Constructor
    public Huevo() {
    }

    public Huevo(int posFila, int posColumna, int puntajeObtenido) {
        this.posFila = posFila;
        this.posColumna = posColumna;
        this.puntajeObtenido = puntajeObtenido;
    }

    // Getters & Setters
    public int getFila() {
        return posFila;
    }

    public int getColumna() {
        return posColumna;
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public void setFila(int posFila) {
        this.posFila = posFila;
    }

    public void setColumna(int posColumna) {
        this.posColumna = posColumna;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }

    @Override
    public String toString() {
        return "Huevo [posFila=" + posFila + ", posColumna=" + posColumna + ", puntajeObtenido=" + puntajeObtenido + "]";
    }

}