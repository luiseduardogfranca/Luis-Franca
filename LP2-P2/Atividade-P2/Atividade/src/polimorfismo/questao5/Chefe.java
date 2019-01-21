package polimorfismo.questao5;

public class Chefe extends Empregado{
	private double salarioMensal; 
	
	public Chefe(String nome, String cpf, String rg, double salario) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setSalarioMensal(salario);
	}
	
	@Override
	public double calcularGanho() {
		
		return getSalarioMensal();
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
}
