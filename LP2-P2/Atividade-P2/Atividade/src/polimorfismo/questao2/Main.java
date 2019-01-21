package polimorfismo.questao2;

public class Main {
	public static void main(String[] args) {
		Funcionario obj; 
		
		String funcao = "Gerente"; 
		String nome = "Eduardo";
		
		if(funcao.equals("Gerente")){
			obj = new Gerente();
			obj.setNome(nome);
		}else {
			obj = new Atendente();
			obj.setNome(nome);
		}
		
		System.out.println(obj);
	}
}
