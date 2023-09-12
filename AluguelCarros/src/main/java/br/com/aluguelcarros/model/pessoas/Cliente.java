package br.com.aluguelcarros.model.pessoas;

import java.time.LocalDate;

public class Cliente extends Pessoa {
    private LocalDate dataNascimento;

    public Cliente() {
    }

    public Cliente(int idPessoa, String nome, String login, String senha, String email, String cpf, LocalDate dataNascimento) {
        super(idPessoa, nome, login, senha, email, cpf);
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
