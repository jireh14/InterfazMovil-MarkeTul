package com.example.marketul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Direccion_Envio extends AppCompatActivity {
    private Button button_ConfigGuardar;
    private Button button_ConfigCancelar;
    private Button imageButton_Back;

    private ImageButton imageButtonMenu_Config;
    private ImageButton imageButtonMenu_Compras;
    private ImageButton imageButtonMenu_Direccion;
    private ImageButton imageButtonMenu_Pago;
    private ImageButton imageButtonMenu_Cerrar;

    public Spinner spinner_Pais;
    public Spinner spinner_Estado;

    String[] items;
    private boolean isFirstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion__envio);

        imageButtonMenu_Config = (ImageButton) findViewById(R.id.imageButtonMenu_Config);
        imageButtonMenu_Config.setOnClickListener(onClickListener);

        imageButtonMenu_Compras = (ImageButton) findViewById(R.id.imageButtonMenu_Compras);
        imageButtonMenu_Compras.setOnClickListener(onClickListener);

        imageButtonMenu_Direccion = (ImageButton) findViewById(R.id.imageButtonMenu_Direccion);
        imageButtonMenu_Direccion.setOnClickListener(onClickListener);

        imageButtonMenu_Pago = (ImageButton) findViewById(R.id.imageButtonMenu_Pago);
        imageButtonMenu_Pago.setOnClickListener(onClickListener);

        imageButtonMenu_Cerrar = (ImageButton) findViewById(R.id.imageButtonMenu_Cerrar);
        imageButtonMenu_Cerrar.setOnClickListener(onClickListener);

        spinner_Pais = (Spinner) findViewById(R.id.spinner_Pais);
        spinner_Estado = (Spinner) findViewById(R.id.spinner_Estado);

        //SPINNER PARA PAIS
        items= getResources().getStringArray(R.array.Pais);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Pais.setAdapter(adapter);
        spinner_Pais.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(isFirstTime){
                    isFirstTime = true;
                }
                else{
                    Toast.makeText(getApplicationContext(),items[position], Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //FINALIZA EL CODIGO DEL SPINNER_PAIS

        //SPINNER PARA ESTADO
        items= getResources().getStringArray(R.array.Estado);
        adapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_Estado.setAdapter(adapter);
        spinner_Estado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(isFirstTime){
                    isFirstTime = true;
                }
                else{
                    Toast.makeText(getApplicationContext(),items[position], Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //FINALIZA EL CODIGO DEL SPINNER_ESTADO
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == imageButtonMenu_Config)
                imageButtonMenu_Config_OnClick();

            if (v == imageButtonMenu_Compras)
                imageButtonMenu_Compras_OnClick();

            if (v == imageButtonMenu_Direccion)
                imageButtonMenu_Direccion_OnClick();

            if (v == imageButtonMenu_Pago)
                imageButtonMenu_Pago_OnClick();

            if (v == imageButtonMenu_Cerrar)
                imageButtonMenu_Cerrar_OnClick();
        }
    };

    private void imageButtonMenu_Config_OnClick() {
        Intent intent = new Intent(Direccion_Envio.this, Configuracion_Cuenta.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Compras_OnClick() {
        Intent intent = new Intent(Direccion_Envio.this, Carrito_Compras.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Direccion_OnClick() {
        Intent intent = new Intent(Direccion_Envio.this, Direccion_Envio.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Pago_OnClick() {
        Intent intent = new Intent(Direccion_Envio.this, Proceso_Pago.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Cerrar_OnClick() {
        Intent intent = new Intent(Direccion_Envio.this, Configuracion_Cuenta.class);
        startActivity(intent);
    }
}
