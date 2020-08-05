package com.example.marketul;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button button_Registro;
    private Button button_Registro2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_Registro = (Button) findViewById(R.id.button_Registro);
        button_Registro.setOnClickListener(onClickListener);

    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == button_Registro)
                button_Registro_OnClick();
        }
    };

    private void button_Registro_OnClick() {
        Intent intent = new Intent(MainActivity.this, Registro.class);
        startActivity(intent);
    }
}
