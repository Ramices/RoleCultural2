package com.example.ramices.rolecultural.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ramices.rolecultural.R;
import com.example.ramices.rolecultural.bean.Teatro;



import java.util.ArrayList;

/**
 * Created by Ramices on 27/10/2016.
 */

public class TeatroAdapter extends BaseAdapter
{
    private Activity act;
    private ArrayList<Teatro> teatros;
    private TextView nome;
    private TextView descricao;
    private TextView bairro;
    private TextView logradouro;
    private TextView telefone;

    public TeatroAdapter(Activity act, ArrayList<Teatro> teatros)
    {
        this.act = act;
        this.teatros = teatros;

    }

    @Override
    public int getCount()
    {
        return teatros.size();

    }

    @Override
    public Object getItem(int postition)
    {
        return  teatros.get(postition);

    }

    @Override
    public long getItemId(int position)
    {

        return 0;

    }

    @Override
    public View getView(int position, View recicleView, ViewGroup parent)
    {
        View view = act.getLayoutInflater().inflate(R.layout.teatro_item_list, parent, false);

        Teatro teatro = teatros.get(position);

        nome = (TextView)view.findViewById(R.id.txtNomeT);
        descricao = (TextView)view.findViewById(R.id.txtDescricaoT);
        bairro = (TextView)view.findViewById(R.id.txtBairroT);
        logradouro = (TextView)view.findViewById(R.id.txtLogradoT);
        telefone = (TextView)view.findViewById(R.id.txtTelefoneT);

        nome.setText(teatro.getNome());
        descricao.setText(teatro.getDescricao());
        bairro.setText(teatro.getBairro());
        logradouro.setText(teatro.getLogradouro());
        telefone.setText(teatro.getTelefone());

        return view;

    }


}
