package entities;

public class Conta {

	private int numeroConta;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular) {
		this.numeroConta = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, double depositoInicial) {
		this.numeroConta = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumber() {
		return numeroConta;
	}
	
	public void deposito(double montante) {
		saldo += montante;
	}
	
	public void saque(double montante) {
		saldo -= montante + 5.0;

	}
	
	public String toString(){
		return "Conta: "
				+numeroConta
				+ ", Titular: "
				+ titular
				+ ", saldo: $"
				+ String.format("%.2f",saldo);
	}
	
}
