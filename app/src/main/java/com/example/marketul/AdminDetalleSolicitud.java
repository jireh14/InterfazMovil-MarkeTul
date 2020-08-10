package com.example.marketul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AdminDetalleSolicitud extends AppCompatActivity {
    private Button button_Cancelar;
    private Button button_Aceptar;

    private ImageButton imageButtonMenu_Vendedores5;
    private ImageButton imageButtonMenu_Config6;
    private ImageButton imageButtonMenu_Cerrar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_detallesolicitud);

        imageButtonMenu_Vendedores5 = (ImageButton) findViewById(R.id.imageButtonMenu_Vendedores5);
        imageButtonMenu_Vendedores5.setOnClickListener(onClickListener);

        imageButtonMenu_Config6 = (ImageButton) findViewById(R.id.imageButtonMenu_Config6);
        imageButtonMenu_Config6.setOnClickListener(onClickListener);

        imageButtonMenu_Cerrar6 = (ImageButton) findViewById(R.id.imageButtonMenu_Cerrar6);
        imageButtonMenu_Cerrar6.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == imageButtonMenu_Vendedores5)
                imageButtonMenu_Vendedores5_OnClick();

            if (v == imageButtonMenu_Config6)
                imageButtonMenu_Config6_OnClick();

            if (v == imageButtonMenu_Cerrar6)
                imageButtonMenu_Cerrar6_OnClick();
        }
    };
    private void imageButtonMenu_Vendedores5_OnClick() {
        Intent intent = new Intent(AdminDetalleSolicitud.this, AdminVendedores.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Config6_OnClick() {
        Intent intent = new Intent(AdminDetalleSolicitud.this, ConfiguracionAdmin.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Cerrar6_OnClick() {
        Intent intent = new Intent(AdminDetalleSolicitud.this, ConfiguracionAdmin.class);
        startActivity(intent);
    }
}
