package com.example.marketul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button_Registro;
    private Button button_Ingreso;
    private Button button_admin;
    private Button button_vendedor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_Registro = (Button) findViewById(R.id.button_Registro);
        button_Registro.setOnClickListener(onClickListener);

        button_Ingreso = (Button) findViewById(R.id.button_Ingreso);
        button_Ingreso.setOnClickListener(onClickListener);

        button_admin= (Button) findViewById(R.id.button_admin);
        button_admin.setOnClickListener(onClickListener);

        button_vendedor= (Button) findViewById(R.id.button_vendedor);
        button_vendedor.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == button_Registro)
                button_Registro_OnClick();

            if (v == button_Ingreso)
                button_Ingreso_OnClick();

            if (v == button_admin)
                button_Admin_OnClick();

            if (v == button_vendedor)
                button_Vendedor_OnClick();
        }
    };


    private void button_Registro_OnClick() {
        Intent intent = new Intent(MainActivity.this, Registro.class);
        startActivity(intent);
    }

    private void button_Ingreso_OnClick() {
        Intent intent = new Intent(MainActivity.this, Configuracion_Cuenta.class);
        startActivity(intent);
    }
    private void button_Admin_OnClick() {
        Intent intent = new Intent(MainActivity.this, ConfiguracionAdmin.class);
        startActivity(intent);
    }
    private void button_Vendedor_OnClick() {
        Intent intent = new Intent(MainActivity.this, ConfiguracionVendedor.class);
        startActivity(intent);
    }
}
