package br.edu.fatecpg.tecprog.heranca.funcionario.model;

public class Vendedor  extends Funcionario implements IFuncionario {

	public Vendedor(String nm, double hr, double vl) {
		super(nm, hr, vl);
		// TODO Auto-generated constructor stub
	}
	public void vender(String produto, int quantidade, double valorUnitario) {
	    double total = quantidade * valorUnitario;
	    System.out.println("Venda: " + quantidade + "x " + produto +" | Total: R$ " + total);
	}

}
