package com.YEGER.HELPS.domain.enums;

public enum PERFIL {
ADMIN(0,"ROLE_ADMIN"), CLIENTE(1,"ROLE_CLIENTE"), TECNICO(2,"ROLE_TECNICO");
	
	private Integer codigo;
	private String descriçao;
	
	private PERFIL(Integer codigo, String descriçao) {
		this.codigo = codigo;
		this.descriçao = descriçao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescriçao() {
		return descriçao;
	} 
	
	public static PERFIL toEnum(Integer cod) {
		if(cod == null) {
			return null;	
		}
		for(PERFIL x : PERFIL.values()) {
			if(cod.equals(x.getCodigo())) {
				return x;
				}
			}
		throw new IllegalArgumentException("PERFIL INVALIDO");
	}
	
}
