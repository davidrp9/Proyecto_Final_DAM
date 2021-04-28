/*
    Codigo creado por Antonio Nieto y David Rodriguez
    Fecha de creación 27 de Abril 2021
 */

package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLayout5 extends AppCompatActivity {
    //Esta actividad corresponde a la vista donde se puede ver la información del post publicado por un usuario.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_registrar);
    }

    public void onClickIntent (View v) {
        int id = v.getId();

        switch (id)
        {
            //Dirige al usuario a la vista inicial (Registro)
            case R.id.Btn_Volver:
                startActivity(new Intent(this, ActivityLayout1.class));
                break;
            //Guarda la información en la base de datos y dirige al usuario a la vista principal.
            case R.id.Btn_Confirmar:
                startActivity(new Intent(this, ActivityLayout1.class));
                break;
        }
    }
}