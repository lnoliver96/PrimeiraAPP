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

//        Le o arquivo de layout e constroi a interface
        setContentView(R.layout.activity_main);

//        Obtem o botão enviar
        Button btnEnviar = findViewById(R.id.btnEnviar);

//        Define o Ouvidor de clicks
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override


//            O metodo onClick eh chamado toda vez que há um click do mouse
            public void onClick(View v) {

//                Obtem o editText na tela
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

//                Obtem o texto digitado na caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();

//                Cria uma inteção para navegar para a proxima tela haja
                Intent i = new Intent(MainActivity.this,NextActivity.class);

//                Envia o texto da caixa junto com a Intent, para enviar para a proxima tela
                i.putExtra("texto",textoDigitado);

//                Navegar para a proxima tela
                startActivity(i);


            }
        });
    }
}