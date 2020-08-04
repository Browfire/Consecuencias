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
		for(byte k = 0; k<3; k++) {
			crearKromi();
		}
		// Crea 5 objetos de tipo Caguano
		for(byte c = 0; c<5; c++) {
			crearCaguano();
		}
		// Crea 10 objetos de tipo Trupalla
		for(short t = 0; t<10; t++) {
			crearTrupalla();
		}
	}
	
	public boolean lanzarHuevo() {
		// Retorna falso si el lanzamiento no es válido
		return false;
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
	
	private void crearKromi() {
		// Obtenemos una coordenada aleatoria
		int posFila = randomNumber();
		int posColumna = randomNumber();
		// Validamos si hay espacio en la matriz
		validarKromi(posFila,posColumna);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}
	
	private void crearCaguano() {
		// Obtenemos una coordenada aleatoria
		int posFila = randomNumber();
		int posColumna = randomNumber();
		// Validamos si hay espacio en la matriz
		validarCaguano(posFila,posColumna); 
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}
	
	private void crearTrupalla() {
		// Obtenemos una coordenada aleatoria
		int posFila = randomNumber();
		int posColumna = randomNumber();
		// Validamos si hay espacio en la matriz
		validarTrupalla(posFila,posColumna);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
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