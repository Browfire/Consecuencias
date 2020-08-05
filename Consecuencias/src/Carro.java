
public class Carro {
	
	// Atributos
    private int cantidadOcupantes;
    private String fechaIngreso;
    private int posFila;
    private int posColumna;
    private int numeroImpactos;
    private int espacios;

    // Constructor
    public Carro() {
    }

    public Carro(int cantidadOcupantes, String fechaIngreso, int posFila, int posColumna, int espacios) {
        this.cantidadOcupantes = cantidadOcupantes;
        this.fechaIngreso = fechaIngreso;
        this.posFila = posFila;
        this.posColumna = posColumna;
        this.numeroImpactos = 0;
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

    public int getposFila() {
        return posFila;
    }

    public void setposFila(int posFila) {
        this.posFila = posFila;
    }

    public int getposColumna() {
        return posColumna;
    }

    public void setposColumna(int posColumna) {
        this.posColumna = posColumna;
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
                ", posFila=" + posFila +
                ", posColumna=" + posColumna +
                '}';
    }

   public void DesplegarDatos(){
        System.out.println("La cantidad de ocupantes es: "+getCantidadOcupantes());
        System.out.println("Fecha de Ingreso: "+getFechaIngreso());
        System.out.println("Las Cordenadas son: "+getposFila()+","+getposColumna());
    }
   
}