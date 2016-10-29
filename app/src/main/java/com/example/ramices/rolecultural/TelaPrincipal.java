package com.example.ramices.rolecultural;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ramices.rolecultural.fragment.DetalheFragment;
import com.example.ramices.rolecultural.fragment.MuseuListFragment;
import com.example.ramices.rolecultural.fragment.TeatroListFragment;
import com.google.android.gms.maps.MapFragment;

/**
 * Created by Ramices on 28/10/2016.
 */

public class TelaPrincipal extends AppCompatActivity
{
    private FragmentManager fm;
    private FragmentTransaction ft;
    private DetalheFragment f;
    private String flag;

    /*
    Bundle bundle = new Bundle();
    bundle.putString("CHAVE_DO_VALOR_PASSADO", message);
    fragment.setArguments(bundle);
    */
    @Override
    public void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_tela_principal);
        fm = getFragmentManager();
        ft = fm.beginTransaction();
        ft.add(R.id.telaPrincipal, new MapFragment());
        ft.commit();
        flag = "map";

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        fm = getFragmentManager();
        ft = fm.beginTransaction();

        switch(item.getItemId())
        {
            case R.id.menuMap:
                if(!flag.equals("map")) {
                    ft.replace(R.id.telaPrincipal, new MapFragment());
                    ft.commit();
                    flag = "map";
                }
                    break;

            case R.id.menuMuseu:
                if(!flag.equals("museu")) {
                    ft.replace(R.id.telaPrincipal, new MuseuListFragment());
                    ft.commit();
                    flag = "museu";
                }
                    break;

            case R.id.menuTeatro:
                if(!flag.equals("teatro")) {
                    ft.replace(R.id.telaPrincipal, new TeatroListFragment());
                    ft.commit();
                    flag = "teatro";
                }
                    break;

        }

        return super.onOptionsItemSelected(item);
    }

}
