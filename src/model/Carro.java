package model;

public abstract class Carro implements Veiculo {

	public String acelerar() {
		return "Acelerando o carro";
	}
	
	public abstract String frear();
}
