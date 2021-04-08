package com.danta.sidqi.pts_genap_10rpl2_29;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtemail;
    Button btnsub;
    Button btnfb;
    Button btngoogle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtemail = (EditText) findViewById(R.id.txtemail);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnfb = (Button) findViewById(R.id.btnfb);
        btngoogle = (Button) findViewById(R.id.btngoogle);
        final Intent sendString = new Intent(this, LoginPage.class);





        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtemail.getText().toString();
                sendString.putExtra("username", username);
                startActivity(sendString);
                startActivity(new Intent(MainActivity.this, LoginPage.class));

            }
        });
        btnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Succesfully login with Facebook", Toast.LENGTH_SHORT).show();
            }
        });
        btngoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Succesfully login with Google", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
