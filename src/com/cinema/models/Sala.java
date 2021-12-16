/**
 * 
 */
package com.cinema.models;

import java.util.List;
import java.util.Scanner;

/**
 * @author jarod
 *
 */
public class Sala {
	protected int id;
	protected String nome;
	protected int assentos;
	protected double valor;
	protected List<Filme> filmes;

	public Sala(int id, String nome, int assentos, double valor, List<Filme> filmes) {
		super();
		this.id = id;
		this.nome = nome;
		this.assentos = assentos;
		this.valor = valor;
		this.filmes = filmes;
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

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}

	@SuppressWarnings("resource")
	public String comprarIngresso() {
		Scanner input_sala = new Scanner(System.in);
		System.out.println("Digite a quantidade de ingressos/assentos");
		int quantidade_assentos = input_sala.nextInt();
		System.out.println("Digite o ID do fime");
		int id_filme = input_sala.nextInt();

		if (quantidade_assentos > this.assentos) {
			return "\n|-------ERROR------| A quantidade de assentos desejada é maior que a quantidade disponível :(\n";
		}

		Filme filme = null;

		for (int i = 0; i < this.filmes.size(); i++) {
			if (filmes.get(i).id == id_filme) {
				filme = filmes.get(i);
			}
		}

		if (filme == null) {
			return "\n|-------ERROR------|, O filme desejado não foi encontrado :(\n";
		}

		this.assentos = this.assentos - quantidade_assentos;

		return "\n****************************************\n|-------SUCESSO------|\nIngressos do filme: "
				+ filme.getNome() + " comprado com sucesso!\nData de exibicao: " + filme.getData_estreia()
				+ "\nQuantidade de ingressos: " + quantidade_assentos + "\n***************************************";
	}
}
