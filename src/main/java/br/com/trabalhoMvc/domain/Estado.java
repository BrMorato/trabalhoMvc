package br.com.trabalhoMvc.domain;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Estado  implements Serializable {
	
	@Id
	//@Column(unique=true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private ArrayList<Cidade> cidades = new ArrayList<Cidade>();
	
	public Estado() {
		// TODO Auto-generated constructor stub
	}
	
		
	public Estado(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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

	

	public ArrayList<Cidade> getCidades() {
		return cidades;
	}


	public void setCidades(ArrayList<Cidade> cidades) {
		this.cidades = cidades;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Estado other = (Estado) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
