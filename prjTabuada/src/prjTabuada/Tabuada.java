package prjTabuada;
public class Tabuada {
	public static void main (String[] args) {
		int n, t, i;
		for (n=1;n<=10;n++) {
			for (i=1;i<=10;i++) {
				t=n*i;
				System.out.println(n+" x "+i+" = "+t);
			}
			System.out.println("\n");
		}
		
	}

}
