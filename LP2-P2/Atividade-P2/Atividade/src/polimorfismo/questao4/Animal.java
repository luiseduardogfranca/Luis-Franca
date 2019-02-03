package polimorfismo.questao4;

public abstract class Animal {
	private String descricao; 
	private String nome; 
	
	public abstract void locomover();
	public abstract void alimentar(); 
	
	public String getDescricao() {
		return  getNome() + " é um animal";
	}
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}