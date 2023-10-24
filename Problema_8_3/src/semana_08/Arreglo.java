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
	public void adicionarYreubicar(int numero) {
	    if (indice == n.length) {
	        ampliarArreglo();
	    }
	    n[indice] = numero;
	    indice++;
	
	    int inicio = 0;
	    int fin = indice - 1;
	    
	    while (inicio < fin) {
	        while (inicio < fin && n[inicio] % 2 == 0) {
	            inicio++;
	        }
	        while (inicio < fin && n[fin] % 2 != 0) {
	            fin--;
	        }
	        if (inicio < fin) {
	            // Intercambiar números par e impar
	            int temp = n[inicio];
	            n[inicio] = n[fin];
	            n[fin] = temp;
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
