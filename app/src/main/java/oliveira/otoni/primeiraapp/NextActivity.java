package oliveira.otoni.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;

import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

//        Obtem o intent que criou essa tela
        Intent i = getIntent();

//        Obtem o texto que veio da tela anterior junto com a intent
        String texto = i.getStringExtra("texto");

//        Obtem o textView
        TextView tvTexto = findViewById(R.id.tvTexto);

//        Seta o texto no TextView
        tvTexto.setText(texto);

    }
}