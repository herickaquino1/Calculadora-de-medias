package estudos.dio;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor digite o nome do Aluno: ");
		String nomeAluno = sc.nextLine();
		
		System.out.println("Por favor digite o curso:  ");
		String cursoAluno = sc.nextLine();
		
		Aluno al = new Aluno(nomeAluno, cursoAluno);
		System.out.println("Agora, digite o numero de notas que ser�o calculadas:  ");
		int numNotas = sc.nextInt();
		
		for(int n = 1; n <= numNotas; n++) {
			System.out.println("digite a nota de numero " + n);
			al.setNota(sc.nextInt());
		}

		System.out.println(al.getNome() + " sua media �: " + al.media());
		
		if(al.media() >= 6) {
			System.out.println(al.getNome() + " voc� est� aprovado");
		}else if(al.media()<= 6){
			System.out.println(al.getNome() + " voc� est� reprovado");
		}
	}

}
