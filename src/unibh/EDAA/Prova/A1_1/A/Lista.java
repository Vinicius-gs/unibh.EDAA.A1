package unibh.EDAA.Prova.A1_1.A;

public class Lista {

    private String[] Produto;
    private double valor;
    private int quantidade;
    //private Produto produto;
    
    private int topo;
    private int tam_max;
    
    // Construtor
    public Lista(int quantidade) {
    	Produto = new String[quantidade];
    	tam_max = quantidade;
    	topo = 0;
    }
    
    public void adicionar(double valor, int quantidade) {
    	Produto[topo] = valor + ""+ quantidade;
    	topo++;
    }
    
    public void remover() {
    	topo--;
    }
    
    public String top() {
    	return Produto[topo -1];
    }
    
    public boolean vazio() {
        return (topo == 0);
    }

    public boolean cheio() {
        return (topo == tam_max);
    }

    public int tamanho() {
        return topo;
    }


}
