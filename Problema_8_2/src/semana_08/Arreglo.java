package semana_08;

public class Arreglo {
	
	//  Atributos privados
	private int[] n;
	private int indice;
	//  Constructor
	public Arreglo() {
		n = new int[10];
		indice = 0;
	}
	//  Operaciones públicas básicas
	public int tamanio() {
		return indice;
	}
	public int obtener(int i) {
		return n[i];
	}
	public void adicionarDistintoYordenar(int numero) {
			if (!contieneNumero(numero)) {
	        adicionar(numero);
	        ordenarArreglo();
	    }
	}

	private boolean contieneNumero(int numero) {
	    for (int i = 0; i < indice; i++) {
	        if (n[i] == numero) {
	            return true;
	        }
	    }
	    return false;
	}

	private void ordenarArreglo() {
	    for (int i = 0; i < indice - 1; i++) {
	        for (int j = 0; j < indice - i - 1; j++) {
	            if (n[j] > n[j + 1]) {
	                int temp = n[j];
	                n[j] = n[j + 1];
	                n[j + 1] = temp;
	            }
	        }
	    }
	}
	
	//  Operaciones privadas
	private void ampliarArreglo() {
		int[] aux = n;
		n = new int[indice + 10];
		for (int i=0; i<indice; i++)
			n[i] = aux[i];
	}
	public void adicionar(int numero) {
		if (indice == n.length)
			ampliarArreglo();
		n[indice] = numero;
		indice ++;
	}
	
}
