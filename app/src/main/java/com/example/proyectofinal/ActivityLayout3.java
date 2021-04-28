/*
    Codigo creado por Antonio Nieto y David Rodriguez
    Fecha de creación 27 de Abril 2021
 */

package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLayout3 extends AppCompatActivity {
    //Esta actividad corresponde a la vista del Perfil donde se podrá visualizar la información de usuario y los post publicados por este.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_perfil);
    }

    public void onClickIntent (View v) {
        int id = v.getId();

        switch (id)
        {
                //Dirije al usuario a la vista principal
            case R.id.Btn_Volver:
                startActivity(new Intent(this, ActivityLayout2.class));
                break;
                //Te dirije a la información del usuario registrado.
            case R.id.Btn_Confirmar:
                startActivity(new Intent(this, ActivityLayout3.class));
                break;
                //Dirjje al usuario a la vista anterior.
            case R.id.Btn_Atras:
                finish();
                break;
        }
    }
}