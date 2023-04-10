package saladecine;

public class TestSalaDecine {

	public static void main(String[] args) {
		SalaDeCine sala1 = new SalaDeCine(3,3);

			sala1.inicializarMatriz();
			
			sala1.mostrarButacas();
			System.out.println("\n");
			sala1.ocuparButacaEspecifica(2, 0);
			sala1.ocuparButacaEspecifica(2, 1);
			sala1.ocuparButacaEspecifica(2, 2);
			System.out.println("\n");
			sala1.mostrarButacas();
			System.out.println("\n");
			sala1.ocuparButacaEspecifica(0, 0);
			sala1.ocuparButacaEspecifica(0, 1);
			sala1.ocuparButacaEspecifica(1, 2);
			System.out.println("\n");
			sala1.mostrarButacas();
			System.out.println("\n");
			sala1.hayEspacioPara(3);
			System.out.println("\n");
			sala1.consultarCantidadButacasOcupadas();
			System.out.println("\n");
			sala1.verificarSalaVacia();
			
			
	}

}
