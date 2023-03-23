package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calc1 extends AppCompatActivity {
    Button voltbt;
    Button  btnsoma;
    Button btnsub;
    Button btnmulti;
    Button btndiv;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora1_main);

        btndiv=findViewById(R.id.btndivi);
        btnmulti=findViewById(R.id.btnmulti);
        btnsub=findViewById(R.id.btnmenos);
        btnsoma=findViewById(R.id.btnsomar);
        voltbt=findViewById(R.id.voltarbt);
        voltbt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Calc1.this, TelaInicial.class);
                startActivity(in); //voltar para o menu inicial
            }
        });

        EditText e1=(EditText)findViewById(R.id.txt1); //variavel criada para poder usar o texto
        EditText e2=(EditText)findViewById(R.id.txt2);
        TextView t1=(TextView) findViewById(R.id.txt3);
        String s1=e1.getText().toString(); //pegar os numeros em forma de string
        String s2=e2.getText().toString();
        btnsoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                num1= (int) Double.parseDouble(e1.getText().toString());
                num2= (int) Double.parseDouble(e2.getText().toString());

                // somar os numeros
                    int soma = num1 + num2;
                    t1.setText(Integer.toString(soma));

            }
        });
    }
}