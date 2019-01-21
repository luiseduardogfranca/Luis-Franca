package heranca.questao3;

public class Recursivo implements Fatorial{
	@Override
	public int calcular(int valor) {
		if (valor == 1) {
			return valor;
			
		}else {
			return valor * calcular(valor - 1); 
		}
	}
}
