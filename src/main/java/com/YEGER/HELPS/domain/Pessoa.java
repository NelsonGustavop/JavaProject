package com.YEGER.HELPS.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import com.YEGER.HELPS.domain.enums.PERFIL;

public abstract class Pessoa {
	
	protected Integer id;
	protected String nome;
	protected String cpf;
	protected String email;
	protected String senha;
	
	protected Set<Integer> perfis = new HashSet<>();
	protected LocalDate dataCriacao = LocalDate.now();
	public Pessoa() {
		super();
		addPerfis(PERFIL.CLIENTE);
	}
	public Pessoa(Integer id, String nome, String cpf, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		addPerfis(PERFIL.CLIENTE);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Set<PERFIL> getPerfis() {
		return perfis.stream().map(x -> PERFIL.toEnum(x)).collect(Collectors.toSet());
	}
	public void addPerfis(PERFIL perfis) {
		this.perfis.add(perfis.getCodigo());
	}
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id);
	}
	
	
} 
