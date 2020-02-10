import java.util.Scanner;

public class HelloHord {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		System.out.println("Informe seu nome");
		String nome = ler.next();
		
		System.out.println("Hello, " + nome + "!");

	}

}
