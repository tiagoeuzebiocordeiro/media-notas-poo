package cursojava.classes;

public class Aluno {

	String nome;
	int idade;
	String cpf;
	int matricula;
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	double mediaNota;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public Aluno() { /*Criação dos dados na memória*/
		
	}
	
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4.0;
	}
	
	public String getAlunoAprovado() {
		if (this.getMediaNota() >= 50) {
			if (this.getMediaNota() >= 70) {
				return "Aprovado";
			} else {
				return "Recuperação";
			}
		} else {
			return "Reprovado";
		}
	}

}