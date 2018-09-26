package entities;

public class ProdutoFile {

	private String nome;
	private Double valor;
	private Integer qty;
		
	public ProdutoFile(String nome, Double valor, Integer qty) {
		this.nome = nome;
		this.valor = valor;
		this.qty = qty;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	
}
