package com.example.ramices.rolecultural.bean;

import java.io.Serializable;

/**
 * Created by Ramices on 27/10/2016.
 */

public abstract class InformacaoAbstract implements Serializable {

        protected String nome;
        protected String descricao;
        protected String bairro;
        protected String logradouro;
        protected String telefone;
        protected long  latitude;
        protected long  longitude;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public String getBairro() {
        return bairro;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return this.nome + "\n" + this.descricao + "\n" + this.bairro + "\n"+ this.logradouro + "\n" + this.telefone;
    }
}
