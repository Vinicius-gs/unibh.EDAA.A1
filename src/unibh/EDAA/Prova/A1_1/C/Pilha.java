package unibh.EDAA.Prova.A1_1.C;

public class Pilha {

 	public String[] produtos;
    private double valor;
    private int qtd;
    private int topo;
    private int base;
    private int tam_max;
    
    // Construtor
    public Pilha(int quantidade) {
    	produtos = new String[quantidade];
//    	String agendas []; 
    	tam_max = quantidade;
    	topo = 0;
    	base = 0;
    }
    
    public void push() {

		produtos[topo] = valor + "" + qtd;
    	topo++;
    	if (vazio() == true) {
    		base = topo;
    	}
    }
    
    public void pop() {
    	topo--;
    }
    
    public String top() {
    	return produtos[topo -1];
    }
    public String base() {
    	return produtos[base];
    }
    
    public boolean vazio() {
        return (topo == 0);
    }
    
    public String exibeUltimoValor() {
    	return produtos[topo - 1];
    }

    public boolean cheio() {
        return (topo == tam_max);
    }

    public int tamanho() {
        return topo;
    }
    

}
