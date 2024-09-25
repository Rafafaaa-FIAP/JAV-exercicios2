package br.com.fiap.presenca;

public class Professor extends Pessoa {
	
	private String inscricao;
	private String disciplina;
	
	
	
	public String getInscricao() {
		return inscricao;
	}
	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	public Professor() {

	}
	
	public Professor(String nome, int idade, String sexo, String inscricao, String disciplina) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.inscricao = inscricao;
		this.disciplina = disciplina;
	}
	
	
	
	public void cadastrar() {
		System.out.println("Professor " + this.getNome() + " de idade " + this.getIdade() + " de sexo " + this.getSexo() + " com inscrição " + this.inscricao + " da disciplina " + this.disciplina + " foi cadastrado com sucesso!");
	}
	
	public void registrarPresenca() {
		System.out.println("Presença do professor registrada com sucesso!");
	}
}
