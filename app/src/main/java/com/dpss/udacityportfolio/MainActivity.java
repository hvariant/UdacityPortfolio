package com.dpss.udacityportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        Log.d("onButtonClick","Hello, button:" + view.getId());

        Context context = getApplicationContext();
        String text = "Launching ";

        switch(view.getId()){
            case R.id.button:
            {
                text += "Popular Movies";
                break;
            }
            case R.id.button2:
            {
                text += "Stock Hawk!";
                break;
            }
            case R.id.button3:
            {
                text += "XYZ Reader";
                break;
            }
            case R.id.button4:
            {
                text += "Material News";
                break;
            }
            case R.id.button5:
            {
                text += "Final Project";
                break;
            }
        }

        //show toast
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }
}