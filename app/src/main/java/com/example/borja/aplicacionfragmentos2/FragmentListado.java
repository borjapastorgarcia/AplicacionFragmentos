package com.example.borja.aplicacionfragmentos2;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Borja on 27/10/2015.
 */
public class FragmentListado extends Fragment {
    private static Correo[] datos =  new Correo[]{
                    new Correo("Persona 1", "Asunto del correo 1", "Texto del correo 1"),
                    new Correo("Persona 2", "Asunto del correo 2", "Texto del correo 2"),
                    new Correo("Persona 3", "Asunto del correo 3", "Texto del correo 3"),
                    new Correo("Persona 4", "Asunto del correo 4", "Texto del correo 4"),
                    new Correo("Persona 2", "Asunto del correo 2", "Texto del correo 2"),
                    new Correo("Persona 3", "Asunto del correo 3", "Texto del correo 3"),
                    new Correo("Persona 4", "Asunto del correo 4", "Texto del correo 4"),
                    new Correo("Persona 2", "Asunto del correo 2", "Texto del correo 2"),
                    new Correo("Persona 3", "Asunto del correo 3", "Texto del correo 3"),
                    new Correo("Persona 4", "Asunto del correo 4", "Texto del correo 4"),
                    new Correo("Persona 5", "Asunto del correo 5", "Texto del correo 5")};
    private ListView lstListado;
    private CorreosListener listener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstListado=(ListView)getView().findViewById(R.id.LstListado);
        lstListado.setAdapter(new AdaptadorCorreos(this, datos));
        lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(listener!=null){
                    listener.onCorreoSeleccionado((Correo)lstListado.getAdapter().getItem(position));
                }
            }
        });
    }

    public interface CorreosListener{
        void onCorreoSeleccionado(Correo c);
    }
    public void setCorreosListener(CorreosListener listener){
        this.listener=listener;
    }

    public static Correo[] getDatos() {
        return datos;
    }
}
