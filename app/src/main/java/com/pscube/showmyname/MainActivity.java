package com.pscube.showmyname;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  int increasedNumber =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increase(View view) {

        increasedNumber +=150;

        TextView textView = findViewById(R.id.textView);
        textView.setText(String.valueOf(increasedNumber));
        Log.d("tag1", "increase: working ... increasing by 100");

        if (increasedNumber%100==50){
            textView.setTextColor(getResources().getColor(R.color.blue));

        }
        else
        {          textView.setTextColor(getResources().getColor(R.color.pink));}






//
//        switch (increasedNumber){
//            case 1000:
//                textView.setTextColor(getResources().getColor(R.color.yellow));
//                break;
//            case 1500:
//                textView.setTextColor(getResources().getColor(R.color.pink));
//                break;
//            default:
//                  textView.setTextColor(getResources().getColor(R.color.blue));
//
//
//
//        }
        }




}

