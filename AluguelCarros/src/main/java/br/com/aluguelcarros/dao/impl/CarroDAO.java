package br.com.aluguelcarros.dao.impl;

import br.com.aluguelcarros.dao.IGenericDAO;
import br.com.aluguelcarros.model.veiculo.Carro;

import java.sql.SQLException;
import java.util.ArrayList;

public class CarroDAO implements IGenericDAO<Carro, Integer> {
    @Override
    public void inserir(Carro obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void alterar(Carro obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public void apagar(int obj) throws SQLException, ClassNotFoundException {

    }

    @Override
    public Carro buscar(Integer key) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Carro> buscarTodos() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public int quantidade() throws SQLException, ClassNotFoundException {
        return 0;
    }
}
