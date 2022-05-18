package cursojava.executavel;

import cursojava.classes.Aluno;

public class Progama {

	public static void main(String[] args) {

		/*
		 * Instanciação de objetos, com referencia as variaveis aluno1, aluno2 e aluno3
		 */

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		 /* A seguir uma variavel com referencia ao objeto aluno, sendo instanciado (criação) de um objeto new Aluno, porem com parametros iniciados*/
		Aluno aluno4 = new Aluno("Matheus", 23, "111.222.333-44", 202212008, 80.0, 80.0, 80.0, 80.0);

		/* SETTERS */
		/* Fiz mesmo só para testar, sei que conseguiria reduzir BASTANTE esse código. */
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
		
		/*Aluno 4 não foi setado pois foi instanciado um objeto com referencia a variavel aluno4 com os parametros inicializados*/

		/* Saída de dados ALUNO 1, ALUNO 2 e ALUNO 3. (BÔNUS: TESTE DE SAÍDA COM ALUNO 4 COM TODOS OS PARAMETROS INICIADOS) */

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
		
		System.out.println("------------------------------------------------");
		
		System.out.println("DADOS ALUNO 4");
		System.out.println("Nome = " + aluno4.getNome());
		System.out.println("Idade = " + aluno4.getIdade());
		System.out.println("CPF = " + aluno4.getCpf());
		System.out.println("Matrícula = " + aluno4.getMatricula());
		System.out.println("Média das notas = " + aluno4.getMediaNota());
		System.out.println("Resultado final = " + aluno4.getAlunoAprovado());
	}
}
