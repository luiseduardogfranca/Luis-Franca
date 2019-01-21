package polimorfismo.questao4;

public class Main {
	public static void main(String[] args) {
		Macaco macaco = new Macaco();
		Aguia aguia = new Aguia(); 
		Cachorro cachorro = new Cachorro();
		
		macaco.setNome("Jofrey");
		aguia.setNome("Fast");
		cachorro.setNome("Bob");
		
		System.out.println(macaco.getDescricao());
		System.out.println(aguia.getDescricao());
		System.out.println(cachorro.getDescricao());
		
		macaco.alimentar();
		macaco.locomover();
		
		aguia.alimentar();
		aguia.locomover();
		
		cachorro.alimentar();
		cachorro.locomover();

	}
}
