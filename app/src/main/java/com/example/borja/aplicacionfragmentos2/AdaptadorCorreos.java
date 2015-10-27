package com.example.borja.aplicacionfragmentos2;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Borja on 27/10/2015.
 */
public class AdaptadorCorreos extends ArrayAdapter<Correo> {
    Activity context;
    private Correo[]datos;
    public AdaptadorCorreos(Fragment context,Correo[]datos) {
        super(context.getActivity(), R.layout.listitem_correo, datos);
        this.datos=datos;
        this.context = context.getActivity();
    }
    public AdaptadorCorreos(Context context,Correo[]datos) {
        super(context, R.layout.listitem_correo, datos);
        this.context = (Activity)context;
        this.datos=datos;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.listitem_correo, null);

        TextView lblDe = (TextView)item.findViewById(R.id.LblDe);
        lblDe.setText(datos[position].getDe());

        TextView lblAsunto = (TextView)item.findViewById(R.id.LblAsunto);
        lblAsunto.setText(datos[position].getAsunto());

        return(item);
    }
}
/*
* class AdaptadorCorreos extends ArrayAdapter<Correo>{
        Activity context;
        AdaptadorCorreos(Fragment context) {
            super(context.getActivity(), R.layout.listitem_correo, datos);
            this.context = context.getActivity();
        }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listitem_correo, null);

            TextView lblDe = (TextView)item.findViewById(R.id.LblDe);
            lblDe.setText(datos[position].getDe());

            TextView lblAsunto = (TextView)item.findViewById(R.id.LblAsunto);
            lblAsunto.setText(datos[position].getAsunto());

            return(item);
        }
    }*/