package frasedodia.studio.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = { "Nos menores frascos é onde guardamos os melhores perfumes e os piores venenos" , "Knowledge is power and I know a lot" , "Aqui é que nem hidra corta uma cabeça e nasce mais duas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.TextoNovaFraseId);
        botaoNovaFrase = (Button) findViewById(R.id.BotaoNovaFraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt( frases.length );

                textoNovaFrase.setText( frases[ numeroAleatorio ] );
            }
        });

    }

}
