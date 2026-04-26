package br.edu.fatecpg.tecprog.heranca.funcionario.model;

public class Faxineiro  extends Funcionario implements IFuncionario {

	public Faxineiro(String nm, double hr, double vl) {
		super(nm, hr, vl);
		// TODO Auto-generated constructor stub
	}
	public void solicitarMaterial(String material, int quantidade) {
	    System.out.println("Solicitado: " + quantidade + "x " + material);
	}
}
