package br.com.trbalhoMvc.enumerador;

public enum EstadoPagamento {
	PENDENTE (1,"Pendente"),
	PAGO (2, "Pago"),
	CANCELADO(3, "Cancelado");
	
	private int codigo;
	private String descricao;
	
private EstadoPagamento(int codigo, String descricao) {

	this.codigo = codigo;
	this.descricao = descricao;
 }

public int getCodigo() {
	return codigo;
}


public String getDescricao() {
	return descricao;
}

public static EstadoPagamento toEnum(Integer codigo) {
	if (codigo == null) {
	return null;
	}
	for (EstadoPagamento estadoPag : EstadoPagamento.values()) {
		if(codigo.equals(estadoPag.getCodigo())) {
			return estadoPag;
		}
		
	}
	throw new IllegalArgumentException("Codigo inválido para o enum Tipo Pagamento"+ codigo);
}
   
}
