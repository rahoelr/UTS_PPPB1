package com.example.myhotel;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username = "mike@email.com";
    String password = "abc123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtusername = findViewById(R.id.username_text);
        final EditText txtpassword = findViewById(R.id.password_text);
        Button login = findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtusername.getText().toString().equalsIgnoreCase(username)&& txtpassword.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(MainActivity.this, CariHotel.class));
                }else{
                    ShowAlert();
                }
            }

            public void ShowAlert() {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Username / Password Salah");

                // Set Alert Title
                builder.setTitle("LOGIN GAGAL !!!");

                // Set the positive button with yes name Lambda OnClickListener method is use of DialogInterface interface.
                builder.setPositiveButton("OKEY BOS", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) { dialog.dismiss(); }
                        });
                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();
                // Show the Alert Dialog box
                alertDialog.show();
            }
        });
    }

}