package br.com.trabalhoMvc.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Telefone implements Serializable{
	
	private static final long serialversionUID = 1L;
	@Id
	//@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	
	@ManyToOne
	private Cliente clienteTelefone;

	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Telefone(int id, int numero) {
		super();
		this.id = id;
		this.numero = numero;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

		
	
}
