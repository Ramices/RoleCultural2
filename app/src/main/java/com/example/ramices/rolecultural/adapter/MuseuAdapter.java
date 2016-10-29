package com.example.ramices.rolecultural.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ramices.rolecultural.R;
import com.example.ramices.rolecultural.bean.Museu;

import java.util.ArrayList;

/**
 * Created by Ramices on 27/10/2016.
 */

public class MuseuAdapter extends BaseAdapter {

    private ArrayList<Museu> museus;
    private Activity act;

    public MuseuAdapter(Activity act, ArrayList<Museu> mueus)
    {
        this.museus = mueus;
        this.act = act;

    }

    @Override
    public int getCount()
    {

        return museus.size();

    }

    @Override
    public Object getItem(int position)
    {
        return museus.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return 0;

    }

    @Override
    public View getView(int position, View recicleView, ViewGroup parent)
    {
        View view = act.getLayoutInflater().inflate(R.layout.museu_item_list, parent, false);

        Museu museu = museus.get(position);

        TextView nome = (TextView) view.findViewById(R.id.txtnome);
        TextView descricao = (TextView) view.findViewById(R.id.txtDescricao);
        TextView bairro = (TextView) view.findViewById(R.id.txtBairro);
        TextView logradouro = (TextView) view.findViewById(R.id.txtLogradouro);
        TextView telefone = (TextView) view.findViewById(R.id.txtTelefone);
        TextView site = (TextView) view.findViewById(R.id.txtSite);

        nome.setText(museu.getNome());
        descricao.setText(museu.getDescricao());
        bairro.setText(museu.getBairro());
        logradouro.setText(museu.getLogradouro());
        telefone.setText(museu.getTelefone());
        site.setText(museu.getSite());


        return view;
    }






}
