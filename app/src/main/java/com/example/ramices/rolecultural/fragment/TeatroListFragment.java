package com.example.ramices.rolecultural.fragment;

import android.app.ListFragment;
import android.os.Bundle;

import com.example.ramices.rolecultural.adapter.TeatroAdapter;
import com.example.ramices.rolecultural.bean.Teatro;

import java.util.ArrayList;

/**
 * Created by Ramices on 27/10/2016.
 */

public class TeatroListFragment extends ListFragment
{
    private ArrayList<Teatro> teatros;
    private TeatroAdapter adaptadorTeatro;

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
        return new ArrayList<Teatro>();

    }



}
