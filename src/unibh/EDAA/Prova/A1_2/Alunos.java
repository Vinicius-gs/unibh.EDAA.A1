package unibh.EDAA.Prova.A1_2;

import java.util.Scanner;

public class Alunos {
		
	private String[] sala;
    private String nome;
    private int matricula;
    private String curso;
    private int base;
   
    private int topo;
    private int tam_max;
    
    
    private int cont;
    
    // Construtor
    public Alunos(int quantidade) {
    	sala = new String[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    	base = 0;
    }
    
    // B) Crie um método para inserção de um novo aluno na última posição da estrutura
    // F)Crie um método para inserção de um novo aluno na última posição da estrutura
    public void adicionar(String nome, int matricula, String curso) {
    	sala[topo] = nome + matricula + curso;
    	System.out.println(sala[topo]);
    	topo++;
    	if (vazio() == true) {
    		base = topo;
    	}
    }
    
    public void pop() {
    	topo--;
    }
    
    public String top() {
    	return sala[topo -1];
    }
    
    public boolean vazio() {
        return (topo == 0);
    }
    
    public String exibeUltimoValor() {
    	return sala[topo - 1];
    }

    public void qtd_element_vazio() {
    	while (!(topo == tam_max)) {
    		cont++;
    		tam_max--;
    	}
    	System.out.println(cont);
    }
    
    public boolean cheio() {
        return (topo == tam_max);
    }

    public int tamanho() {
        return topo;
    }
        
    public void  novoTamanho() {

    	String sala2[] = new String[sala.length + 5];
    	for (int i = 0; i < sala.length; i++) {
    		sala2[i] = sala[i];
		}
    	sala = sala2;
    }
    
    public void  addPrimeiro(String nome, int matricula, String curso) {
    	String sala3[] = new String[sala.length + 1];
    	for (int i = 0; i < sala.length; i++) {
    		if(i ==0) {
    			sala3[i] = sala[topo] = nome + matricula + curso;;
    		}else {
    			sala3[i] = sala[i];
    		}	
		}
    	sala = sala3;
    }
}
