package com.example.marketul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AdminSolicitudVendedor extends AppCompatActivity{
    private ImageButton imageButtonMenu_Vendedores3;
    private ImageButton imageButtonMenu_Config4;
    private ImageButton imageButtonMenu_Cerrar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_solicitudvend);

        imageButtonMenu_Vendedores3 = (ImageButton) findViewById(R.id.imageButtonMenu_Vendedores3);
        imageButtonMenu_Vendedores3.setOnClickListener(onClickListener);

        imageButtonMenu_Config4 = (ImageButton) findViewById(R.id.imageButtonMenu_Config4);
        imageButtonMenu_Config4.setOnClickListener(onClickListener);

        imageButtonMenu_Cerrar4 = (ImageButton) findViewById(R.id.imageButtonMenu_Cerrar4);
        imageButtonMenu_Cerrar4.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == imageButtonMenu_Vendedores3)
                imageButtonMenu_Vendedores3_OnClick();

            if (v == imageButtonMenu_Config4)
                imageButtonMenu_Config4_OnClick();

            if (v == imageButtonMenu_Cerrar4)
                imageButtonMenu_Cerrar4_OnClick();
        }
    };
    private void imageButtonMenu_Vendedores3_OnClick() {
        Intent intent = new Intent(AdminSolicitudVendedor.this, AdminVendedores.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Config4_OnClick() {
        Intent intent = new Intent(AdminSolicitudVendedor.this, ConfiguracionAdmin.class);
        startActivity(intent);
    }
    private void imageButtonMenu_Cerrar4_OnClick() {
        Intent intent = new Intent(AdminSolicitudVendedor.this, ConfiguracionAdmin.class);
        startActivity(intent);
    }
}
