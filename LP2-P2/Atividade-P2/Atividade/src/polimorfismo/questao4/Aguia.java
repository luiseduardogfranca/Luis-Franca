package polimorfismo.questao4;

public class Aguia extends Ave{
	private String tipo; 
	
	@Override
	public void locomover() {
		System.out.println("O " + getNome() + " voou 100m a frente!");
	}
	
	@Override
	public void alimentar() {
		System.out.println("O " + getNome() + " comeu um roedor!");
		
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
