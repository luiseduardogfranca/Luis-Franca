package polimorfismo.questao1;

public class Main {
	public static void main(String[] args) {
		Funcionario obj = new Funcionario();
		
		obj.realizarLogin(0, "ola");
		obj.realizarLogin("eduardo@gmail.com", "ola");

	}
}
