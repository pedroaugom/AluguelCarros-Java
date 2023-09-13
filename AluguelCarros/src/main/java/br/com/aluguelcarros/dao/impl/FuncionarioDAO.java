package br.com.aluguelcarros.dao.impl;

import br.com.aluguelcarros.dao.IGenericDAO;
import br.com.aluguelcarros.model.pessoas.Funcionario;

import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDAO implements IGenericDAO<Funcionario, Integer> {
    @Override
    public void inserir(Funcionario obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void alterar(Funcionario obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void apagar(int obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public Funcionario buscar(Integer key) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Funcionario> buscarTodos() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int quantidade() throws SQLException, ClassNotFoundException {
        return 0;
    }
}
