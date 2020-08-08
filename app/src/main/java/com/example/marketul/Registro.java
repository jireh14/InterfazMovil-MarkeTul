package com.example.marketul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {
    private Button button_Registro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        button_Registro2 = (Button) findViewById(R.id.button_Registro2);
        button_Registro2.setOnClickListener(onClickListener);
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == button_Registro2)
                button_Registro2_OnClick();
        }
    };

    private void button_Registro2_OnClick() {
        Intent intent = new Intent(Registro.this, Categorias.class);
        startActivity(intent);
    }
}
