package polimorfismo.questao4;

public class Macaco extends Mamifero{
	
	private String tipo; 
	
	@Override
	public void locomover() {
		System.out.println("O " + getNome() + " mudou de galho!");
	}
	
	@Override
	public void alimentar() {
		System.out.println("O " + getNome() + " comeu uma banana");
		
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
