package pila;

public class Pila {

	private Nodo cima;
	private int tam;

	// Size
	public int size() {
		return tam;
	}

	// es nulo
	public boolean isEmpty() {
		return cima == null;
	}

	public void push(Integer info) {
		Nodo nuevo = new Nodo(info);
		if (!isEmpty()) {
			nuevo.setSig(cima);
		}
		cima = nuevo;
		tam++;
	}

	public Integer pop() {
		if (!isEmpty()) {
			Nodo borrar = cima; // creo ese nodo para almacenar lo que voy a borrar
			cima = cima.getSig();
			borrar.setSig(null);
			tam--;
			return borrar.getInfo();
		}
		return null;
	}

	public Integer peak() {
		if (!isEmpty()) {
			return cima.getInfo();
		}
		return null;
	}

	public void print() {
		System.out.println("La Pila contiene: ");
		if (!isEmpty()) {
			Nodo aux = cima;
			System.out.println("Cima");
			while (aux != null) {
				System.out.println("|" + aux.getInfo() + "|");
				aux = aux.getSig();
			}
		}
	}

}
