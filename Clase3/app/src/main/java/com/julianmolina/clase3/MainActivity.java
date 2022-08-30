package com.example.ciclo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, password;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart(){
        super.onStart();
        user = findViewById(R.id.userr);
        password = findViewById(R.id.pass);
        send = findViewById(R.id.boton);
    }

    @Override
    protected void onResume(){
        super.onResume();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!user.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Correctos", Toast.LENGTH_SHORT).show();
                    //crearAlarma();
                    enviarPantallaDos();
                }else {
                    Toast.makeText(MainActivity.this, "DatosIncorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void enviarPantallaDos(){
        String pass = password.getText().toString();
        Intent intento = new Intent(this,Pantalla2.class);
        intento.putExtra("pasword",pass);
        String usuar = user.getText().toString();
        Intent intento2 = new Intent(this,Pantalla2.class);
        intento.putExtra("user",pass);
        startActivity(intento);
        Log.i("intent",""+pass);
    }

    private void crearAlarma(){
        Intent  alarma = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE,"Clase")
                .putExtra(AlarmClock.EXTRA_HOUR, 6)
                .putExtra(AlarmClock.EXTRA_MINUTES,50)
        if (alarma.resolveActivity(getPackageManager())!=null) {
            startActivity(alarma);
        }
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onStop(){
        super.onStop();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }


}