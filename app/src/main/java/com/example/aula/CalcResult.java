package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalcResult extends AppCompatActivity {
    Button voltbt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_result);
        voltbt=findViewById(R.id.btvolt);

        voltbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(CalcResult.this, Calc1.class);
                startActivity(in); //voltar para a tela da calculadora
            }
        });


        TextView trs=(TextView) findViewById(R.id.txt);

        String result = getIntent().getStringExtra("Teste");
        trs.setText(result);
    }
}