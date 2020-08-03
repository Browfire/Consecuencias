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
		// Se deben crear 3 objetos tipo Kromi
		crearKromi();
		// Se deben crear 5 objetos tipo Caguano
		crearCaguano();
		// Se deben crear 10 objetos tipo Trupalla
		crearTrupalla();
	}
	
	public boolean lanzarHuevo() {
		// Retorna falso si el lanzamiento no es válido
		return false;
	}
	
	public int calcularPuntaje() {
		return 0;
	}
	
	private void crearKromi() {
		// Obtenemos una coordenada aleatoria
		int coordX = randomNumber();
		int coordY = randomNumber();
		// Validamos si hay espacio en la matriz
		validarKromi(coordX,coordY);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}
	
	private void crearCaguano() {
		// Obtenemos una coordenada aleatoria
		int coordX = randomNumber();
		int coordY = randomNumber();
		// Validamos si hay espacio en la matriz
		validarCaguano(coordX,coordY);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}
	
	private void crearTrupalla() {
		// Obtenemos una coordenada aleatoria
		int coordX = randomNumber();
		int coordY = randomNumber();
		// Validamos si hay espacio en la matriz
		validarTrupalla(coordX,coordY);
		/*
		 * Una vez validado, se debe crear el objeto y guardarlo
		 */
	}
	
	private int randomNumber() {
		/*
		 *  Método que retorna un número entero aleatorio entre 0 y 14
		 */
		return 0;
	}
	
	private boolean validarKromi(int coordX, int coordY) {
		
		boolean espacioLibre = false;	// True si el espacio está disponible
		
		// Verifica que el objeto no salga de la matriz
		if(coordX+2 < 15 && coordY < 15) {
			// Verifica que el objeto tenga espacio disponible
			for(int i=0; i<3; i++) {
				if(tablero[coordX+i][coordY] != '\u0000') {
					espacioLibre = false;
					break;
				}else {
					espacioLibre = true;
				}
			}
		}
		
		return espacioLibre;
	}
	
	private boolean validarCaguano(int coordX, int coordY) {
		
		boolean espacioLibre = false;	// True si el espacio está disponible
		
		// Verifica que el objeto no salga de la matriz
		if(coordX < 15 && coordY+1 < 15) {
			// Verifica que el objeto tenga espacio disponible
			for(int i=0; i<2; i++) {
				if(tablero[coordX][coordY+i] != '\u0000') {
					espacioLibre = false;
					break;
				}else {
					espacioLibre = true;
				}
			}
		}
		
		return espacioLibre;
	}
	
	private boolean validarTrupalla(int coordX, int coordY) {
		
		boolean espacioLibre = false;	// True si el espacio está disponible
		
		// Verifica que el objeto no salga de la matriz
		if(coordX < 15 && coordY < 15) {
			// Verifica que el objeto tenga espacio disponible
			if(tablero[coordX][coordY] != '\u0000') {
				espacioLibre = false;
			}else {
				espacioLibre = true;
			}
		}
		
		return espacioLibre;
	}
	
}