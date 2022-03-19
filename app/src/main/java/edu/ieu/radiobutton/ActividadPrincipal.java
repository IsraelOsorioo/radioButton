package edu.ieu.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActividadPrincipal extends AppCompatActivity {

    private RadioButton radioDeposito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_principal);

        radioDeposito = (RadioButton) findViewById(R.id.radio_deposito);


    }

    public void comprobarModoPago(View v){
        if (radioDeposito.isChecked()){
            final String text = "Comprobar ubicación del usuario";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
    }
}