package br.com.aluguelcarros.model.pessoas;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private double salario;
    private LocalDate dataContrato;

    public Funcionario() {
    }

    public Funcionario(int idPessoa, String nome, String login, String senha, String email, String cpf, double salario, LocalDate dataContrato) {
        super(idPessoa, nome, login, senha, email, cpf);
        this.salario = salario;
        this.dataContrato = dataContrato;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }
}
