
public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public void receberAumento(float aum) {
	 this.salario += aum;
	 System.out.println("O salario de " + getNome() + " teve aumento de " + aum );
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
