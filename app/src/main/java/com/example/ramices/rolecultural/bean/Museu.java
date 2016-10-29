package com.example.ramices.rolecultural.bean;

import java.io.Serializable;

/**
 * Created by Ramices on 27/10/2016.
 */

public class Museu extends InformacaoAbstract implements Serializable{

    private String site;

    public Museu(String nome, String descricao, String bairro, String logradouro, String telefone, int latitude, int longitude, String site)
    {

        this.nome = nome;
        this.descricao = descricao;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.telefone = telefone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.site = site;

    }

    public void setSite(String site)
    {
        this.site = site;

    }

    public String getSite()
    {
        return this.site;

    }

    @Override
    public String toString()
    {

        return super.toString()  + "\n" + site;

    }


}
