package br.edu.fatecpg.tecprog.heranca.pagamento.model;

public class PagamentoCartao implements IPagamento {

	private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor * 1.05; 
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento no Cartão\n" +
               "Valor original: R$ " + valor + "\n" +
               "Taxa (5%): R$ " + (valor * 0.05) + "\n" +
               "Total pago: R$ " + calcularPagamento();
    }	
}
