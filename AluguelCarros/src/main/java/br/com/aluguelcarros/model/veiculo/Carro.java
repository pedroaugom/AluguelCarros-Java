package br.com.aluguelcarros.model.veiculo;

import br.com.aluguelcarros.model.e.ECategoriaCarro;

public class Carro {
    private int idCarro;
    private String marca;
    private String modelo;
    private String placa;
    private Boolean alugado;
    private ECategoriaCarro categoriaCarro;

    public Carro() {
    }

    public Carro(int idCarro, String marca, String modelo, String placa, Boolean alugado, ECategoriaCarro categoriaCarro) {
        this.idCarro = idCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.alugado = alugado;
        this.categoriaCarro = categoriaCarro;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Boolean getAlugado() {
        return alugado;
    }

    public void setAlugado(Boolean alugado) {
        this.alugado = alugado;
    }

    public ECategoriaCarro getCategoriaCarro() {
        return categoriaCarro;
    }

    public void setCategoriaCarro(ECategoriaCarro categoriaCarro) {
        this.categoriaCarro = categoriaCarro;
    }
}
