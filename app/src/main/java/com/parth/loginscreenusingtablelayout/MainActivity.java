package com.parth.loginscreenusingtablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editUsername, editpassword;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsername = findViewById(R.id.edit_username);
        editpassword = findViewById(R.id.edit_password);

        login = findViewById(R.id.button_login);


        String Username = editUsername.getText().toString();
        String Password = editpassword.getText().toString();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Username.equals("admin") && Password.equals("password")){

                    Toast.makeText(MainActivity.this, "Login Successful!!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this,NextActivity.class);
                    startActivity(intent);
                }else {

                    Toast.makeText(MainActivity.this,"Invalid Username or Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}