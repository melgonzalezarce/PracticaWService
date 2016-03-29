package com.example.melissa.practicawservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FetchDataTask fetchDataTask = new FetchDataTask((TextView) findViewById(R.id.textViewJson));
        fetchDataTask.execute("Start");
    }
}
