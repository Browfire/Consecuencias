
public class Carro {
	
	// Atributos
    private int cantidadOcupantes;
    private String fechaIngreso;
    private int ubicacionFila;
    private int ubicacionColumna;
    private int numeroImpactos;
    private int espacios;

    // Constructor
    public Carro() {
    }

    public Carro(int cantidadOcupantes, String fechaIngreso, int ubicacionFila, int ubicacionColumna, int numeroImpactos, int espacios) {
        this.cantidadOcupantes = cantidadOcupantes;
        this.fechaIngreso = fechaIngreso;
        this.ubicacionFila = ubicacionFila;
        this.ubicacionColumna = ubicacionColumna;
        this.numeroImpactos = numeroImpactos;
        this.espacios = espacios;
    }
    
    // Getters & Setters
    public int getCantidadOcupantes() {
        return cantidadOcupantes;
    }

    public void setCantidadOcupantes(int cantidadOcupantes) {
        this.cantidadOcupantes = cantidadOcupantes;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getUbicacionFila() {
        return ubicacionFila;
    }

    public void setUbicacionFila(int ubicacionFila) {
        this.ubicacionFila = ubicacionFila;
    }

    public int getUbicacionColumna() {
        return ubicacionColumna;
    }

    public void setUbicacionColumna(int ubicacionColumna) {
        this.ubicacionColumna = ubicacionColumna;
    }
    
    public int getNumeroImpactos() {
        return numeroImpactos;
    }

    public void setNumeroImpactos(int numeroImpactos) {
        this.numeroImpactos = numeroImpactos;
    }
    
    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }
    
    @Override
    public String toString() {
        return "Carro{" +
                "CantidadOcupantes=" + cantidadOcupantes +
                ", FechaIngreso='" + fechaIngreso + '\'' +
                ", UbicacionFila=" + ubicacionFila +
                ", UbicacionColumna=" + ubicacionColumna +
                '}';
    }

   public void DesplegarDatos(){
        System.out.println("La cantidad de ocupantes es: "+getCantidadOcupantes());
        System.out.println("Fecha de Ingreso: "+getFechaIngreso());
        System.out.println("Las Cordenadas son: "+getUbicacionFila()+","+getUbicacionColumna());
    }
   
}