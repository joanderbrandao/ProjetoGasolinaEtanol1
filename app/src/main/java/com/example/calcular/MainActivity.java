package com.example.calcular;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity<EditText> extends Activity {
EditText edVlrGasolina;
EditText edVlrEtanol;
Button bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edVlrGasolina = (EditText) findViewById(R.id.Gasolina);
        edVlrEtanol = (EditText) findViewById(R.id.Etanol);
        bt = (Button) findViewById(R.id.calcular);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double valorGasolina = edVlrGasolina.getText().toString();
                Double valorEtanol = Double.parseDouble(edVlrEtanol.getText().toString());

                double i = valorEtanol / valorGasolina;

                if (i > 0.7) {
                    Toast.makeText(MainActivity.this, "Compensa o uso da Gasolina", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Compensa o uso do Etanol", Toast.LENGTH_SHORT).show();
                }



            }


        });
    }
}
