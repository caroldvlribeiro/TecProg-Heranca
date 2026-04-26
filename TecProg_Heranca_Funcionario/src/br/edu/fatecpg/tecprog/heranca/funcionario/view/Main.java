package br.edu.fatecpg.tecprog.heranca.funcionario.view;

import br.edu.fatecpg.tecprog.heranca.funcionario.model.*;

public class Main {
    public static void main(String[] args) {

        // GERENTE
        Gerente gerente = new Gerente("Carlos", 50, 8);
        System.out.println(gerente);
        gerente.baterPonto();
        System.out.println("\nSalário Gerente: R$ " + gerente.salario()+"\n");
        gerente.fecharCaixa(1000, 200, 900);

        System.out.println("---------------------------");

        // VENDEDOR
        Vendedor vendedor = new Vendedor("Maria", 20, 8);
        System.out.println(vendedor);
        vendedor.baterPonto();
        System.out.println("\nSalário Vendedor: R$ " + vendedor.salario()+"\n");
        vendedor.vender("Notebook", 2, 3500);

        System.out.println("---------------------------");

        // FAXINEIRO
        Faxineiro faxineiro = new Faxineiro("João", 15, 8);
        System.out.println(faxineiro);
        faxineiro.baterPonto();
        System.out.println("\nSalário Faxineiro: R$ " + faxineiro.salario()+"\n");
        faxineiro.solicitarMaterial("Detergente", 3);

        System.out.println("---------------------------");
    }
}