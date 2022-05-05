package ex36;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private double quantidade;
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

	public void getNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(double quantidade) {
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
	
	Produto(int id, String nome, double preco, double quantidade, Categoria categoria ){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.categoria = categoria;
	}
	public String exibirNomePreco() {
		return ("Nome:" + this.getNome() + "Preco:"+ this.getPreco());
	}
	public String exibirNomeQuantidade() {
		return ("Nome:"+ this.getNome() + "Quantidade:" + this.getQuantidade());
	}
}
