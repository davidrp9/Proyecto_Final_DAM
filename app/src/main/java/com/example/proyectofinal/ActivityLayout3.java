package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLayout3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
    }

    public void onClickIntent (View v) {
        int id = v.getId();

        switch (id)
        {
            case R.id.Btn_Inicio:
                startActivity(new Intent(this, ActivityLayout2.class));
                return;
            case R.id.Btn_Usuario:
                startActivity(new Intent(this, ActivityLayout3.class));
            case R.id.Btn_Atras:
                finish();
                break;
        }
    }
}