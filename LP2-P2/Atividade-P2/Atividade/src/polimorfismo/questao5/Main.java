package polimorfismo.questao5;

public class Main {
	public static void main(String[] args) {
		Chefe chefe = new Chefe("Zé", "0000000000", "98918291", 2300);
		TrabalhadorPecaProduzida trabalhadorPecaProduzida = new TrabalhadorPecaProduzida("Zé", "0000000000", "98918291", 20, 100);
		TrabalhadorComissionado comissionado = new TrabalhadorComissionado("Zé", "0000000000", "98918291", 1500, 10, 20);
		TrabalhadorHora trabalhadorHora = new TrabalhadorHora("Zé", "0000000000", "98918291", 120, 100);
		
		System.out.println("Chefe ganha: " + chefe);
		System.out.println("Trabalhador por peça produzida ganha: " + trabalhadorPecaProduzida);
		System.out.println("Comissionado ganha: " + comissionado);
		System.out.println("Trabalhador por hora ganha: " + trabalhadorHora);
	}
}
