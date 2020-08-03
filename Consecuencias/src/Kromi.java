
public class Kromi extends Carro{

	// Atributos
    private int fechaFabricacion;
    private String marca;
    
    // Constructor
    public Kromi() {
    }

    public Kromi(int cantidadOcupantes, String fechaIngreso, int ubicacionFila, int ubicacionColumna, int fechaFabricacion, String marca) {
        super(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna);
        this.fechaFabricacion = fechaFabricacion;
        this.marca = marca;
    }

    // Getters & Setters
    public int getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(int fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
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
                "FechaFabricacion=" + fechaFabricacion +
                ", Marca='" + marca + '\'' +
                '}';
    }

}