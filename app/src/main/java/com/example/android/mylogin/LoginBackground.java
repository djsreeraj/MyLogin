package com.example.android.mylogin;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by Sreeraj M on 9/18/2016.
 */
public class LoginBackground extends AsyncTask<String, Void, String> {
    Context context;
    AlertDialog alertDialog;
    String msg;

    LoginBackground(Context ctx) {
        context = ctx;
    }

    @Override
    protected void onPreExecute() {

        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Login Status");

    }

    @Override
    protected String doInBackground(String... params) {

        String username = params[0];
        String password = params[1];

        if (username.equals("123") && password.equals("123")) {
            msg = "Login Successfull";
        } else {
            msg = "Login Failed";
        }

        return null;


    }



    @Override
    protected void onPostExecute(String s) {
        // super.onPostExecute(msg);

        alertDialog.setMessage(msg);
        alertDialog.show();

        if (msg.equals("Login Successfull")) {

            Intent intent = new Intent(context, Login.class);
            context.startActivity(intent);
        }
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
