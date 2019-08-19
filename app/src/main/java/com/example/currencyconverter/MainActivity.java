package com.example.currencyconverter;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    NumberPicker possibilities1,possibilities2;
    ImageView imagebtn,imagebtn2;
    Spinner spinner,spinner1;
    EditText etext,etext1;
    MediaPlayer btnclksound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //make the app activity layout set in fullscreen mode.
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnclksound= MediaPlayer.create(this, R.raw.btnclksound);

            spinner=(Spinner)findViewById(R.id.spinner);
            spinner1=(Spinner)findViewById(R.id.spinner1);

            etext=(EditText)findViewById(R.id.editText);
            etext1=(EditText)findViewById(R.id.editText1);

            imagebtn=(ImageButton)findViewById(R.id.imageButton);
            imagebtn2=(ImageButton)findViewById(R.id.imageButton2);


        final ArrayAdapter<CharSequence> currencyTypes=ArrayAdapter.createFromResource
                (this,R.array.currencyTypes,android.R.layout.simple_list_item_1);

        spinner.setAdapter(currencyTypes);
        spinner1.setAdapter(currencyTypes);

    }


    public  void   navigate(View v)
    {
        btnclksound.start();
        String sp1Val = spinner.getSelectedItem().toString();
        String sp2Val = spinner1.getSelectedItem().toString();

        // Then compare both spinner values:

        //Indian Ruppee Conversion
        if(sp1Val.equals("Indian Rupee") && sp2Val.equals("US Dollar") || sp1Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ") && sp2Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ")) {
               if(etext!=null) {
                   double inr = Double.valueOf(etext.getText().toString());
                   double usdollar = inr / 65;
                   DecimalFormat formalVal = new DecimalFormat("##.##");
                   etext1.setText(formalVal.format(usdollar));
                   imagebtn.setImageResource(R.drawable.inr);
                   imagebtn2.setImageResource(R.drawable.usd);
               }
        }
        else if(sp1Val.equals("Indian Rupee") && sp2Val.equals("Euro") || sp1Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ") && sp2Val.equals("ਯੂਰੋ")) {
            if(etext!=null) {
                double inr = Double.valueOf(etext.getText().toString());
                double euro = inr / 77.22;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(euro));
                imagebtn.setImageResource(R.drawable.inr);
                imagebtn2.setImageResource(R.drawable.euro);
            }
        }
        else if(sp1Val.equals("Indian Rupee") && sp2Val.equals("Pound") || sp1Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ") && sp2Val.equals("ਪੌਂਡ")) {
            if(etext!=null) {
                double inr = Double.valueOf(etext.getText().toString());
                double pound = inr / 84.28;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(pound));
                imagebtn.setImageResource(R.drawable.inr);
                imagebtn2.setImageResource(R.drawable.pound);
            }
        }
        else if(sp1Val.equals("Indian Rupee") && sp2Val.equals("Canadian Dollar") || sp1Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ") && sp2Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ")) {
            if(etext!=null) {
                double inr = Double.valueOf(etext.getText().toString());
                double pound = inr / 52;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(pound));
                imagebtn.setImageResource(R.drawable.inr);
                imagebtn2.setImageResource(R.drawable.cad);
            }
        }

        //Us Dollar Conversion
        else if(sp1Val.equals("US Dollar") && sp2Val.equals("Indian Rupee") || sp1Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ") && sp2Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ")) {
            if(etext!=null) {
                double usd = Double.valueOf(etext.getText().toString());
                double inr = usd * 69;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(inr));
                imagebtn.setImageResource(R.drawable.usd);
                imagebtn2.setImageResource(R.drawable.inr);
            }
        }
        else if(sp1Val.equals("US Dollar") && sp2Val.equals("Euro") || sp1Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ") && sp2Val.equals("ਯੂਰੋ")) {
            if(etext!=null) {
                double usd = Double.valueOf(etext.getText().toString());
                double euro = usd * 0.90;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(euro));
                imagebtn.setImageResource(R.drawable.usd);
                imagebtn2.setImageResource(R.drawable.euro);
            }
        }
        else if(sp1Val.equals("US Dollar") && sp2Val.equals("Pound") || sp1Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ") && sp2Val.equals("ਪੌਂਡ")) {
            if(etext!=null) {
                double usd = Double.valueOf(etext.getText().toString());
                double pound = usd * 0.82;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(pound));
                imagebtn.setImageResource(R.drawable.usd);
                imagebtn2.setImageResource(R.drawable.pound);
            }
        }
        else if(sp1Val.equals("US Dollar") && sp2Val.equals("Canadian Dollar") || sp1Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ") && sp2Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ")) {
            if(etext!=null) {
                double usd = Double.valueOf(etext.getText().toString());
                double cad = usd * 1.32;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(cad));
                imagebtn.setImageResource(R.drawable.inr);
                imagebtn2.setImageResource(R.drawable.cad);
            }
        }

        //Euro Conversion

        else if(sp1Val.equals("Euro") && sp2Val.equals("Indian Rupee") || sp1Val.equals("ਯੂਰੋ") && sp2Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ")) {
            if(etext!=null) {
                double euro = Double.valueOf(etext.getText().toString());
                double inr = euro * 77.22;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(inr));
                imagebtn.setImageResource(R.drawable.euro);
                imagebtn2.setImageResource(R.drawable.inr);
            }
        }
        else if(sp1Val.equals("Euro") && sp2Val.equals("US Dollar") || sp1Val.equals("ਯੂਰੋ") && sp2Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ")) {
            if(etext!=null) {
                double euro = Double.valueOf(etext.getText().toString());
                double usd = euro * 1.11;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(usd));
                imagebtn.setImageResource(R.drawable.euro);
                imagebtn2.setImageResource(R.drawable.usd);
            }
        }
        else if(sp1Val.equals("Euro") && sp2Val.equals("Pound") || sp1Val.equals("ਯੂਰੋ") && sp2Val.equals("ਪੌਂਡ")) {
            if(etext!=null) {
                double euro = Double.valueOf(etext.getText().toString());
                double pound = euro * 0.92;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(pound));
                imagebtn.setImageResource(R.drawable.euro);
                imagebtn2.setImageResource(R.drawable.pound);
            }
        }
        else if(sp1Val.equals("Euro") && sp2Val.equals("Canadian Dollar") || sp1Val.equals("ਯੂਰੋ") && sp2Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ")) {
            if(etext!=null) {
                double euro = Double.valueOf(etext.getText().toString());
                double cad = euro * 1.47;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(cad));
                imagebtn.setImageResource(R.drawable.euro);
                imagebtn2.setImageResource(R.drawable.cad);
            }
        }


        //Canadian Dollar Conversion

        else if(sp1Val.equals("Canadian Dollar") && sp2Val.equals("Indian Rupee") || sp1Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ") && sp2Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ")) {
            if(etext!=null) {
                double cad = Double.valueOf(etext.getText().toString());
                double inr = cad * 52.62;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(inr));
                imagebtn.setImageResource(R.drawable.cad);
                imagebtn2.setImageResource(R.drawable.inr);
            }
        }
        else if(sp1Val.equals("Canadian Dollar") && sp2Val.equals("US Dollar") || sp1Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ") && sp2Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ")) {
            if(etext!=null) {
                double cad = Double.valueOf(etext.getText().toString());
                double usd = cad * 0.76;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(usd));
                imagebtn.setImageResource(R.drawable.cad);
                imagebtn2.setImageResource(R.drawable.usd);
            }
        }
        else if(sp1Val.equals("Canadian Dollar") && sp2Val.equals("Euro") || sp1Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ") && sp2Val.equals("ਯੂਰੋ")) {
            if(etext!=null) {
                double cad = Double.valueOf(etext.getText().toString());
                double euro = cad * 0.68;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(euro));
                imagebtn.setImageResource(R.drawable.cad);
                imagebtn2.setImageResource(R.drawable.euro);
            }
        }
        else if(sp1Val.equals("Canadian Dollar") && sp2Val.equals("Pound") || sp1Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ") && sp2Val.equals("ਪੌਂਡ")) {
            if(etext!=null) {
                double cad = Double.valueOf(etext.getText().toString());
                double pound = cad * 0.62;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(pound));
                imagebtn.setImageResource(R.drawable.cad);
                imagebtn2.setImageResource(R.drawable.pound);
            }
        }

        //PoundConversion

        else if(sp1Val.equals("Pound") && sp2Val.equals("Indian Rupee") || sp1Val.equals("ਪੌਂਡ") && sp2Val.equals("ਭਾਰਤੀ ਰੁਪਿਆ")) {
            if(etext!=null) {
                double pound = Double.valueOf(etext.getText().toString());
                double inr = pound * 84.44;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(inr));
                imagebtn.setImageResource(R.drawable.pound);
                imagebtn2.setImageResource(R.drawable.inr);
            }
        }
        else if(sp1Val.equals("Pound") && sp2Val.equals("US Dollar") || sp1Val.equals("ਪੌਂਡ") && sp2Val.equals("ਅਮਰੀਕੀ ਡਾਲਰ")) {
            if(etext!=null) {
                double pound = Double.valueOf(etext.getText().toString());
                double usd = pound * 1.21;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(usd));
                imagebtn.setImageResource(R.drawable.pound);
                imagebtn2.setImageResource(R.drawable.usd);
            }
        }
        else if(sp1Val.equals("Pound") && sp2Val.equals("Euro") || sp1Val.equals("ਪੌਂਡ") && sp2Val.equals("ਯੂਰੋ")) {
            if(etext!=null) {
                double pound = Double.valueOf(etext.getText().toString());
                double euro = pound * 1.09;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(euro));
                imagebtn.setImageResource(R.drawable.pound);
                imagebtn2.setImageResource(R.drawable.euro);
            }
        }
        else if(sp1Val.equals("Pound") && sp2Val.equals("Canadian Dollar") || sp1Val.equals("ਪੌਂਡ") && sp2Val.equals("ਕੈਨੇਡੀਅਨ ਡਾਲਰ")) {
            if(etext!=null) {
                double pound= Double.valueOf(etext.getText().toString());
                double cad = pound * 1.60;
                DecimalFormat formalVal = new DecimalFormat("##.##");
                etext1.setText(formalVal.format(cad));
                imagebtn.setImageResource(R.drawable.pound);
                imagebtn2.setImageResource(R.drawable.cad);
            }
        }

        else{
            Toast.makeText(getApplicationContext(),"Please enter number or choose valid conversion",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.aboutUs) {
            btnclksound.start();
            Intent aboutus=new Intent();
            aboutus.setClass(this,AboutUs.class);
            startActivity(aboutus);
            return true;
        }
        if (id == R.id.rateus) {
            btnclksound.start();
            Intent rateus=new Intent();
            rateus.setClass(MainActivity.this,RateUs.class);
            startActivity(rateus);
            return true;
        }
        if (id == R.id.feedback) {
            btnclksound.start();
            Intent feedback=new Intent();
            feedback.setClass(MainActivity.this,Feedback.class);
            startActivity(feedback);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
