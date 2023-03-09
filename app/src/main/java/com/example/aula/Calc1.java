package com.example.aula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Calc1 extends AppCompatActivity {
    Button voltbt;
    int x;
    int y;
    Button addbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora1_main);

        public void LimparCampo{

        }
        voltbt=findViewById(R.id.voltarbt);
        voltbt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Calc1.this, TelaInicial.class);
                startActivity(in);
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora1_main);
        addbt=findViewById(R.id.adicaobt);
        addbt.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {

            }
        }
}