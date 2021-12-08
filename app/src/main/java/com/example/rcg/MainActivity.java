package com.example.rcg;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        changeTimeText();

        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, scanner.class));
            }
        });

        Button btn2 = (Button)findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, product_info.class));
            }
        });


    }


    public void changeTimeText(){
        Calendar cal = Calendar. getInstance();
        int Time = cal. get(Calendar. HOUR_OF_DAY);

        TextView PrimaryText = (TextView) findViewById(R.id.PrimaryText);
        if (Time >= 18) {
            Log.e("changeTimeText","Changed to Evening");
            PrimaryText.setText(getResources().getString(R.string.front_text_1_Evening));
        } else {
            Log.e("changeTimeText","Changed to Morning");
            PrimaryText.setText(getResources().getString(R.string.front_text_1_Morning));
        }
    }
}