
public class ContaCorrente implements Conta{
	private String nome;
	private int agencia;
	private int numeroConta;
	private double saldo = 0.0;
	
	public ContaCorrente(String nome, int agencia, int numeroConta) {
		this.nome = nome;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void consultarSaldo() {
		System.out.println("Saldo atual da sua conta corrente: " + saldo);
	}

	@Override
	public void depositar(double valorDepositar) {
		if (valorDepositar > 0) {
			saldo += valorDepositar;
		} else {
			System.out.println("Valor para depósito iválido");
		}
	}

	@Override
	public void sacar(double valorSacar) {
		if (valorSacar > 0 && valorSacar <= saldo) {
			saldo -= valorSacar;
		} else {
			System.out.println("Valor para saque insulficiente ou inválido");
		}
	}
	
}
