package com.danta.sidqi.pts_genap_10rpl2_29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    TextView txtmail;
    EditText txtpass;
    Button btnface;
    Button btng;
    Button btnsubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        final Intent pass = getIntent();
        Bundle get = pass.getExtras();

        txtmail = (TextView) findViewById(R.id.txtemaillgnpage);
        txtpass = (EditText) findViewById(R.id.txtpass);
        btnface = (Button) findViewById(R.id.btnfblgnpage);
        btng = (Button) findViewById(R.id.btngooglelgnpage);
        btnsubmit = (Button) findViewById(R.id.btnsublgnpage);
        final String user = get.getString("username");
        txtmail.setText(user);


        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = txtpass.getText().toString();
                if (password.equalsIgnoreCase("lol")){
                    Toast.makeText(LoginPage.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginPage.this, HomePage.class));
                } else {
                    Toast.makeText(LoginPage.this, "Toast", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginPage.this, "Succesfully login with Google", Toast.LENGTH_SHORT).show();
            }
        });
        btnface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginPage.this, "Succesfully login with Facebook", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
