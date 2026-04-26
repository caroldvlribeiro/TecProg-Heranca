package br.edu.fatecpg.tecprog.heranca.funcionario.model;

public class Gerente extends Funcionario implements IFuncionario{

	public Gerente(String nm, double hr, double vl) {
		super(nm, hr, vl);
		// TODO Auto-generated constructor stub
	}
	public void fecharCaixa(double vlCaixa, double sangria, double vendido) {
		vlCaixa -= sangria; 
		if (vlCaixa<vendido){
			System.out.println("===== FECHAMENTO DE CAIXA =====");
			System.out.println("Quebra de caixa: R$"+(vendido-vlCaixa)+ "faltando!");;
			}else { System.out.println("===== FECHAMENTO DE CAIXA ====="); 
			System.out.println("Caixa fechado com sucesso!");
			}
		}

}
