package br.com.mnweb.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);
        edit = findViewById(R.id.nome);

    }

    public void meuNome(final View view) {
        Intent intent = new Intent(NameActivity.this, Soma.class);
        intent.putExtra("name", edit.getText().toString());
        startActivity(intent);
    }

}
