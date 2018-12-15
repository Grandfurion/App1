package com.yaros.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate");

        final Toast toast = Toast.makeText(getApplicationContext(),
                "You feel an evil presence watching you", Toast.LENGTH_SHORT);

        toast.setGravity(Gravity.CENTER, 0, 0);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        final TextView text2 = findViewById(R.id.text2);


        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text2.setText("Now feel much better");
            }
        };

        View.OnClickListener oclBtnToast = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        };

        button1.setOnClickListener(oclBtn);
        button2.setOnClickListener(oclBtnToast);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
