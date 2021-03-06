package br.com.trabalhoMvc.domain;

import br.com.trabalhoMvc.domain.Categoria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Produto  implements Serializable{
	
	private static final long serialversionUID = 1L;
	@Id
	//@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private String nome;
	private Double preco;
	
  
	private ArrayList<ItemPedido> pedidos = new ArrayList<ItemPedido>();
	
	public ArrayList<ItemPedido> getprodutoItem() {
		return pedidos;
	}



	public void setProdutoItem(ArrayList<ItemPedido> produtoItem) {
		this.pedidos = produtoItem;
	}



	
	@OneToMany(mappedBy = "produtos")	
	private List<Categoria> categorias = new ArrayList<Categoria>();
	
	
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Produto(int id, String nome, Double preco, ArrayList<ItemPedido> produtoItem) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.pedidos = produtoItem;
	
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}



	public List<Categoria> getCategorias() {
		return categorias;
	}



	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

	
}
