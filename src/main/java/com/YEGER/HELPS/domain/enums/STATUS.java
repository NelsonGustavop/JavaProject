package com.YEGER.HELPS.domain.enums;

public enum STATUS {
	ABERTO(0,"ABERTO"), ANDAMDENTO(1,"ANDAMDENTO"), ENCERRADO(2,"ENCERRADO");

	
	private Integer codigo;
	private String descriçao;
	
	private STATUS(Integer codigo, String descriçao) {
		this.codigo = codigo;
		this.descriçao = descriçao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescriçao() {
		return descriçao;
	} 
	
	public static STATUS toEnum(Integer cod) {
		if(cod == null) {
			return null;	
		}
		for(STATUS x : STATUS.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
				}
			}
		throw new IllegalArgumentException("STATUS INVALIDO");
	}
	
}
