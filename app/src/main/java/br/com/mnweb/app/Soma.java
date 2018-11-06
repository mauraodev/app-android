package br.com.mnweb.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Soma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soma);

        Intent intent = getIntent();
        String name = "Olá" + intent.getStringExtra("name");

        TextView text = findViewById(R.id.nome);
        text.setText(name);
    }

    public void somar()
    {

    }
}
