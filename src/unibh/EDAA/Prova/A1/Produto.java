package unibh.EDAA.Prova.A1;

public class Produto {
	
	public String Nome;
	public String Marca;
	public Produto(String nome, String marca) {
		super();
		Nome = nome;
		Marca = marca;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}

}
