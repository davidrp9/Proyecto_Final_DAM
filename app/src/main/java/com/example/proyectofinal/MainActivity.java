package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_Registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickIntent (View v) {
        int id = v.getId();

        switch (id)
        {
            case R.id.Btn_Volver:
                registrar();
                break;
        }
    }

    public void registrar () {
        startActivity(new Intent(this, ActivityLayout2.class));
    }
}