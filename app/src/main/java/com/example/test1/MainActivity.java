package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private EditText name;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.LogInButton);
        name = (EditText) findViewById(R.id.nameInput);
        password = (EditText) findViewById(R.id.passwordInput);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String myName = name.getText().toString();
                 String myPassword = password.getText().toString();

                if(!myName.equals("Ajay") || !myPassword.equals("1234"))
                     Toast.makeText(getApplicationContext(), "Incorrect Username or Password", Toast.LENGTH_SHORT).show();
                 else {
                     Toast.makeText(getApplicationContext(), "Welcome Back", Toast.LENGTH_SHORT).show();
                 }

            }
        });

    }
}