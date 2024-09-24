package br.com.fiap.presenca;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		
		
		System.out.print("Digite o nome do professor: ");
		String nome = scanner.next();
		
		System.out.print("Digite a idade do professor: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite o sexo do professor: ");
		String sexo = scanner.next();
		
		System.out.print("Digite a inscrição do professor: ");
		String inscricao = scanner.next();
		
		System.out.print("Digite a disciplina do professor: ");
		String disciplina = scanner.next();
		
		Professor professor = new Professor(nome, idade, sexo, inscricao, disciplina);
		professor.cadastrar();
		professor.registrarPresenca();
		
		
		
		System.out.print("Digite o nome do aluno: ");
		nome = scanner.next();
		
		System.out.print("Digite a idade do aluno: ");
		idade = scanner.nextInt();
		
		System.out.print("Digite o sexo do aluno: ");
		sexo = scanner.next();
		
		System.out.print("Digite o RM do aluno: ");
		String rm = scanner.next();
		
		System.out.print("Digite o curso do aluno: ");
		String curso = scanner.next();
		
		Aluno aluno = new Aluno(nome, idade, sexo, rm, curso);
		aluno.cadastrar();
		aluno.registrarPresenca();
		
		
		
		scanner.close();

	}

	
	
}
