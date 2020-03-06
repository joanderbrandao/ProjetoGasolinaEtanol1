package br.com.unipac.aulacombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

     EditText edVlrgasolina, edVlretanol;
     button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edVlretanol=(EditText) findViewById(R.id.edVlretanol);
        edVlrgasolina=(EditText) findViewById(R.id.edVlgasolina);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {
         double valor
        }
        }

        }
}
