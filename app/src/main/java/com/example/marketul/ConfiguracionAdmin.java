package com.example.marketul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ConfiguracionAdmin extends AppCompatActivity {
    private Button button_ConfiguGuardar;
    private Button button_ConfiguCancelar;

    private ImageButton imageButtonMenu_Vendedores;
    private ImageButton imageButtonMenu_Config2;
    private ImageButton imageButtonMenu_Cerrar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configu_admin);

        imageButtonMenu_Vendedores = (ImageButton) findViewById(R.id.imageButtonMenu_Vendedor);
        imageButtonMenu_Vendedores.setOnClickListener(onClickListener);

        imageButtonMenu_Config2 = (ImageButton) findViewById(R.id.imageButtonMenu_Config2);
        imageButtonMenu_Config2.setOnClickListener(onClickListener);

        imageButtonMenu_Cerrar2 = (ImageButton) findViewById(R.id.imageButtonMenu_Cerrar2);
        imageButtonMenu_Cerrar2.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == imageButtonMenu_Vendedores)
                imageButtonMenu_Vendedores_OnClick();

            if (v == imageButtonMenu_Config2)
                imageButtonMenu_Config2_OnClick();

            if (v == imageButtonMenu_Cerrar2)
                imageButtonMenu_Cerrar2_OnClick();
        }
    };
    private void imageButtonMenu_Vendedores_OnClick() {
        Intent intent = new Intent(ConfiguracionAdmin.this, AdminVendedores.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Config2_OnClick() {
        Intent intent = new Intent(ConfiguracionAdmin.this, ConfiguracionAdmin.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Cerrar2_OnClick() {
        Intent intent = new Intent(ConfiguracionAdmin.this, ConfiguracionAdmin.class);
        startActivity(intent);
    }
}
