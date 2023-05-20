package prjIdade;
import java.util.Scanner;
public class Idade {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in); 
		int anoa, anon, idade, resp;
		do {
			System.out.println("Digite sua data de nascimento:");
			anon = in.nextInt();
			System.out.println("Digite o ano atual:");
			anoa = in.nextInt();
			idade = anoa-anon;
			if (idade<18) {
				System.out.println("Você tem "+idade+" anos e é menor de idade");
			}	else {
				System.out.println("Você tem "+idade+" anos e é maior de idade");
			}
			System.out.println("Deseja continuar a execução? (1-para SIM ou 2-para NÃO)");
			resp = in.nextInt();
		}while (resp == 1);
			
	}
}


