package br.com.aluguelcarros.dao.impl;

import br.com.aluguelcarros.dao.IGenericDAO;
import br.com.aluguelcarros.model.aluguel.Pagamento;

import java.sql.SQLException;
import java.util.ArrayList;

public class PagamentoDAO implements IGenericDAO<Pagamento, Integer> {
    @Override
    public void inserir(Pagamento obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void alterar(Pagamento obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void apagar(int obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public Pagamento buscar(Integer key) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Pagamento> buscarTodos() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int quantidade() throws SQLException, ClassNotFoundException {
        return 0;
    }
}
