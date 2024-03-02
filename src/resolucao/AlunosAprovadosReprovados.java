package resolucao;

import java.util.Scanner;

public class AlunosAprovadosReprovados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de Alunos na Turma: ");
		int numeroAlunos = sc.nextInt();
		
		int numeroAlunosAprovados = 0, numeroAlunosReprovados = 0;
		double nota_1, nota_2;
		double media = 0;
		double mediaTurma = 0;
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Digite a Primeira Nota do Aluno:" + (i+1));
			nota_1 = sc.nextDouble();
			
			System.out.println("Digite a Seguanda Nota do Aluno:" + (i+1));
			nota_2 = sc.nextDouble();
			
			media = (nota_1 + nota_2) / 2;
			
			if(media >= 6)
				numeroAlunosAprovados ++;
			else
				numeroAlunosReprovados ++;
			
			mediaTurma = mediaTurma + media; 
			
		}
		mediaTurma = mediaTurma / numeroAlunos;
		
		System.out.println("O Número de Alunos Aprovados " + numeroAlunosAprovados);
		System.out.println("O Número de Alunos Reprovados " + numeroAlunosReprovados);
		System.out.printf("A Média Aritimética da Turma %.2f ",mediaTurma );
		sc.close();
	}

}
