package com.example.ramices.rolecultural.bean;

import java.io.Serializable;

/**
 * Created by Ramices on 27/10/2016.
 */

public class Teatro extends  InformacaoAbstract implements Serializable
{
    public Teatro(String nome, String descricao, String bairro, String logradouro, String telefone, int latitude, int longitude)
    {

        this.nome = nome;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.telefone = telefone;
        this.latitude = latitude;
        this.longitude = longitude;

    }

}
