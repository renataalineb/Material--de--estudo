package Aula4;

public class Caneta {
	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	public Caneta(String m, float p, String c) {
		this.modelo = m;
		this.ponta = p;
		this.cor = c;
		this.tampar();
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String m) {
		this.modelo = m;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float p) {
		this.ponta = p;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public boolean getTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada = false;
	}
	
	
	
	public void status() {
		System.out.println("SOBRE A CANETA");
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tampada " + this.tampada);
	}
}
	