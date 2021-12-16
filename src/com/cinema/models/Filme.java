/**
 * 
 */
package com.cinema.models;

/**
 * @author jarod
 *
 */
public class Filme {
	protected int id;
	protected String nome;
	protected String data_estreia;
	protected String genero;
	protected String classificacao_indicativa;

	public Filme(int id, String nome, String data_estreia, String genero, String classificacao_indicativa) {
		super();
		this.id = id;
		this.nome = nome;
		this.data_estreia = data_estreia;
		this.genero = genero;
		this.classificacao_indicativa = classificacao_indicativa;
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

	public String getData_estreia() {
		return data_estreia;
	}

	public void setData_estreia(String data_estreia) {
		this.data_estreia = data_estreia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getClassificacao_indicativa() {
		return classificacao_indicativa;
	}

	public void setClassificacao_indicativa(String classificacao_indicativa) {
		this.classificacao_indicativa = classificacao_indicativa;
	}

}
