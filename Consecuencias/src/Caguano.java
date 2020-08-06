public class Caguano extends Carro {

    // Atributos
    private int alcanceTiro;
    private String colorConfeti;

    // Constructor
    public Caguano() {
    }

    public Caguano(int cantidadOcupantes, String fechaIngreso, int posFila, int posColumna, int alcanceTiro, String colorConfeti) {
        super(cantidadOcupantes, fechaIngreso, posFila, posColumna, 2);
        this.alcanceTiro = alcanceTiro;
        this.colorConfeti = colorConfeti;
    }

    // Getters & Setters
    public int getAlcanceTiro() {
        return alcanceTiro;
    }

    public void setAlcanceTiro(int alcanceTiro) {
        this.alcanceTiro = alcanceTiro;
    }

    public String getColorConfeti() {
        return colorConfeti;
    }

    public void setColorConfeti(String colorConfeti) {
        this.colorConfeti = colorConfeti;
    }

    @Override
    public String toString() {
        return "Caguano{" +
                "AlcanceTiro=" + alcanceTiro +
                ", ColorConfeti='" + colorConfeti + '\'' +
                '}';
    }
}