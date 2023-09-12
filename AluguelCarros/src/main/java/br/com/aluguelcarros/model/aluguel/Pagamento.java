package br.com.aluguelcarros.model.aluguel;

import br.com.aluguelcarros.model.e.ECategoriaCarro;
import br.com.aluguelcarros.model.i.ICategoriaCarro;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pagamento implements ICategoriaCarro {
    private int idPagamento;
    private Aluguel aluguel;
    private double valor;
    private LocalDateTime dataHoraTransacao;
    private final double VALOR_FIXO = 79.9;

    public Pagamento() {
    }

    public Pagamento(int idPagamento, Aluguel aluguel, double valor, LocalDateTime dataHoraTransacao) {
        this.idPagamento = idPagamento;
        this.aluguel = aluguel;
        this.valor = valor;
        this.dataHoraTransacao = dataHoraTransacao;
    }

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = (VALOR_FIXO * AdicionalCategoriaCarro()) * TempoAluguel();
    }

    public LocalDateTime getDataHoraTransacao() {
        return dataHoraTransacao;
    }

    public void setDataHoraTransacao(LocalDateTime dataHoraTransacao) {
        this.dataHoraTransacao = dataHoraTransacao;
    }
    private long TempoAluguel() {
        return ChronoUnit.DAYS.between(aluguel.getRetirada(), aluguel.getDevolucao());
    }

    @Override
    public double AdicionalCategoriaCarro() {
        if(aluguel.getCarro().getCategoriaCarro() == ECategoriaCarro.Economico) {
            return 1;
        } else if (aluguel.getCarro().getCategoriaCarro() == ECategoriaCarro.Sedan) {
            return 1.2;
        } else if (aluguel.getCarro().getCategoriaCarro() == ECategoriaCarro.SUV) {
            return 1.8;
        } else if (aluguel.getCarro().getCategoriaCarro() == ECategoriaCarro.Utilitario) {
            return 1.5;
        } else if (aluguel.getCarro().getCategoriaCarro() == ECategoriaCarro.Picape) {
            return 2.5;
        } else if (aluguel.getCarro().getCategoriaCarro() == ECategoriaCarro.Luxo) {
            return 3.4;
        }
        return 0;
    }
}
