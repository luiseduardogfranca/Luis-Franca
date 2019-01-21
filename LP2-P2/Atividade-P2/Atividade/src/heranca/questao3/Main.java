package heranca.questao3;

public class Main {

	public static void main(String[] args) {

		NaoRecursivo obj1 = new NaoRecursivo();
		System.out.println("Sem recursão: " + obj1.calcular(5));
		
		Recursivo obj2 = new Recursivo();
		System.out.println("Com recursão: " + obj2.calcular(5));
	}

}
