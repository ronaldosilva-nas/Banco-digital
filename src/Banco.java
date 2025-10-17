
public class Banco {

	public static void main(String[] args) {
		
		ContaPoupanca poupanca = new ContaPoupanca("CONTA POUPANÇA", 1111, 2222);
		
		System.out.println();
		
		System.out.println("Olá " + poupanca.getNome() + ", sua agência é " + poupanca.getAgencia() + ", e o número da sua conta é " + poupanca.getNumeroConta());
		
		poupanca.consultarSaldo();
		
		poupanca.depositar(500.0);
		
		poupanca.consultarSaldo();
		
		poupanca.sacar(350.0);
		
		poupanca.consultarSaldo();
		
		ContaCorrente corrente = new ContaCorrente("CONTA CORRENTE", 5555, 9999);
		
		System.out.println();
		
		System.out.println("Olá " + corrente.getNome() + ", sua agência é " + corrente.getAgencia() + ", e o número da sua conta é " + corrente.getNumeroConta());
		
		corrente.consultarSaldo();
		
		corrente.depositar(150.0);
		
		corrente.consultarSaldo();
		
		corrente.sacar(70.0);
		
		corrente.consultarSaldo();
		
	}

}
