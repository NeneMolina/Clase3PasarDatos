package com.example.ciclo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2 extends AppCompatActivity {

    TextView usuario;
    TextView Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        usuario = findViewById(R.id.usuarioPantallaDOs);
        String user = getIntent().getStringExtra("pasword");
        usuario.setText(user);

        Pass = findViewById(R.id.usuarioPantallaDOs);
        String Pask = getIntent().getStringExtra("user");
        Pass.setText(Pask);
    }
}