package com.example.ramices.rolecultural.bean;

import java.io.Serializable;

/**
 * Created by Ramices on 27/10/2016.
 */

public class Teatro extends  InformacaoAbstract
{
    public Teatro(String nome, String descricao, String bairro, String logradouro, String telefone, long latitude, long longitude)
    {

        this.nome = nome;
        this.descricao = descricao;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.telefone = telefone;
        this.latitude = latitude;
        this.longitude = longitude;

    }

}
