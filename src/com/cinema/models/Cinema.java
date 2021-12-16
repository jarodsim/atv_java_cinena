/**
 * 
 */
package com.cinema.models;

/**
 * @author jarod
 *
 */
public class Cinema extends Empresa {
	private String total_assentos;
	private String horario_abertura;
	private String horario_fechamento;

	public Cinema(String cnpj, String tipo, String nomeFantasia, String total_assentos, String horario_abertura,
			String horario_fechamento) {
		super(cnpj, tipo, nomeFantasia);
		this.total_assentos = total_assentos;
		this.horario_abertura = horario_abertura;
		this.horario_fechamento = horario_fechamento;
	}

	public String getTotal_assentos() {
		return total_assentos;
	}

	public void setTotal_assentos(String total_assentos) {
		this.total_assentos = total_assentos;
	}

	public String getHorario_abertura() {
		return horario_abertura;
	}

	public void setHorario_abertura(String horario_abertura) {
		this.horario_abertura = horario_abertura;
	}

	public String getHorario_fechamento() {
		return horario_fechamento;
	}

	public void setHorario_fechamento(String horario_fechamento) {
		this.horario_fechamento = horario_fechamento;
	}

}
