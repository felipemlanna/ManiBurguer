package com.maniburguer.hamburgueria.maniburguer.Classes;

/**
 * Created by ind on 27/12/2017.
 */
public class Endereco {

    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    public Endereco() {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
