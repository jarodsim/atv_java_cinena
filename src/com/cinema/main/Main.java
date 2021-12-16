/**
 * 
 */
package com.cinema.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cinema.models.Cinema;
import com.cinema.models.Filme;
import com.cinema.models.Sala;

/**
 * @author jarod
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Filme filme = new Filme(1, "Homem Aranha - Sem volta pra casa", "19/12/2021", "herói", "+14");
		List<Filme> filmesSala1 = new ArrayList<Filme>();
		filmesSala1.add(filme);

		Sala sala = new Sala(1, "Lançamentos", 25, 22.50, filmesSala1);
		List<Sala> salas = new ArrayList<Sala>();
		salas.add(sala);

		System.out.println("Qual o CNPJ da empresa?");
		String cnpj = input.nextLine();
		System.out.println("Qual o tipo da empresa?");
		String tipo = input.nextLine();
		System.out.println("Qual o nome fantasia da empresa?");
		String nome_fantasia = input.nextLine();
		System.out.println("Qual o total de assentos da " + nome_fantasia);
		String total_assentos = input.nextLine();
		System.out.println("Qual o horário de abertura?");
		String abertura = input.nextLine();
		System.out.println("Qual o horário de fechamento?");
		String fechamento = input.nextLine();

		Cinema cinema = new Cinema(cnpj, tipo, nome_fantasia, total_assentos, abertura, fechamento);

		int escolha = 10;

		while (escolha != 0) {
			System.out.println("-----------CINEMA " + cinema.getNomeFantasia() + " -----------------\n");
			System.out.println("Abre as " + cinema.getHorario_abertura());
			System.out.println("Fecha as " + cinema.getHorario_fechamento());
			System.out.println("MENU-->_\n");
			System.out.println("Escolha uma opção abaixo ou digite 0 para sair:\n");
			System.out.println("|1 - Listar salas e seus filmes|\n|2 - Comprar ingresso|\n|0 - Sair|\n");
			escolha = input.nextInt();

			switch (escolha) {
			case 1:
				listarSalasEFilmes(salas);
				break;
			case 2:
				System.out.println(sala.comprarIngresso());
				break;
			case 0:
				System.out.println("\nTchau :)\nAplicação encerrada pelo usuário\n");
				escolha = 0;
				break;
			default:
				break;
			}
		}
	}

	private static void listarSalasEFilmes(List<Sala> salas) {
		// TODO Auto-generated method stub
		for (Sala sala : salas) {
			System.out.println("***********************************************");
			System.out.println("ID da sala: " + sala.getId());
			System.out.println("Nome da sala: " + sala.getNome());
			System.out.println("Assentos/ingressos disponíveis: " + sala.getAssentos());
			System.out.println("Valor do ingresso R$: " + sala.getValor());
			System.out.println(" -> LISTA DE FILMES:");

			List<Filme> filmes = sala.getFilmes();

			for (Filme filme : filmes) {
				System.out.println("____________________________");
				System.out.println("  |Nome do Filme: " + filme.getNome());
				System.out.println("  |Data de estreia: " + filme.getData_estreia());
				System.out.println("  |Gênero: " + filme.getGenero());
				System.out.println("  |Classificação indicativa: " + filme.getClassificacao_indicativa());
				System.out.println("____________________________");
			}
			System.out.println("***********************************************");
		}
	}

}
