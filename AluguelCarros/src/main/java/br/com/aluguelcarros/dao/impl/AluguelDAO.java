package br.com.aluguelcarros.dao.impl;

import br.com.aluguelcarros.dao.IGenericDAO;
import br.com.aluguelcarros.model.aluguel.Aluguel;

import java.sql.SQLException;
import java.util.ArrayList;

public class AluguelDAO implements IGenericDAO<Aluguel, Integer> {
    @Override
    public void inserir(Aluguel obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void alterar(Aluguel obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void apagar(int obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public Aluguel buscar(Integer key) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Aluguel> buscarTodos() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int quantidade() throws SQLException, ClassNotFoundException {
        return 0;
    }
}
