import java.util.ArrayList;

public class Tablero {

    // Atributos
    private Carro[] listaCarros = new Carro[18];
    private ArrayList<Huevo> listaHuevos = new ArrayList<>();
    private char[][] tablero = new char[15][15];
    private int indexCarros[][] = new int[15][15];

    // Constructor
    public Tablero() {
    }

    // Getters & Setters
    public Carro[] getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(Carro[] listaCarros) {
        this.listaCarros = listaCarros;
    }

    public ArrayList<Huevo> getListaHuevos() {
        return listaHuevos;
    }

    public void setListaHuevos(ArrayList<Huevo> listaHuevos) {
        this.listaHuevos = listaHuevos;
    }

    public char[][] getTablero() {
        return tablero;
    }

    public void setTablero(char[][] tablero) {
        this.tablero = tablero;
    }

    public int[][] getIndexCarros() {
        return indexCarros;
    }

    public void setIndexCarros(int[][] indexCarros) {
        this.indexCarros = indexCarros;
    }

    // Métodos

    public void crearCarro() {
        formatearIndex();
        // Crea 3 objetos de tipo Kromi
        crearKromis();
        // Crea 5 objetos de tipo Caguano
        crearCaguanos();
        // Crea 10 objetos de tipo Trupalla
        crearTrupallas();
    }

    public void formatearIndex() {
        for (int i = 0; i < indexCarros.length; i++) {
            for (int x = 0; x < indexCarros[i].length; x++) {
                indexCarros[i][x] = -1;
            }
        }
    }

    public boolean lanzarHuevo(int posFila, int posColumna) {
        // Valida el lanzamiento
        if (validarDisparo(posFila, posColumna)) {
            int puntajeObtenido = 0;
            // Verifica si se golpea un carro
            if (golpeaCarro(posFila, posColumna)) {
                // Calcula el puntaje del lanzamiento
                puntajeObtenido = calcularPuntaje(posFila, posColumna);
            }
            // Agrega el objeto a la lista
            listaHuevos.add(new Huevo(posFila, posColumna, puntajeObtenido));
            // Registra el lanzamiento en en el tablero
            tablero[posFila][posColumna] = 'H';
            return true;
        } else {
            return false;
        }
    }

    public boolean validarDisparo(int posFila, int posColumna) {
        // Verifica que el disparo no salga de la matriz
        if (posFila >= 0 || posFila < 15 || posColumna >= 0 || posColumna < 15) {
            return true;

        } else {
            return false;
        }
    }

    public boolean golpeaCarro(int posFila, int posColumna) {
        if (indexCarros[posFila][posColumna] >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int calcularPuntaje(int posFila, int posColumna) {
        // Identifica cual fue el carro impactado
        int index = indexCarros[posFila][posColumna];
        // Verifica la cantidad de impactos que tiene el carro y los espacios que ocupa
        int impactos = listaCarros[index].getNumeroImpactos() + 1;
        int espacios = listaCarros[index].getEspacios();
        // carroDestruido será true si el impacto destruyó el carro
        boolean carroDestruido = (impactos == espacios);

        char carroImpactado = tablero[posFila][posColumna];
        int puntajeTotal = 0;

        switch (carroImpactado) {
            case 'K':
                puntajeTotal += 3;
                if (carroDestruido) {
                    puntajeTotal += 10;
                }
                break;
            case 'C':
                puntajeTotal += 2;
                if (carroDestruido) {
                    puntajeTotal += 7;
                }
                break;
            case 'T':
                puntajeTotal += 1;
                break;
            default:
                puntajeTotal = 0;
        }
        // Suma el impacto a la cantidad total
        listaCarros[index].setNumeroImpactos(impactos);
        // Registra el impacto en la matriz indexCarros
        indexCarros[posFila][posColumna] = -1;

        return puntajeTotal;
    }

    public void mostrarMatriz() {
        // Muestra el tablero por consola

        for (int i = 0; i < tablero.length; i++) {
            for (int x = 0; x < tablero[i].length; x++) {

                System.out.print("[" + tablero[i][x] + "]");

            }
            System.out.println();
        }
    }

    public int puntajeTotal() {
        // Obtiene la suma de los puntajes almacenados en listaHuevos
        int puntosTotales = 0;

        puntosTotales = listaHuevos.stream()
                .mapToInt(o -> o.getPuntajeObtenido())
                .sum();

        System.out.println("el puntaje es " + "[ " + puntosTotales + " ]");
        return puntosTotales;
    }

    private void crearKromis() {
        // Termina cuando kromis = 3
        int kromis = 0;
        do {

            // Obtenemos una coordenada aleatoria
            int posFila = randomNumber();
            int posColumna = randomNumber();

            // Validamos si hay espacio en la matriz
            if (validarKromi(posFila, posColumna)) {
                kromis++;
                // Crea un objeto de tipo Kromi según corresponda
                switch (kromis) {
                    case 1:
                        listaCarros[0] = new Kromi(8, "29/10/2019", posFila, posColumna, 2014, "Volvo");
                        break;
                    case 2:
                        listaCarros[1] = new Kromi(7, "29/10/2019", posFila, posColumna, 2014, "Volvo");
                        break;
                    case 3:
                        listaCarros[2] = new Kromi(12, "29/10/2019", posFila, posColumna, 2016, "Mercedes Benz");
                        break;

                    default:
                        System.err.println("Error creando kromis");
                }
                // Registra el objeto en el tablero y lo indexa en indexCarros
                for (int k = 0; k < 3; k++) {
                    tablero[posFila + k][posColumna] = 'K';
                    indexCarros[posFila + k][posColumna] = kromis - 1;
                }
            }

        } while (kromis < 3);
        // Kromi(cantidadOcupantes, fechaIngreso, posFila, posColumna, añoFabricacion, marca)
    }

    private void crearCaguanos() {
        // Termina cuando caguanos = 5
        int caguanos = 0;
        do {

            // Obtenemos una coordenada aleatoria
            int posFila = randomNumber();
            int posColumna = randomNumber();

            // Validamos si hay espacio en la matriz
            if (validarCaguano(posFila, posColumna)) {
                caguanos++;
                // Crea un objeto de tipo Caguano según corresponda
                switch (caguanos) {
                    case 1:
                        listaCarros[3] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
                        break;
                    case 2:
                        listaCarros[4] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
                        break;
                    case 3:
                        listaCarros[5] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
                        break;
                    case 4:
                        listaCarros[6] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
                        break;
                    case 5:
                        listaCarros[7] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
                        break;
                    default:
                        System.err.println("Error creando caguanos");
                }
                // Registra el objeto en el tablero y lo indexa en indexCarros
                for (int c = 0; c < 2; c++) {
                    tablero[posFila][posColumna + c] = 'C';
                    indexCarros[posFila][posColumna + c] = caguanos + 2;
                }
            }

        } while (caguanos < 5);
        //  Caguano(cantidadOcupantes, fechaIngreso, posFila, posColumna, alcanceTiro, colorConfeti)
    }

    private void crearTrupallas() {
        // Termina cuando trupallas = 10
        int trupallas = 0;
        do {

            // Obtenemos una coordenada aleatoria
            int posFila = randomNumber();
            int posColumna = randomNumber();

            // Validamos si hay espacio en la matriz
            if (validarTrupalla(posFila, posColumna)) {
                trupallas++;
                // Crea un objeto de tipo Trupalla según corresponda
                switch (trupallas) {
                    case 1:
                        listaCarros[8] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Jorge");
                        break;
                    case 2:
                        listaCarros[9] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Juan");
                        break;
                    case 3:
                        listaCarros[10] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Mario");
                        break;
                    case 4:
                        listaCarros[11] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Matías");
                        break;
                    case 5:
                        listaCarros[12] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Luis");
                        break;
                    case 6:
                        listaCarros[13] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Elías");
                        break;
                    case 7:
                        listaCarros[14] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Adolfo");
                        break;
                    case 8:
                        listaCarros[15] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Gabriel");
                        break;
                    case 9:
                        listaCarros[16] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Alex");
                        break;
                    case 10:
                        listaCarros[17] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Raúl");
                        break;
                    default:
                        System.err.println("Error creando trupallas");
                }
                // Registra el objeto en el tablero y lo indexa en indexCarros

                tablero[posFila][posColumna] = 'T';
                indexCarros[posFila][posColumna] = trupallas + 7;
            }

        } while (trupallas < 10);
        // Trupalla(cantidadOcupantes, fechaIngreso, posFila, posColumna, nivelArmadura, nombreConductor)
    }

    private int randomNumber() {
        // Método que retorna un número entero aleatorio entre 0 y 14
        int a = (int) (Math.random() * 14 + 0);

        return a;
    }

    private boolean validarKromi(int posFila, int posColumna) {

        boolean espacioLibre = false;    // True si el espacio está disponible

        // Verifica que el objeto no salga de la matriz
        if (posFila + 2 < 15 && posColumna < 15) {
            // Verifica que el objeto tenga espacio disponible
            for (int i = 0; i < 3; i++) {
                if (tablero[posFila + i][posColumna] != '\u0000') {
                    espacioLibre = false;
                    return espacioLibre;
                } else {
                    espacioLibre = true;
                }
            }
        }

        return espacioLibre;
    }

    private boolean validarCaguano(int posFila, int posColumna) {

        boolean espacioLibre = false;    // True si el espacio está disponible

        // Verifica que el objeto no salga de la matriz
        if (posFila < 15 && posColumna + 1 < 15) {
            // Verifica que el objeto tenga espacio disponible
            for (int i = 0; i < 2; i++) {
                if (tablero[posFila][posColumna + i] != '\u0000') {
                    espacioLibre = false;
                    return espacioLibre;
                } else {
                    espacioLibre = true;
                }
            }
        }

        return espacioLibre;
    }

    private boolean validarTrupalla(int posFila, int posColumna) {

        boolean espacioLibre = false;    // True si el espacio está disponible

        // Verifica que el objeto no salga de la matriz
        if (posFila < 15 && posColumna < 15) {
            // Verifica que el objeto tenga espacio disponible
            if (tablero[posFila][posColumna] != '\u0000') {
                espacioLibre = false;
            } else {
                espacioLibre = true;
            }
        }

        return espacioLibre;
    }

}