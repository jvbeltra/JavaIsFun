package com.example.dell_pc.javaisfun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Modelo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modelo1);
    }

    // -=-=-=-=-
//no caso da pessoa querer voltar pra uma atividade específica:
//--> primeiro, quando ela selecionar, será "decidido" qual o modelo daquela atividade ou pergunta
//--> decidido o modelo, será decidido qual o "i" daquela atividade, no caso o case do modelo
//--> pra não dar problema de dar sempre i++ quando ela for refazer uma ativ, deve ter algo que mostre se ela está fazendo aquela atividade pela primeira vez ou refazendo
//--> =-=-=-=--

    public EditText respostaUser;
    public TextView solucao;
    public TextView enunciado;
    public Button prox;

    public void checar(View view) {
        //a cada i++, pula pra outro case, e esse case é puxado por um método de outra atividade quando precisar, assim que acessar a tela
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0: {
                    respostaUser = (EditText) findViewById(R.id.resposta);
                    enunciado = (TextView) findViewById(R.id.enunciado);
                    solucao = (TextView) findViewById(R.id.solucao);
                    enunciado.setText("Digite oi");
                    prox = (Button) findViewById(R.id.button);
                    if (respostaUser.getText().toString().equals("oi")) {
                        solucao.setText("Boua garoto");
                    } else {
                        solucao.setText("É pra digitar oi fdp");
                    }
                    break;
                }


            case 1: {
                respostaUser = (EditText) findViewById(R.id.resposta);
                enunciado = (TextView) findViewById(R.id.enunciado);
                solucao = (TextView) findViewById(R.id.solucao);
                enunciado.setText("digite bla");
                if (respostaUser.getText().toString().equals("bla")) {
                    solucao.setText("continue assim ;)");
                } else {
                    solucao.setText("nao foi dessa vez");
                }
                i++;
                break;

            }

        }
    }
}
    }
