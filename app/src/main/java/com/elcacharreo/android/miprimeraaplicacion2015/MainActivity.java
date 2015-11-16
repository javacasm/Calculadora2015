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

    public void teclaOperador(View v)
    {
        // Recuperamos el contenido del visor
        TextView tvVisor=(TextView)findViewById(R.id.textView);
        String strVisor=tvVisor.getText().toString();
        fOperando1=Float.valueOf(strVisor);

        teclaC(v);  // Borramos el visor

        iOperador=v.getId(); // R.id.boton
    }

    public void teclaIgual(View v)
    {
        TextView tvVisor=(TextView)findViewById(R.id.textView);
        String strVisor=tvVisor.getText().toString();
        fOperando2=Float.valueOf(strVisor);

        float fResultado=0;

        switch (iOperador)
        {
            case R.id.btMas:
                fResultado=fOperando1+fOperando2;
                break;
            case R.id.btMenos:
                fResultado=fOperando1-fOperando2;
                break;
            case R.id.btPor:
                fResultado=fOperando1*fOperando2;
                break;
            case R.id.btDividido:
                fResultado=fOperando1/fOperando2;
                break;
            case R.id.btPercent:
                fResultado=fOperando1*100/fOperando2;
                break;

        }

        String strResultado=Float.toString(fResultado);

        tvVisor.setText(strResultado);


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
