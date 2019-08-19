package com.example.currencyconverter;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RatingBar;

public class RateUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);

        //make the app activity layout set in fullscreen mode.
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().setTitle("Rate Us");
        getSupportActionBar().setSubtitle("(rate this app)");
       /*scond method
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        setTitle("Rate Us");*/

    }
    public void submit(View v)
    {
        RatingBar ratingBar=(RatingBar)findViewById(R.id.ratingbar);
        float rating=ratingBar.getRating();
        Intent ratingstatus=new Intent();
        ratingstatus.setClass(RateUs.this,RatingStatus.class);
        ratingstatus.putExtra("nbStars",rating);
        startActivity(ratingstatus);
        finish();

    }
}
