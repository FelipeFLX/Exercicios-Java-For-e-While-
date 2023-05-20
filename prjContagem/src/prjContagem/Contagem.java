package prjContagem;
public class Contagem {
	public static void main (String[] args) {
		int i;
		System.out.println("Abaixo a contagem dos números de 1 a 100:\n");
		for (i=1;i<=100;i++) {
			if (i==10 ||i==20 ||i==30 ||i==40 ||i==50 ||i==60 ||i==70 ||i==80 ||i==90 ||i==100) {
				System.out.println(+i+" Este número é multiplo de 10");
			}	else {
				System.out.println(+i);
			}
		}
	}

}
