package br.com.furb;
public class Carro {

	private int qtdMotor;
	private int qtdAno;
	private int qtdKm;
	private int qtdValor;
	private int qtdCombustivel;

	/**
	 * Construtor padrão
	 */
	public Carro(){}
	
	/**
	 * Construtor com todos os atributos
	 * @param qtdMotor
	 * @param qtdAno
	 * @param qtdKm
	 * @param qtdValor
	 * @param qtdCombustivel
	 */
	public Carro(int qtdMotor, int qtdAno, int qtdKm, int qtdValor, int qtdCombustivel) {
		this.qtdMotor = qtdMotor;
		this.qtdAno = qtdAno;
		this.qtdKm = qtdKm;
		this.qtdValor = qtdValor;
		this.qtdCombustivel = qtdCombustivel;
	}

	public int getQtdMotor() {
		return qtdMotor;
	}
	
	public int getQtdCombustivel() {
		return qtdCombustivel;
	}

	public int getQtdAno() {
		return qtdAno;
	}
	
	public int getQtdKm() {
		return qtdKm;
	}
	
	public int getQtdValor() {
		return qtdValor;
	}

	public void addQtdAno() {
		this.qtdAno++;
	}
	
	public void addQtdValor() {
		this.qtdValor++;
	}
	
	public void addQtdKm() {
		this.qtdKm++;
	}
	
	public void addQtdMotor() {
		this.qtdMotor++;
	}
	
	public void addQtdCombustivel() {
		this.qtdCombustivel++;
	}
}