package com.example.marketul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Catalogo extends AppCompatActivity {

    private Button button_Telefonia;
    private Button button_Computadoras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        button_Telefonia = (Button) findViewById(R.id.button_Telefonia);
        button_Telefonia.setOnClickListener(onClickListener);

        button_Computadoras = (Button) findViewById(R.id.button_Computadoras);
        button_Computadoras.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == button_Telefonia)
                button_Telefonia_OnClick();

            if (v == button_Computadoras)
                button_Computadoras_OnClick();
        }
        };
    private void button_Telefonia_OnClick() {
        Intent intent = new Intent(com.example.marketul.Catalogo.this, Telefonia.class);
        startActivity(intent);
    }

    private void button_Computadoras_OnClick() {
        Intent intent = new Intent(com.example.marketul.Catalogo.this, Forma_Pago.class);
        startActivity(intent);
    }
}
