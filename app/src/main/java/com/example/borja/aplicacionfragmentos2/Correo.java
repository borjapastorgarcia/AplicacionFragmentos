package com.example.borja.aplicacionfragmentos2;

/**
 * Created by Borja on 27/10/2015.
 */
public class Correo {
    private String de, asunto, texto;

    public Correo(String de, String asunto, String texto) {
        this.de = de;
        this.asunto = asunto;
        this.texto = texto;
    }

    public String getDe() {
        return de;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTexto() {
        return texto;
    }
}
