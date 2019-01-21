package encapsulamento.questao1;

public class Pessoa {
	
	public Pessoa(String nome, String sobrenome, String cpf, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
		setIdade(idade);
	}
	
	private String nome; 
	private String cpf; 
	private int idade; 
	private String sobrenome; 
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getNomeCompleto() {
		return nome + " " + sobrenome; 
	}
	
	public int getIdade() {
		return idade;
	}
	
}
