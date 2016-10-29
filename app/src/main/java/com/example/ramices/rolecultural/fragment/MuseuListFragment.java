package com.example.ramices.rolecultural.fragment;

import android.app.ListFragment;
import android.os.Bundle;

import com.example.ramices.rolecultural.adapter.MuseuAdapter;
import com.example.ramices.rolecultural.bean.Museu;

import java.util.ArrayList;

/**
 * Created by Ramices on 27/10/2016.
 */

public class MuseuListFragment extends ListFragment
{
    private ArrayList<Museu> museus;
    private MuseuAdapter adaptador;

    @Override
    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        museus = getMuseus();
        adaptador = new MuseuAdapter(getActivity(), museus);
        setListAdapter(adaptador);


    }

    public ArrayList<Museu> getMuseus()
    {

        return new ArrayList<>();

    }


}
