package br.edu.fatecpg.tecprog.heranca.pagamento.model;

public class PagamentoDinheiro implements IPagamento {
	private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
    	return valor * 0.90; 
    }

    @Override
    public String emitirRecibo() {
    	return "Pagamento em Dinheiro\n" +
                "Valor original: R$ " + valor + "\n" +
                "Desconto (10%): R$ " + (valor * 0.10) + "\n" +
                "Total pago: R$ " + calcularPagamento();
    }
	
}
