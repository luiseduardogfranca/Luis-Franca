package polimorfismo.questao4;

public class Cachorro extends Mamifero{
	private String tipo; 
	
	@Override
	public void locomover() {
		System.out.println("O " + getNome() + " andou!");
	}
	
	@Override
	public void alimentar() {
		System.out.println("O " + getNome() + " comeu a ração toda!");
		
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
