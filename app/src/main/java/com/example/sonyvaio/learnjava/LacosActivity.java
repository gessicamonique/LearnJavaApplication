package com.example.sonyvaio.learnjava;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.dd.processbutton.iml.ActionProcessButton;
import com.example.sonyvaio.learnjava.entidades.Pergunta;

import java.util.List;
import java.util.Random;

public class LacosActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioButton mOpcao1;
    private RadioButton mOpcao2;
    private RadioButton mOpcao3;
    private RadioButton mOpcao4;
    private TextView mtext;
    private ActionProcessButton botao;

    private QuestoesApplication questoesApplication;
    private String[] escolha;

    private List<Pergunta> perguntas;
    private Pergunta pergunta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacos);

        questoesApplication = (QuestoesApplication) getApplicationContext();

        perguntas = questoesApplication.getPerguntaTipo("condicionais");
        Random random = new Random();
        pergunta = perguntas.get(random.nextInt(perguntas.size() - 1));

        escolha = new String[1];

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_lacos);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Laços");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mtext = (TextView) findViewById(R.id.textTitle);
        mtext.setText("" + pergunta.getTexto());

        mOpcao1 = (RadioButton) findViewById(R.id.alternativa1);
        mOpcao1.setText("" + pergunta.getAlternativas().get(0).getTexto());
        mOpcao1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mOpcao2.setChecked(false);
                    mOpcao3.setChecked(false);
                    mOpcao4.setChecked(false);
                    escolha[0] = mOpcao1.getText().toString();
                }
            }
        });

        mOpcao2 = (RadioButton) findViewById(R.id.alternativa2);
        mOpcao2.setText("" + pergunta.getAlternativas().get(1).getTexto());
        mOpcao2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mOpcao1.setChecked(false);
                    mOpcao3.setChecked(false);
                    mOpcao4.setChecked(false);
                    escolha[0] = mOpcao2.getText().toString();
                }
            }
        });

        mOpcao3 = (RadioButton) findViewById(R.id.alternativa3);
        mOpcao3.setText("" + pergunta.getAlternativas().get(2).getTexto());
        mOpcao3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mOpcao1.setChecked(false);
                    mOpcao2.setChecked(false);
                    mOpcao4.setChecked(false);
                    escolha[0] = mOpcao3.getText().toString();
                }

            }
        });

        mOpcao4 = (RadioButton) findViewById(R.id.alternativa4);
        mOpcao4.setText("" + pergunta.getAlternativas().get(3).getTexto());
        mOpcao4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mOpcao1.setChecked(false);
                    mOpcao2.setChecked(false);
                    mOpcao3.setChecked(false);
                    escolha[0] = mOpcao4.getText().toString();
                }
            }
        });

        botao = (ActionProcessButton) findViewById(R.id.btnConfirmar);
        if (botao != null) {
            botao.setOnClickListener(this);
        }

    }

    public void onClick(View view) {
        if (escolha[0].equalsIgnoreCase(pergunta.getRespostaCorreta().getTexto())) {
            Toast.makeText(this, "Você acertou!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LacosActivity.this, LacosActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Você errou!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id == android.R.id.home){
            new AlertDialog.Builder(this)
                    .setTitle("Tem certeza que deseja sair?")
                    .setMessage("Todo o progresso nesta sessão será perdido.")
                    .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            startActivity(new Intent(LacosActivity.this, MainActivity.class));
                            finish();
                        }
                    })
                    .setNegativeButton("Cancelar", null)
                    .create().show();
        }

        return super.onOptionsItemSelected(item);
    }
}
