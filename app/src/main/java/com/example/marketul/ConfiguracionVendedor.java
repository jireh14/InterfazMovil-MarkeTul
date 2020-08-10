package com.example.marketul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ConfiguracionVendedor extends AppCompatActivity{

    private ImageButton imageButtonMenu_Ventas2;
    private ImageButton imageButtonMenu_Config7;
    private ImageButton imageButtonMenu_Cerrar7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configu_vendedor);

        imageButtonMenu_Ventas2 = (ImageButton) findViewById(R.id.imageButtonMenu_Ventas2);
        imageButtonMenu_Ventas2.setOnClickListener(onClickListener);

        imageButtonMenu_Config7 = (ImageButton) findViewById(R.id.imageButtonMenu_Config7);
        imageButtonMenu_Config7.setOnClickListener(onClickListener);

        imageButtonMenu_Cerrar7 = (ImageButton) findViewById(R.id.imageButtonMenu_Cerrar7);
        imageButtonMenu_Cerrar7.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == imageButtonMenu_Ventas2)
                imageButtonMenu_Ventas2_OnClick();

            if (v == imageButtonMenu_Config7)
                imageButtonMenu_Config7_OnClick();

            if (v == imageButtonMenu_Cerrar7)
                imageButtonMenu_Cerrar7_OnClick();
        }
    };
    private void imageButtonMenu_Ventas2_OnClick() {
        Intent intent = new Intent(ConfiguracionVendedor.this, VendedorVentas.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Config7_OnClick() {
        Intent intent = new Intent(ConfiguracionVendedor.this, ConfiguracionVendedor.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Cerrar7_OnClick() {
        Intent intent = new Intent(ConfiguracionVendedor.this, ConfiguracionVendedor.class);
        startActivity(intent);
    }

}
