package encapsulamento.questao2;

public class Carro {
	private String marca;
	private String cor; 
	private int ano; 
	
	public Carro(String marca, String cor, int ano) {
		setMarca(marca);
		setAno(ano);
		setCor(cor);
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getMarca() {
		return marca;
	}
}
