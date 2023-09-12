package br.com.aluguelcarros.model.aluguel;

import br.com.aluguelcarros.model.pessoas.Cliente;
import br.com.aluguelcarros.model.pessoas.Funcionario;
import br.com.aluguelcarros.model.veiculo.Carro;

import java.time.LocalDate;

public class Aluguel {
    private int idAluguel;
    private Cliente cliente;
    private Funcionario funcionario;
    private Carro carro;
    private LocalDate retirada;
    private LocalDate devolucao;
    private boolean ativo;

    public Aluguel() {
    }

    public Aluguel(int idAluguel, Cliente cliente, Funcionario funcionario, Carro carro, LocalDate retirada, LocalDate devolucao, boolean ativo) {
        this.idAluguel = idAluguel;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.carro = carro;
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.ativo = ativo;
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDate getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDate retirada) {
        this.retirada = retirada;
    }

    public LocalDate getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(LocalDate devolucao) {
        this.devolucao = devolucao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
