package com.example.juan.myapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView lblresultado;

    private Button btn7, btn8, btn9, btnsuma, btn4, btn5, btn6, btnmulti, btn1, btn2, btn3, btdividir, btn0, btnpunto, btnrestar, btnborrar, btntexto, btnigual;

    private String operador;

    private double numero1, numero2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblresultado = (TextView) findViewById(R.id.lblresultado);

        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btnpunto = (Button) findViewById(R.id.btnpunto);


        btdividir = (Button) findViewById(R.id.btdividir);
        btnmulti = (Button) findViewById(R.id.btnmulti);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnrestar = (Button) findViewById(R.id.btnrestar);

        btnigual = (Button) findViewById(R.id.btnigual);

        btnborrar = (Button) findViewById(R.id.btnborrar);
        btntexto = (Button) findViewById(R.id.btntexto);


        btn7.setOnClickListener(btn7OnClickListener);
        btn8.setOnClickListener(btn8OnClickListener);
        btn9.setOnClickListener(btn9OnClickListener);
        btn4.setOnClickListener(btn4OnClickListener);
        btn5.setOnClickListener(btn5OnClickListener);
        btn6.setOnClickListener(btn6OnClickListener);
        btn0.setOnClickListener(btn0OnClickListener);
        btn1.setOnClickListener(btn1OnClickListener);
        btn2.setOnClickListener(btn2OnClickListener);
        btn3.setOnClickListener(btn3OnClickListener);
        btnpunto.setOnClickListener(btnpuntoOnClickListener);

        btdividir.setOnClickListener(btdividirOnClickListener);
        btnmulti.setOnClickListener(btnmultiOnClickListener);
        btnsuma.setOnClickListener(btnsumaOnClickListener);
        btnrestar.setOnClickListener(btnrestarOnClickListener);

        btnigual.setOnClickListener(btnigualOnClickListener);
        btnborrar.setOnClickListener(btnborrarOnClickListener);

    }


    View.OnClickListener btn7OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            lblresultado.setText(lblresultado.getText() + "7");

        }
    };

    View.OnClickListener btn8OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "8");
        }
    };


    View.OnClickListener btn9OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "9");
        }
    };

    View.OnClickListener btn4OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            lblresultado.setText(lblresultado.getText() + "4");
        }
    };

    View.OnClickListener btn5OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "5");
        }
    };

    View.OnClickListener btn6OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "6");
        }
    };

    View.OnClickListener btn0OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "0");
        }
    };

    View.OnClickListener btn1OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "1");
        }
    };

    View.OnClickListener btn2OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "2");
        }
    };

    View.OnClickListener btn3OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + "3");
        }
    };

    View.OnClickListener btnpuntoOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            lblresultado.setText(lblresultado.getText() + ".");
        }
    };

    View.OnClickListener btdividirOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            operador = "/";
            numero1 = Double.parseDouble(lblresultado.getText().toString());
            lblresultado.setText("");
        }
    };

    View.OnClickListener btnsumaOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            operador = "+";
            numero1 = Double.parseDouble(lblresultado.getText().toString());
            lblresultado.setText("");
        }
    };

    View.OnClickListener btnrestarOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            operador = "-";
            numero1 = Double.parseDouble(lblresultado.getText().toString());
            lblresultado.setText("");
        }
    };

    View.OnClickListener btnmultiOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            operador = "*";
            numero1 = Double.parseDouble(lblresultado.getText().toString());
            lblresultado.setText("");
        }
    };

    View.OnClickListener btnigualOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            numero2 = Double.parseDouble(lblresultado.getText().toString());

            switch (operador) {

                case "+":
                    resultado = numero1 + numero2;
                    break;

                case "/":
                    resultado = numero1 / numero2;
                    break;

                case "*":
                    resultado = numero1 * numero2;
                    break;

                case "-":
                    resultado = numero1 - numero2;
                    break;

            }

            if(resultado == (long) resultado)
                lblresultado.setText(String.format("%d", (long) resultado));
            else
                lblresultado.setText(String.format("%s", resultado));


        }


    };

    View.OnClickListener btnborrarOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            numero1 = 0;
            numero2 = 0;
            lblresultado.setText("");
        }
    };


}
