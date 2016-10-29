package com.example.ramices.rolecultural;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Ramices on 27/10/2016.
 */

public class TelaInicial extends AppCompatActivity
{

    private Button botao;

    @Override
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        botao = (Button)findViewById(R.id.btnEntrar);

        botao.setOnClickListener((v)->
        {
            Intent it = new Intent(this, TelaPrincipal.class);
            startActivity(it);
            finish();

        });


    }

}
