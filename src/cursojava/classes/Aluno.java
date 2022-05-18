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

	/* Teste - instanciando um objeto com parametros inicializados [Aluno 4] */
	public Aluno(String nomeParametro, int idadeParametro, String cpfParametro, int matriculaParametro,
			double nota1Parametro, double nota2Parametro, double nota3Parametro,
			double nota4Parametro) { /* Criação dos dados na memória */

		nome = nomeParametro;
		idade = idadeParametro;
		cpf = cpfParametro;
		matricula = matriculaParametro;
		nota1 = nota1Parametro;
		nota2 = nota2Parametro;
		nota3 = nota3Parametro;
		nota4 = nota4Parametro;

	}

	public Aluno() { /* Memória */

	}

	public double getMediaNota() { /* Cai aqui dentro para calcular a média (retorna um valor), metodo GET */
		return (nota1 + nota2 + nota3 + nota4) / 4.0;
	}

	public String getAlunoAprovado() { /* Cai aqui dentro para mostrar o resultado (retorna uma string), metodo GET */
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