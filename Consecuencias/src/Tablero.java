import java.util.ArrayList;

public class Tablero {
	
	// Atributos
	private Carro[] listaCarros = new Carro[18];
	private ArrayList<Huevo> listaHuevos = new ArrayList<>();
	public char[][] tablero = new char[15][15];
	
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
	
	// Métodos
	public void crearCarro() {
		// Crea 3 objetos de tipo Kromi
		crearKromis();
		// Crea 5 objetos de tipo Caguano
		crearCaguanos();
		// Crea 10 objetos de tipo Trupalla
		crearTrupallas();
	}
	
	public boolean lanzarHuevo() {
		// Retorna falso si el lanzamiento no es válido
		return false;
	}
	
	public void mostrarMatriz() {
		// Muestra el tablero por consola
		for(int i = 0; i<tablero.length; i++) {
            for(int x = 0; x<tablero[i].length; x++) {
                System.out.print("|"+tablero[i][x] + "|");
            }
            System.out.println();
        }
	}
	
	public void calcularPuntaje() {
		
	}
	
	public int puntajeTotal() {
		// Obtiene la suma de los puntajes almacenados en listaHuevos 
        int puntosTotales = 0;
        
        puntosTotales = listaHuevos.stream()
                .mapToInt(o -> o.getPuntajeObtenido())
                .sum();

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
			if(validarKromi(posFila,posColumna)) {
				kromis++;
				// Crea un objeto de tipo Kromi según corresponda
				switch (kromis) {
					case 1:
						listaCarros[0] = new Kromi(8, "29/10/2019", posFila, posColumna, 2014, "Volvo");
					case 2:
						listaCarros[1] = new Kromi(7, "29/10/2019", posFila, posColumna, 2014, "Volvo");
					case 3:	
						listaCarros[2] = new Kromi(12, "29/10/2019", posFila, posColumna, 2016, "Mercedes Benz");
					default:
						System.err.println("Error creando kromis");
						break;
				}
			}
			
		} while (kromis<3);
		// Kromi(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna, añoFabricacion, marca)
	}
	
	private void crearCaguanos() {
		// Termina cuando caguanos = 5
		int caguanos = 0;
		do {
			
			// Obtenemos una coordenada aleatoria
			int posFila = randomNumber();
			int posColumna = randomNumber();
					
			// Validamos si hay espacio en la matriz
			if(validarCaguano(posFila,posColumna)) {
				caguanos++;
				// Crea un objeto de tipo Caguano según corresponda
				switch (caguanos) {
					case 1:
						listaCarros[3] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
					case 2:
						listaCarros[4] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
					case 3:	
						listaCarros[5] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
					case 4:
						listaCarros[6] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
					case 5:
						listaCarros[7] = new Caguano(8, "29/10/2019", posFila, posColumna, 100, "rojo");
					default:
						System.err.println("Error creando caguanos");
						break;
				}
			}
					
		} while (caguanos<5);
		//  Caguano(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna, alcanceTiro, colorConfeti)
	}
	
	private void crearTrupallas() {
		// Termina cuando trupallas = 10
		int trupallas = 0;
		do {
			
			// Obtenemos una coordenada aleatoria
			int posFila = randomNumber();
			int posColumna = randomNumber();
					
			// Validamos si hay espacio en la matriz
			if(validarTrupalla(posFila,posColumna)) {
				trupallas++;
				// Crea un objeto de tipo Trupalla según corresponda
				switch (trupallas) {
					case 1:
						listaCarros[8] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Jorge");
					case 2:
						listaCarros[9] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Juan");
					case 3:	
						listaCarros[10] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Mario");
					case 4:
						listaCarros[11] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Matías");
					case 5:
						listaCarros[12] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Luis");
					case 6:
						listaCarros[13] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Elías");
					case 7:
						listaCarros[14] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Adolfo");
					case 8:
						listaCarros[15] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Gabriel");
					case 9:
						listaCarros[16] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Alex");
					case 10:
						listaCarros[17] = new Trupalla(8, "29/10/2019", posFila, posColumna, 150, "Raúl");
					default:
						System.err.println("Error creando trupallas");
						break;
				}
			}
					
		} while (trupallas<10);
		// Trupalla(cantidadOcupantes, fechaIngreso, ubicacionFila, ubicacionColumna, nivelArmadura, nombreConductor)
	}
	
	private int randomNumber() {
		// Método que retorna un número entero aleatorio entre 0 y 14
		int a = (int) (Math.random()*14 + 1);

		return a;
	}
	
	private boolean validarKromi(int posFila, int posColumna) {
		
		boolean espacioLibre = false;	// True si el espacio está disponible
		
		// Verifica que el objeto no salga de la matriz
		if(posFila+2 < 15 && posColumna < 15) {
			// Verifica que el objeto tenga espacio disponible
			for(int i=0; i<3; i++) {
				if(tablero[posFila+i][posColumna] != '\u0000') {
					espacioLibre = false;
					break;
				}else {
					espacioLibre = true;
				}
			}
		}
		
		return espacioLibre;
	}
	
	private boolean validarCaguano(int posFila, int posColumna) {
		
		boolean espacioLibre = false;	// True si el espacio está disponible
		
		// Verifica que el objeto no salga de la matriz
		if(posFila < 15 && posColumna+1 < 15) {
			// Verifica que el objeto tenga espacio disponible
			for(int i=0; i<2; i++) {
				if(tablero[posFila][posColumna+i] != '\u0000') {
					espacioLibre = false;
					break;
				}else {
					espacioLibre = true;
				}
			}
		}
		
		return espacioLibre;
	}
	
	private boolean validarTrupalla(int posFila, int posColumna) {
		
		boolean espacioLibre = false;	// True si el espacio está disponible
		
		// Verifica que el objeto no salga de la matriz
		if(posFila < 15 && posColumna < 15) {
			// Verifica que el objeto tenga espacio disponible
			if(tablero[posFila][posColumna] != '\u0000') {
				espacioLibre = false;
			}else {
				espacioLibre = true;
			}
		}
		
		return espacioLibre;
	}
	
}