package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView username =(TextView) findViewById(R.id.username);
        TextView Password = (TextView) findViewById(R.id.password);
        Button loginbtn = (MaterialButton) findViewById(R.id.loginbtn);
        //admmin as admin
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && Password.getText().toString().equals("123456789")){
                    Toast.makeText(MainActivity.this,"LOGIN SuccessFull", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"LOGIN Faled", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}