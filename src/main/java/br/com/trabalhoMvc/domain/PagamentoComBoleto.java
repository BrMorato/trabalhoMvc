package br.com.trabalhoMvc.domain;

import java.sql.Date;

import java.io.Serializable;

import javax.persistence.*;

import br.com.trbalhoMvc.enumerador.EstadoPagamento;


public class PagamentoComBoleto extends Pagamento{
	private static final long serialversionUID = 1L;

	
	private Date dataVencimento;
	private Date dataPagamento;
	



	public PagamentoComBoleto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		
		
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}




	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
}	
