package com.example.githubactionpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s;
        s = "Some string";
        System.out.println(s);
        //it is a comment
        //here is another commentgit
    }
}