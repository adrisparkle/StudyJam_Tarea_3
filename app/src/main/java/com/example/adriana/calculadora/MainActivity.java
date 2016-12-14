package com.example.adriana.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    private TextView Resultado, Moment, Coma, Cero, Igual, Uno, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Borrar, Dividir, Multiplicar, Restar, Sumar;
    int flag=0; float first;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        Resultado= (TextView) findViewById(R.id.tvResultado);
        Coma= (TextView) findViewById(R.id.tvComa);
        Cero= (TextView) findViewById(R.id.tvCero);
        Igual= (TextView) findViewById(R.id.tvIgual);
        Uno= (TextView) findViewById(R.id.tvUno);
        Dos= (TextView) findViewById(R.id.tvDos);
        Tres= (TextView) findViewById(R.id.tvTres);
        Cuatro= (TextView) findViewById(R.id.tvCuatro);
        Cinco= (TextView) findViewById(R.id.tvCinco);
        Seis= (TextView) findViewById(R.id.tvSeis);
        Siete= (TextView) findViewById(R.id.tvSiete);
        Ocho= (TextView) findViewById(R.id.tvOcho);
        Nueve= (TextView) findViewById(R.id.tvNueve);
        Borrar= (TextView) findViewById(R.id.tvCE);
        Dividir= (TextView) findViewById(R.id.tvDivision);
        Multiplicar= (TextView) findViewById(R.id.tvMultiplicacion);
        Restar= (TextView) findViewById(R.id.tvResta);
        Sumar= (TextView) findViewById(R.id.tvSuma);
        Moment= (TextView) findViewById(R.id.tvMoment);
    }
    public void uno(View v)
    {
        String res=Resultado.getText().toString()+1;
        Resultado.setText(res);
    }
    public void dos(View v)
    {
        String res=Resultado.getText().toString()+2;
        Resultado.setText(res);
    }
    public void tres(View v)
    {
        String res=Resultado.getText().toString()+3;
        Resultado.setText(res);
    }
    public void cuatro(View v)
    {
        String res=Resultado.getText().toString()+4;
        Resultado.setText(res);
    }
    public void cinco(View v)
    {
        String res=Resultado.getText().toString()+5;
        Resultado.setText(res);
    }
    public void seis(View v)
    {
        String res=Resultado.getText().toString()+6;
        Resultado.setText(res);
    }
    public void siete(View v)
    {
        String res=Resultado.getText().toString()+7;
        Resultado.setText(res);
    }
    public void ocho(View v)
    {
        String res=Resultado.getText().toString()+8;
        Resultado.setText(res);
    }
    public void nueve(View v)
    {
        String res=Resultado.getText().toString()+9;
        Resultado.setText(res);
    }
    public void cero(View v)
    {
        String res=Resultado.getText().toString()+0;
        Resultado.setText(res);
    }
    public void coma(View v)
    {
        String res=Resultado.getText().toString()+",";
        Resultado.setText(res);
    }
    public void suma(View v)
    {
        first=Float.parseFloat(Resultado.getText().toString());
        Moment.setText(Resultado.getText().toString()+"+");
        String res="+";
        Resultado.setText(res);
        flag=1;
        Resultado.setText("");
    }
    public void resta(View v)
    {
        first=Float.parseFloat(Resultado.getText().toString());
        Moment.setText(Resultado.getText().toString()+"-");
        String res="-";
        Resultado.setText(res);
        flag=2;
        Resultado.setText("");
    }
    public void multiplicacion(View v)
    {
        first=Float.parseFloat(Resultado.getText().toString());
        Moment.setText(Resultado.getText().toString()+"x");
        String res="x";
        Resultado.setText(res);
        flag=3;
        Resultado.setText("");
    }
    public void dividir(View v)
    {
        first=Float.parseFloat(Resultado.getText().toString());
        Moment.setText(Resultado.getText().toString()+"/");
        String res="/";
        Resultado.setText(res);
        flag=4;
        Resultado.setText("");
    }
    public void borrar(View v)
    {
        Resultado.setText("");
        Moment.setText("");
    }
    public void igual(View v)
    {
        Moment.setText(Moment.getText().toString()+Resultado.getText().toString());
        float second=Float.parseFloat(Resultado.getText().toString());
        String res=Resultado.getText().toString();
        float rest=0;
        float a=first, b=second;
        if(flag==1)
        {
            rest=a+b;
        }else{
            if(flag==2){
                rest=a-b;
            }else{
                if(flag==3){
                    rest=a*b;
                }else{
                    if(flag==4){
                        rest=a/b;
                    }
                }
            }
        }
        Resultado.setText(""+rest);
    }
}
