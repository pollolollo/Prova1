package com.example.portatilelenovo.prova1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("Hello world");
        int a = 0;
        for(int i=0; i < 4; i++)
             a++;
        System.out.println(a);

        //altre righe di non codice
    }

}
