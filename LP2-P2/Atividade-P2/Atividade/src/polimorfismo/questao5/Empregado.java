package polimorfismo.questao5;

public abstract class Empregado {
	private String nome;
	private String cpf;
	private String rg;
	
	public abstract double calcularGanho();

	@Override
	public String toString() {
		return "R$" + calcularGanho();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
}