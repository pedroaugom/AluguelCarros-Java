package br.com.aluguelcarros.dao.impl;

import br.com.aluguelcarros.dao.IGenericDAO;
import br.com.aluguelcarros.model.pessoas.Cliente;

import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO implements IGenericDAO<Cliente, Integer> {
    @Override
    public void inserir(Cliente obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void alterar(Cliente obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void apagar(int obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public Cliente buscar(Integer key) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Cliente> buscarTodos() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int quantidade() throws SQLException, ClassNotFoundException {
        return 0;
    }
}
