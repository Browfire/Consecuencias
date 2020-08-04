
public class Kromi extends Carro{

	// Atributos
    private int anioFabricacion;
    private String marca;
    
    
    // Constructor
    public Kromi() {
    }

    public Kromi(int cantidadOcupantes, String fechaIngreso, int ubicacionFila, int ubicacionColumna, int anioFabricacion, String marca) {
        super(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna, 3);
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
    }

    // Getters & Setters
    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Kromi{" +
                "AñoFabricacion=" + anioFabricacion +
                ", Marca='" + marca + '\'' +
                '}';
    }

}