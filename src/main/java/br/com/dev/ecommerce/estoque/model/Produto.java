package br.com.dev.ecommerce.estoque.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

/**
 * @author Thalys Henrique
 * 
 *         25/08/2023 17:57
 */

@Entity
@DynamicUpdate
@Table(name = "produto")
public class Produto implements Serializable {

	private static final long serialVersionUID = 985098201651404172L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column
	private String nome;

	@NotEmpty
	@Column
	private String ncm;

	@NotEmpty
	@Column(length = 12)
	private String codigoBarras;

	@Audited
	@Column(precision = 19, scale = 10)
	private BigDecimal precoCusto;

	@Column(precision = 19, scale = 10)
	private BigDecimal precoVenda;

	@Column(precision = 19, scale = 4)
	private BigDecimal altura;

	@Column(precision = 19, scale = 4)
	private BigDecimal comprimento;

	@Column(precision = 19, scale = 4)
	private BigDecimal largura;

	@Column
	private boolean ativo;

	@Column
	private boolean decidirPrecoNaVenda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public BigDecimal getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(BigDecimal precoCusto) {
		this.precoCusto = precoCusto;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getComprimento() {
		return comprimento;
	}

	public void setComprimento(BigDecimal comprimento) {
		this.comprimento = comprimento;
	}

	public BigDecimal getLargura() {
		return largura;
	}

	public void setLargura(BigDecimal largura) {
		this.largura = largura;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
