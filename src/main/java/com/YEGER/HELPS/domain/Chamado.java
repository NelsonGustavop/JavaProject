package com.YEGER.HELPS.domain;

import java.time.LocalDate;

import com.YEGER.HELPS.domain.enums.PRIORIDADE;
import com.YEGER.HELPS.domain.enums.STATUS;

public class Chamado {
	
	private Integer id;
	private LocalDate dataAbertura = LocalDate.now();
	private LocalDate dataFechamento;
	private PRIORIDADE prioridade;
	private STATUS status;
	private String titulo;
	private String observacoes;
	
	
}

