package polimorfismo.questao2;

public class Atendente extends Funcionario{
	
	@Override
	public String toString() {
		return getNome() + " é atendente";
	}
}
