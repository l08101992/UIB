
public class UIBMain {

	public static void main(String[] args) {
		
		Cliente clientel = new Cliente();
		clientel.nome = "Endrigo";
		clientel.cpf = "123.123.123-58";
		
		
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.donoDaonta = clientel;
		clientel.conta = conta;
		
		
		
		
		
		System.out.println(clientel.nome + "tem" + clientel.conta.saldo);
		System.out.println(conta.donoDaonta.nome + "tem" + conta.saldo);
	}

}
