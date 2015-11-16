package com.elcacharreo.android.miprimeraaplicacion2015;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    float fOperando1;
    float fOperando2;
    int iOperador;

    public void inicializacion()
    {
        fOperando1=0;
        fOperando2=0;

        iOperador=R.id.btAC;
    }

    public void teclaC(View v)
    {
        TextView tvVisor=(TextView)findViewById(R.id.textView);
        tvVisor.setText(R.string.txtInicial);
    }

    public void teclaAC(View v)
    {
        inicializacion();
        teclaC(v);

    }

    public void teclanumerica(View v)
    {

        Button botonPulsado= (Button)v;  // Casting


        String strTextoBoton=botonPulsado.getText().toString();
        /*
        String strMensajeInicial="Has pulsado la tecla: ";
        String strMensaje=strMensajeInicial+strTextoBoton;

        Toast.makeText(this,strMensaje,Toast.LENGTH_LONG).show();
        */


        TextView tvVisor=(TextView)findViewById(R.id.textView);

        String strValorAntiguo=tvVisor.getText().toString();
        if(strValorAntiguo.equals("0"))
        {strValorAntiguo=""; }
        String strValorNuevo=strValorAntiguo+strTextoBoton;


        try {
        //    float operando1 = Float.valueOf(strValorNuevo);

            tvVisor.setText(strValorNuevo);
        }
        catch (Exception ex)
        {
            Toast.makeText(this,"Tecla incorrecta:"+strTextoBoton,Toast.LENGTH_LONG).show();
        }















    }

}
