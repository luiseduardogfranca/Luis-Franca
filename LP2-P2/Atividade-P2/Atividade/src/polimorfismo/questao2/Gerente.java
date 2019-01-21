package polimorfismo.questao2;

public class Gerente extends Funcionario{

	@Override
	public String toString() {
		return getNome() + " é gerente";
	}
}
