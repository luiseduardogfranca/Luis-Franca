package polimorfismo.questao5;

public class TrabalhadorHora extends Empregado {
	
	private double salarioHora; 
	private int qtdHoras;
	
	public TrabalhadorHora(String nome, String cpf, String rg, double salario, int horas) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setSalarioHora(salario);
		setQtdHoras(horas);
	}
	
	@Override
	public double calcularGanho() {
		return salarioHora * qtdHoras;
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	public int getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	} 
	
	

}
