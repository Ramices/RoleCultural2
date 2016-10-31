package com.example.ramices.rolecultural.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.ramices.rolecultural.TelaDetalhe;
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
    private Museu museu;
    private Intent it;

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

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id)
    {

        museu = museus.get(position);

        it = new Intent(getActivity(), TelaDetalhe.class);
        it.putExtra("key", "museu");
        it.putExtra("museu", museu);
        startActivity(it);

    }


}
