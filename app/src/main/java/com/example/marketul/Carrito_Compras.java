package com.example.marketul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Carrito_Compras extends AppCompatActivity {
    private Button button_ConfigGuardar;
    private Button button_ConfigCancelar;
    private Button imageButton_Back;

    private ImageButton imageButtonMenu_Config;
    private ImageButton imageButtonMenu_Compras;
    private ImageButton imageButtonMenu_Direccion;
    private ImageButton imageButtonMenu_Pago;
    private ImageButton imageButtonMenu_Cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrito__compras);

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
        Intent intent = new Intent(Carrito_Compras.this, Configuracion_Cuenta.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Compras_OnClick() {
        Intent intent = new Intent(Carrito_Compras.this, Carrito_Compras.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Direccion_OnClick() {
        Intent intent = new Intent(Carrito_Compras.this, Direccion_Envio.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Pago_OnClick() {
        Intent intent = new Intent(Carrito_Compras.this, Proceso_Pago.class);
        startActivity(intent);
    }

    private void imageButtonMenu_Cerrar_OnClick() {
        Intent intent = new Intent(Carrito_Compras.this, Configuracion_Cuenta.class);
        startActivity(intent);
    }

}
