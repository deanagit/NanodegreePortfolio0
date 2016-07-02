package com.example.dlg.myportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BasicToast(View v){
        Context context = getApplicationContext();
        CharSequence text="This application is coming soon!";
        int duration= Toast.LENGTH_LONG;
        Toast toast=Toast.makeText(context,text,duration);
        toast.show();
    }

}
