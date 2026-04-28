package br.edu.fatecpg.tecprog.heranca.autenticavel.model;

public interface IAutenticavel {
public boolean login(String usuario, String senha);
public void logout();
}
