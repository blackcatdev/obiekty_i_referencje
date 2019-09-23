package pl.blackcat.kursjava.obiekty_i_referencje;

public class OutOfMemory {

	public static void StackOverflow(){
		StackOverflow();
	}
	public static void OutOfMemory() {
		int[][] tablica = new int[250000][250000];

	}

	public static void main(String[] args) {
		//StackOverflow();
		//OutOfMemory();

	}
}
