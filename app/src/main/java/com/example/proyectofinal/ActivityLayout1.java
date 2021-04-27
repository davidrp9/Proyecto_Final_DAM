/*
    Codigo creado por Antonio Nieto y David Rodriguez
    Fecha de creación 27 de Abril 2021
 */

package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLayout1 extends AppCompatActivity {
    //Esta actividad corresponde a la vista de inicio donde se podrá entrar a la app o se podrá crear un usuario

    private Button btn_Registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutInicio);
    }

    //La función onClickIntent esta asignada a los dos botones del layout ActivityMain y dependiendo del id del botón se ejecutará una función diferente.
    public void onClickIntent (View v) {
        int id = v.getId();

        switch (id)
        {
            case R.id.Btn_Volver:
                entrar();
                break;
            default:
                registrar();
                break;
        }
    }

    //Método asignado al botón entrar para poder entrar a la app.
    //Aqui se accederá al API REST para comprobar si el usuario y la contraseña son correctos.
    public void entrar() {
        startActivity(new Intent(this, ActivityLayout2.class));
    }

    //Método asignada al botón registrar para poder registrarse en la base de datos.
    public void registrar () {startActivity(new Intent(this, ActivityLayout5.class));}
}