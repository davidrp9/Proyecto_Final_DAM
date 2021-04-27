/*
    Codigo creado por Antonio Nieto y David Rodriguez
    Fecha de creación 27 de Abril 2021
 */

package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLayout2 extends AppCompatActivity {
    //Esta actividad corresponde a la vista Principal donde se podrán visualizar los ultimos post, se podrá consultar la información de un usuario,
    //se podrá cerrar la sesión, se podrá acceder a la información de los posts.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutPrincipal);
    }

    public void onClickIntent (View v) {
        int id = v.getId();

        switch (id)
        {
                //Refresca los ultimos post que aparecen en la vista principal.
            case R.id.Btn_Volver:
                startActivity(new Intent(this, ActivityLayout2.class));
                break;
                //Te dirije a la información del usuario registrado.
            case R.id.Btn_Confirmar:
                startActivity(new Intent(this, ActivityLayout3.class));
                break;
                //Cierra la sesión del usuario registrado.
            case R.id.Btn_Atras:
                finish();
                break;
                //Te dirije a la información del usuario que ha publicado el post.
            case R.id.imageButton20:
                startActivity(new Intent(this, ActivityLayout3.class));
                break;
                //Te dirije a la información del post
            case R.id.textView50:
                startActivity(new Intent(this, ActivityLayout4.class));
                break;
                //Te dirije a una vista donde se podrá crear un publicar un nuevo post
            default:
                startActivity(new Intent(this, ActivityLayout4.class));
        }
    }
}