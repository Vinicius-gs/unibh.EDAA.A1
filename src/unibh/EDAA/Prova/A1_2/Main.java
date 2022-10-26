package unibh.EDAA.Prova.A1_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A) Utilize uma estrutura de alocação estática (vetor) para a tarefa
		Alunos a = new Alunos(5);
		
	    // B) Crie um método para inserção de um novo aluno na última posição da estrutura
	    // F)Crie um método para inserção de um novo aluno na última posição da estrutura
		a.adicionar("Vinicius ", 1010, " CC");
		a.adicionar("Mateus ", 1010, " CC");
		a.adicionar("Henrique ", 1010, " CC");
		
		
		//C) Crie um método para realizar a remoção de um aluno com base em um número de matricula informado
		a.pop();
		
		// D) Crie um método para informar a quantidade de posições vazias (sem alunos) na estrutura
		a.qtd_element_vazio();
		
		//E)Implemente a função de inserção que aumente  de tamanho para caber mais posições. Toda vez que a estrutura estiver cheia ela deve aumentar em 5 posições.
		//a.novoTamanho();
		
		a.addPrimeiro("Vinicius ", 1010, " TI");
		
	}

}
