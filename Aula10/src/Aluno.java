
public class Aluno  extends Pessoa{
	private int matr;
	private String curso;
	
	//Método
	public void cancelarMatr() {
		System.out.println("Matícula será cancelada.");
	}

	//Métodos Especiais

	
	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
}
