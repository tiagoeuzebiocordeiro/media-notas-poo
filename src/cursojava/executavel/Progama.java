package cursojava.executavel;

import cursojava.classes.Aluno;

public class Progama {

	public static void main(String[] args) {

		
		/* Instanciação de objetos, com referencia as variaveis aluno1, aluno2 e aluno3 */
		 
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();

		/* SETTERS */
		aluno1.setNome("João");
		aluno2.setNome("Pedro");
		aluno3.setNome("Marcos");

		aluno1.setIdade(18);
		aluno2.setIdade(20);
		aluno3.setIdade(19);

		aluno1.setCpf("559.559.059-00");
		aluno2.setCpf("999.888.777-11");
		aluno3.setCpf("888.621.123-77");

		aluno1.setMatricula(202212005);
		aluno2.setMatricula(202212006);
		aluno3.setMatricula(202212007);

		aluno1.setNota1(50.0);
		aluno1.setNota2(50.0);
		aluno1.setNota3(50.0);
		aluno1.setNota4(50.0);

		aluno2.setNota1(70.0);
		aluno2.setNota2(70.0);
		aluno2.setNota3(70.0);
		aluno2.setNota4(70.0);

		aluno3.setNota1(40.0);
		aluno3.setNota2(40.0);
		aluno3.setNota3(40.0);
		aluno3.setNota4(40.0);

		/* Saída de dados ALUNO 1, ALUNO 2 e ALUNO 3 */

		System.out.println("DADOS ALUNO 1");
		System.out.println("Nome = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade());
		System.out.println("CPF = " + aluno1.getCpf());
		System.out.println("Matrícula = " + aluno1.getMatricula());
		System.out.println("Média das notas = " + aluno1.getMediaNota());
		System.out.println("Resultado final = " + aluno1.getAlunoAprovado());

		System.out.println("------------------------------------------------");

		System.out.println("DADOS ALUNO 2");
		System.out.println("Nome = " + aluno2.getNome());
		System.out.println("Idade = " + aluno2.getIdade());
		System.out.println("CPF = " + aluno2.getCpf());
		System.out.println("Matrícula = " + aluno2.getMatricula());
		System.out.println("Média das notas = " + aluno2.getMediaNota());
		System.out.println("Resultado final = " + aluno2.getAlunoAprovado());

		System.out.println("------------------------------------------------");

		System.out.println("DADOS ALUNO 3");
		System.out.println("Nome = " + aluno3.getNome());
		System.out.println("Idade = " + aluno3.getIdade());
		System.out.println("CPF = " + aluno3.getCpf());
		System.out.println("Matrícula = " + aluno3.getMatricula());
		System.out.println("Média das notas = " + aluno3.getMediaNota());
		System.out.println("Resultado final = " + aluno3.getAlunoAprovado());
		System.out.println();
	}
}
