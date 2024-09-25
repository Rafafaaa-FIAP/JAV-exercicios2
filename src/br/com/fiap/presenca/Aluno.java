package br.com.fiap.presenca;

public class Aluno extends Pessoa {
	
	private String rm;
	private String curso;
	
	
	
	public String getRm() {
		return rm;
	}
	public void setRm(String rm) {
		this.rm = rm;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	public Aluno() {

	}
	
	public Aluno(String nome, int idade, String sexo, String rm, String curso) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.rm = rm;
		this.curso = curso;
	}
	
	
	
	public void cadastrar() {
		System.out.println("Aluno " + this.getNome() + " de idade " + this.getIdade() + " de sexo " + this.getSexo() + " com rm " + this.rm + " do curso " + this.curso + " foi cadastrado com sucesso!");
	}
	
	public void registrarPresenca() {
		System.out.println("Presença do aluno registrada com sucesso!");
	}
}
