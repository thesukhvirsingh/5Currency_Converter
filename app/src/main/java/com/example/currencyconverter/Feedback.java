package com.example.currencyconverter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class Feedback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //make the app activity layout set in fullscreen mode.
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar();
        setTitle("Feedback");

    }
    public void sendMessage(View v)
    {
        String message=((EditText)findViewById(R.id.messagearea)).getText().toString();
        Uri destination=Uri.parse("smsto:+919781810896");
        Intent smsIntent=new Intent(Intent.ACTION_SENDTO,destination);
        smsIntent.putExtra("sms_body",message);
        message.isEmpty();
        startActivity(smsIntent);

    }
}
