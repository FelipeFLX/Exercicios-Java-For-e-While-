package prjContador;
public class Contador {
	public static void main (String[] args) {
		int i=2;
		System.out.println("Abaixo todos os números pares de 0 a 500:\n");
		do {
			i=+i;
			System.out.println(+i);
			i=i+2;
		}while (i<=500);
	}

}
