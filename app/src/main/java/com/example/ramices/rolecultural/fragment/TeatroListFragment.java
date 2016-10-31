package com.example.ramices.rolecultural.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


import com.example.ramices.rolecultural.TelaDetalhe;

import com.example.ramices.rolecultural.adapter.TeatroAdapter;
import com.example.ramices.rolecultural.bean.Teatro;

import java.util.ArrayList;


/**
 * Created by Ramices on 27/10/2016.
 */

public class TeatroListFragment extends ListFragment
{
    private  ArrayList<Teatro> teatros;
    private TeatroAdapter adaptadorTeatro;
    private Teatro teatro;
    private Intent it;

    @Override
    public void onActivityCreated(Bundle saveInstanceState)
    {
        super.onActivityCreated(saveInstanceState);

        teatros = criarTeatros();

        adaptadorTeatro = new TeatroAdapter(getActivity(), teatros);
        setListAdapter(adaptadorTeatro);

    }

    public ArrayList<Teatro> criarTeatros()
    {
        ArrayList<Teatro> t = new ArrayList<Teatro>();

        t.add(new Teatro("Teatro do Parque", "Completado 100 anos em 2015 o teatro se encontra fechado para obras desde 2014 com previsao para voltar a funcionar em Novembro de 2016.", "Boa Viagem", "Boa vista, Rua do Hospicio", "(81)33551553", 8061976, 34884742));

        return  t;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id)
    {

        teatro = teatros.get(position);

        it = new Intent(getActivity(), TelaDetalhe.class);
        it.putExtra("key", "teatro");
        it.putExtra("teatro", teatro);
        startActivity(it);

    }





}
