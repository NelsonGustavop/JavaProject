package com.YEGER.HELPS.domain.enums;

public enum PRIORIDADE {
BAIXA(0,"BAIXA"), MEDIA(1,"MEDIA"), ALTA(2,"STATUS.java");
	
	private Integer codigo;
	private String descriçao;
	
	private PRIORIDADE(Integer codigo, String descriçao) {
		this.codigo = codigo;
		this.descriçao = descriçao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescriçao() {
		return descriçao;
	} 
	
	public static PRIORIDADE toEnum(Integer cod) {
		if(cod == null) {
			return null;	
		}
		for(PRIORIDADE x : PRIORIDADE.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
				}
			}
		throw new IllegalArgumentException("PRIORIDADE INVALIDA");
	}
	
}
