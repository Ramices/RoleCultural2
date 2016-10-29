package com.example.ramices.rolecultural.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ramices.rolecultural.R;
import com.example.ramices.rolecultural.bean.Museu;
import com.example.ramices.rolecultural.bean.Teatro;

/**
 * Created by Ramices on 28/10/2016.
 */

public class DetalheFragment extends Fragment
{

    private TextView nome;
    private TextView descricao;
    private TextView bairro;
    private TextView logradouro;
    private TextView telefone;
    private TextView site;


    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup parent, Bundle bundle)
    {
        View view = layoutInflater.inflate(R.layout.fragment_detalhe, parent, false);


        nome = (TextView) view.findViewById(R.id.txtNomeD);
        descricao = (TextView) view.findViewById(R.id.txtDescricaoD);
        site = (TextView) view.findViewById(R.id.txtSiteD);
        bairro = (TextView) view.findViewById(R.id.txtBairroD);
        logradouro = (TextView) view.findViewById(R.id.txtLogradouroD);
        telefone = (TextView) view.findViewById(R.id.txtTelefoneD);


        switch ((String)bundle.getString("key"))
        {
            case "museu":
                Museu museu = (Museu)bundle.getSerializable("museu");

                nome.setText(museu.getNome());
                descricao.setText(museu.getDescricao());
                bairro.setText(museu.getBairro());
                logradouro.setText(museu.getLogradouro());
                telefone.setText(museu.getTelefone());
                site.setText(museu.getSite());

                break;

            case "teatro":
                Teatro teatro = (Teatro) bundle.getSerializable("museu");

                nome.setText(teatro.getNome());
                descricao.setText(teatro.getDescricao());
                bairro.setText(teatro.getBairro());
                logradouro.setText(teatro.getLogradouro());
                telefone.setText(teatro.getTelefone());
                site.setText("");

                break;

        }



        return view;

    }


}
