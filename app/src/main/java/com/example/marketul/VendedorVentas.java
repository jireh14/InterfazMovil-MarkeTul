package com.example.marketul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VendedorVentas  extends AppCompatActivity  {

    private ImageButton imageButtonMenu_Ventas;
    private ImageButton imageButtonMenu_Config7;
    private ImageButton imageButtonMenu_Cerrar7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor_ventas);

        imageButtonMenu_Ventas = (ImageButton) findViewById(R.id.imageButtonMenu_Ventas);
        imageButtonMenu_Ventas.setOnClickListener(onClickListener);

        imageButtonMenu_Config7 = (ImageButton) findViewById(R.id.imageButtonMenu_Config7);
        imageButtonMenu_Config7.setOnClickListener(onClickListener);

        imageButtonMenu_Cerrar7 = (ImageButton) findViewById(R.id.imageButtonMenu_Cerrar7);
        imageButtonMenu_Cerrar7.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == imageButtonMenu_Ventas)
                imageButtonMenu_Ventas_OnClick();

            if (v == imageButtonMenu_Config7)
                imageButtonMenu_Config7_OnClick();

            if (v == imageButtonMenu_Cerrar7)
                imageButtonMenu_Cerrar7_OnClick();
        }
    };
    private void imageButtonMenu_Ventas_OnClick() {
        Intent intent = new Intent(VendedorVentas.this, VendedorVentas.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Config7_OnClick() {
        Intent intent = new Intent(VendedorVentas.this, ConfiguracionVendedor.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Cerrar7_OnClick() {
        Intent intent = new Intent(VendedorVentas.this, ConfiguracionVendedor.class);
        startActivity(intent);
    }
}
