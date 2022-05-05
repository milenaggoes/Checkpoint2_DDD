package ex38;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	private Categoria categoria;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	Produto() {
	}
	
	Produto(int id, String nome, double preco, int quantidade, Categoria categoria ){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	public String exibirNomePreco() {
		return ("Nome:" + this.getNome() + "Preco:"+ this.getPreco());
	}
	public String exibirCategoria() {
		return ("ID: "+ this.getCategoria().getId() + "\nNOME: " + this.getCategoria().getNome());
	}
}
