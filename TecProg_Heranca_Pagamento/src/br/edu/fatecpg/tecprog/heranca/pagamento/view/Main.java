package br.edu.fatecpg.tecprog.heranca.pagamento.view;
import br.edu.fatecpg.tecprog.heranca.pagamento.model.*;

public class Main {

	public static void main(String[] args) {

        double valor = 100.0;

        PagamentoCartao cartao = new PagamentoCartao(valor);
        PagamentoDinheiro dinheiro = new PagamentoDinheiro(valor);

        System.out.println(cartao.emitirRecibo());
        System.out.println("----------------------------");
        System.out.println(dinheiro.emitirRecibo());

	}

}
