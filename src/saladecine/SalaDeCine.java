package saladecine;

public class SalaDeCine {
	private Integer[][] butacas = new Integer[3][3];

	public SalaDeCine(int fila, int columna) {
		butacas = new Integer[fila][columna];
	}

	// Se inicializa la matriz
	public void inicializarMatriz() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				butacas[i][j] = 0;
			}
		}
	}

	// Se ve de forma "grafica" las filas y columnas de la sala
	public void mostrarButacas() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				System.out.print(butacas[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Se verifica si la sala esta completamente vacia o si alguna butaca esta ocupada
	public void verificarSalaVacia() {
		Integer filas = butacas.length;
		Integer columnas = butacas[0].length;
		Integer ocupado = 0;

		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if (butacas[i][j] != 0) {
					ocupado++;
				}
			}
		}
		if (ocupado == 0) {
			System.out.println("La sala esta vacia");
		} else if (ocupado == filas * columnas) {
			System.out.println("La sala esta llena");
		} else {
			System.out.println("Hay butacas ocupadas en la sala");
		}
	}

	// Se verifica si la butaca seleccionada por fila y columna esta ocupada
	public boolean verificarButacaOcupada(int fila, int columna) {
		if (butacas[fila][columna] == 1) {
			System.out.println("La butaca especificada esta Ocupada");
			return true;
		} else {
			System.out.println("La butaca especificada esta Vacia");
			return false;
		}

	}

	// Se indica que butaca se va a ocupar y en caso de estar ocupada se hace saber
	public boolean ocuparButacaEspecifica(int fila, int columna) {
		if (butacas[fila][columna] == 0) {
			butacas[fila][columna] = 1;
			System.out.println("Se completo la opéracion");
			return true;
		} else {
			System.out.println("La butaca esta ocupada");
			return false;
		}

	}

	// Se ve la cantidad de butacas que estan ocupadas en la sala
	public void consultarCantidadButacasOcupadas() {
		Integer contador = 0;

		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if (butacas[i][j] == 0) {
					;
				} else {
					contador++;
				}
			}
		}
		System.out.println("Hay " + contador + " butacas ocupada/s");
	}

	// Se verifica si hay espacio para X cantidad de personas de forma contigua
	//Comentario para subir
	public Boolean hayEspacioPara(Integer cantidadDePersonas) {
		for (int i = 0; i < butacas.length; i++) {
			int butacasContiguas = 0;
			for (int j = 0; j < butacas[i].length; j++) {
				if (butacas[i][j] == 0) {
					butacasContiguas++;
				} else {
					butacasContiguas = 0;
				}
				if (butacasContiguas == cantidadDePersonas) {
					System.out.println("Hay butacas contiguas para " + cantidadDePersonas + " personas");
					return true;
				}
			}
		}
		System.out.println("No hay butacas contiguas para " + cantidadDePersonas + " personas");
		return false;
	}

}
