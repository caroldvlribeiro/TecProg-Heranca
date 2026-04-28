package br.edu.fatecpg.tecprog.heranca.autenticavel.view;
import br.edu.fatecpg.tecprog.heranca.autenticavel.model.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usuario, senha;
		Scanner sc = new Scanner(System.in);
        SistemaDeSeguranca sistema = new SistemaDeSeguranca();

		do {
			System.out.println("Usuario: ");
			usuario = sc.nextLine();
			System.out.print("Senha: ");
	        senha = sc.nextLine();
	        if (!sistema.login(usuario, senha)) {
	        	System.out.println("Login inválido! Tente novamente.\n");
	        }
		}while(!sistema.situacaoAutenticado());
		System.out.println("\nBem-vindo ao sistema!");

		System.out.print("Deseja fazer logout? (s/n): ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("s")) {
            sistema.logout();
        }
	}

}
