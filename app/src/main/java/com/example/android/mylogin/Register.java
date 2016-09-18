package com.example.android.mylogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Sreeraj M on 9/17/2016.
 */
public class Register extends AppCompatActivity {
    EditText username, password, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


    }

    public void onSubmit(View view) {
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText3);
        email = (EditText) findViewById(R.id.editText2);
        String uname = username.getText().toString();
        String pass = password.getText().toString();
        String em = email.getText().toString();

        if (uname.equals("") || pass.equals("") || em.equals("")) {

            Toast.makeText(this, "Enter any input", Toast.LENGTH_SHORT).show();

        } else {
            RegBackground rb = new RegBackground(this);
            rb.execute(uname, pass, em);

        }

    }
}
