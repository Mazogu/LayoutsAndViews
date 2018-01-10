package com.example.micha.viewsandlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstText;
    private TextView secondText;
    private Button doBtn;
    private Button elseBthn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
    }

    private void bindViews() {
        firstText = findViewById(R.id.firstText);
        secondText = findViewById(R.id.secondText);
        doBtn = findViewById(R.id.btnSomething);
        elseBthn = findViewById(R.id.btnElse);
    }
}
