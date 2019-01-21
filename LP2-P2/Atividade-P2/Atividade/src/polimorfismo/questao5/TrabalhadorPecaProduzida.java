package polimorfismo.questao5;

public class TrabalhadorPecaProduzida extends Empregado{
	
	private double remuneracao;
	private int qtdProduzida;
	
	public TrabalhadorPecaProduzida(String nome, String cpf, String rg, double remuneracao, int qtd) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setRemuneracao(remuneracao);
		setQtdProduzida(qtd);
	}
	
	@Override
	public double calcularGanho() {
		return remuneracao * qtdProduzida;
	}

	public double getRemuneracao() {
		return remuneracao;
	}
	
	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
	
	public int getQtdProduzida() {
		return qtdProduzida;
	}
	
	public void setQtdProduzida(int qtdProduzida) {
		this.qtdProduzida = qtdProduzida;
	}
}
