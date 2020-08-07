package com.example.marketul;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracionAdmin extends AppCompatActivity {
    private Button button_Ingreso3;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configu_admin);

        button_Ingreso3 = (Button)findViewById(R.id.button_Ingreso3);
        button_Ingreso3.setOnClickListener(onClickListener);
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == button_Ingreso3)
                button_Ingreso3_OnClick();
        }
    };
    private void button_Ingreso3_OnClick(){
       // Intent intent = new Intent(packageContext: Registro.this,ConfiguracionAdmin.class);
       // startActivity(intent);
    }
}
