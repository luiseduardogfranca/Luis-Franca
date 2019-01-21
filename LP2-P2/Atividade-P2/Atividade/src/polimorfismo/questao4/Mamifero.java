package polimorfismo.questao4;

public abstract class Mamifero extends Animal{
	public abstract void locomover();
	public abstract void alimentar(); 
	
	@Override
	public String getDescricao() {
		return getNome() + " é um mamífero";
	}
}
