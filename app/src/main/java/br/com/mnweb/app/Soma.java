package br.com.mnweb.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Soma extends AppCompatActivity {

    EditText edtValor1, edtValor2;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soma);

        Intent intent = getIntent();
        String name = "Olá" + intent.getStringExtra("name");

        TextView text = findViewById(R.id.nome);
        text.setText(name);

        edtValor1 = findViewById(R.id.valor1);
        edtValor2 = findViewById(R.id.valor2);

        Button btnSomar = findViewById(R.id.btnCalcular);
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int intValor1 = Integer.parseInt(edtValor1.getText().toString());
                int intValor2 = Integer.parseInt(edtValor2.getText().toString());
                int intSoma = intValor1 + intValor2;

                TextView txtResultado = v.findViewById(R.id.resultado);
                txtResultado.setText('9');
            }
        });
    }

}
