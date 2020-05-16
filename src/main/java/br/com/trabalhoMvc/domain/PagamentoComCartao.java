package br.com.trabalhoMvc.domain;

import java.io.Serializable;

import javax.persistence.*;

import br.com.trbalhoMvc.enumerador.EstadoPagamento;


public class PagamentoComCartao extends Pagamento{
	
	private static final long serialversionUID = 1L;
	

	private Integer numeroDeParcelas;
	
		public PagamentoComCartao() {
			// TODO Auto-generated constructor stub
		}
	
	


	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
			super(id, estado, pedido);
			this.numeroDeParcelas = numeroDeParcelas;
			
		}




	public int getNumeroDeParcelas() {
		return numeroDeParcelas;
	}
	public void setNumeroDeParcelas(int numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}

	
	
}	
