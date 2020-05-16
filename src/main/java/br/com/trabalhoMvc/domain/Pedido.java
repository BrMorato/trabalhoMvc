package br.com.trabalhoMvc.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Pedido implements Serializable{
	
	private static final long serialversionUID = 1L;
	
	@Id
	@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	private Date instante;
	

	private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
	
	@OneToOne
	@JoinColumn(name="pagamento")
	private Pagamento pagamento;
	
	
	@ManyToOne
	private Cliente cliente;
	
	private Endereco enderecoEntrega;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer id, Date instante, ArrayList<ItemPedido> itens, Pagamento pagamento, Cliente cliente,
			Endereco enderecoEntrega) {
		super();
		this.id = id;
		this.instante = instante;
		this.itens = itens;
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public ArrayList<ItemPedido> getProdutoItem() {
		return itens;
	}

	public void setProdutoItem(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	


	
}
