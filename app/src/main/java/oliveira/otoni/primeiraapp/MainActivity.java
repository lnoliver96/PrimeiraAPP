package oliveira.otoni.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

//        O elementos renderizam na tela
        setContentView(R.layout.activity_main);

//        Procura o botão na tela e atribui a uma variável
        Button btnEnviar = findViewById(R.id.btnEnviar);

//        Atribui o Ouvidor de clicks ao botão
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override


//            Função do evento de Click
            public void onClick(View v) {

//                Procura o editText na tela e atribui a uma variável: etDigiteAqui
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

//                Captura o texto digitado e atribui a variável: textoDigitado
                String textoDigitado = etDigiteAqui.getText().toString();

//                Cria uma inteção i para que ao passar de tela haja uma mudança
                Intent i = new Intent(MainActivity.this,NextActivity.class);

                
                i.putExtra("texto",textoDigitado);

//                Inicia a próxima tela
                startActivity(i);


            }
        });
    }
}