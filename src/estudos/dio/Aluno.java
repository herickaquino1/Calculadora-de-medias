package estudos.dio;

import java.util.ArrayList;

public class Aluno {
	private String nome;
	private String curso;
	private ArrayList<Integer> nota;
	
	Aluno(String nome, String curso){
		this.nome = nome;
		this.curso = curso;
		this.nota = new ArrayList<>();
	}
	
	public int media() {
		int valores = 0;
		int indices =  0;
		for(int nota:nota) {
			valores += nota;
			indices++;
		}
		int resultado = valores/indices;
		return resultado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public ArrayList<Integer> getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota.add(nota);
	}
	
	
	
	
}
