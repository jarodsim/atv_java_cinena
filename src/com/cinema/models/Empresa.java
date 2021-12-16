/**
 * 
 */
package com.cinema.models;

/**
 * @author jarod
 *
 */
public class Empresa {
	private String cnpj;
	private String tipo;
	private String NomeFantasia;

	protected Empresa(String cnpj, String tipo, String nomeFantasia) {
		super();
		this.cnpj = cnpj;
		this.tipo = tipo;
		NomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeFantasia() {
		return NomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}

}
