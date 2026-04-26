package br.edu.fatecpg.tecprog.heranca.funcionario.model;

public abstract class Funcionario implements IFuncionario {
	private String nome;
	private double hrTrabalhadas;
	private double vlHora;
	
	public Funcionario(String nm, double hr, double vl) {
		this.nome = nm;
		this.hrTrabalhadas = hr;
		this.vlHora = vl;
	}
	
	public void setNome(String nm) {
		this.nome = nm;
	}
	public String getNome() {
		return this.nome;
	}
	public void setHrTrabalhadas(double hr) {
		this.hrTrabalhadas = hr;
	}
	public double getHrTrabalhadas(){
		return this.hrTrabalhadas;
	}
	public void setVlHora(double vl) {
		this.vlHora = vl;
	}
	public double getVlHora() {
		return this.vlHora;
	}
	public void baterPonto() {
		System.out.println("Ponto registrado!");
	}
	public double salario(){
		return vlHora*hrTrabalhadas;
	}

	@Override
	public String toString() {
		return "Funcionario \nNome: " + nome + ", Horasr Trabalhadas: " + hrTrabalhadas + ", Valor Hora: " + vlHora+"\n";
	};
	
}
