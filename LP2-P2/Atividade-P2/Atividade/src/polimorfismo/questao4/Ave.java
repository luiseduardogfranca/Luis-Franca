package polimorfismo.questao4;

public abstract class Ave extends Animal{
	public abstract void locomover();
	public abstract void alimentar(); 
	
	@Override
	public String getDescricao() {
		return getNome() + " é uma ave";
	}
}
