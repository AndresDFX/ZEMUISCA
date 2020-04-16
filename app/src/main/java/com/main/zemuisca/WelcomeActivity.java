package com.main.zemuisca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        txtUser = (TextView) findViewById(R.id.tv_user);
        String user = getIntent().getStringExtra("usuario");
        txtUser.setText("Bienvenido "+ user);


    }
}
