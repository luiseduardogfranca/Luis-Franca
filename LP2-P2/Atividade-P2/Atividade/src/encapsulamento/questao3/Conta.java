package encapsulamento.questao3;

public class Conta {
	private int numeroConta; 
	private float saldo; 
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void deposito(int numero, float valor) {
		if(validarConta(numero) && validarSaque(valor)) {
			this.saldo += valor;	
		}
	}
	
	public void saque(int numero, float valor) {
		if(validarConta(numero) && !validarSaque(valor)) {
			this.saldo -= valor;	
		}
	}
	
	private boolean validarSaque(float valor) {
		return valor >= this.saldo;
	}
	
	private boolean validarConta(int numero) {
		return this.numeroConta == numero;
	}
}
