package br.com.dev.ecommerce.admin.terceiro.dto;

import br.com.dev.ecommerce.admin.terceiro.Categoria;
import br.com.dev.ecommerce.dto.AbstractDTO;

public class TerceiroDTO extends AbstractDTO {

	private String nome;
	private String cpf;
	private Categoria categoria;

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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
