package com.example.iterator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void whileLoop() {
        int x = 10;

        while (x < 20) {
            System.out.println("Value of x: " + x);
            x++;
        }
    }

    public void doWhileLoop() {
        int x = 10;

        do {
            System.out.println("The alue of x is: " + x);
            x++;
        } while (x < 20);
    }
}