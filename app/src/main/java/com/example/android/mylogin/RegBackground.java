package com.example.android.mylogin;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by Sreeraj M on 9/18/2016.
 */
public class RegBackground extends AsyncTask<String, Void, String> {

    Context ctx;
    AlertDialog ad;

    RegBackground(Context context) {
        ctx = context;
    }

    String msg;


    @Override
    protected String doInBackground(String... params) {
        String name = params[0];
        String pwd = params[1];
        String email = params[2];


        if (name.equals("123") && pwd.equals("123") && email.equals("123")) {
            msg = "SUCCESFULL";
        } else {
            msg = "FAILED";
        }


        return null;
    }

    @Override
    protected void onPreExecute() {
        ad = new AlertDialog.Builder(ctx).create();
        ad.setTitle("STATUS");
    }

    @Override
    protected void onPostExecute(String s) {
        ad.setMessage(msg);
        ad.show();
        Intent i = new Intent(ctx, MainActivity.class);
        ctx.startActivity(i);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}
