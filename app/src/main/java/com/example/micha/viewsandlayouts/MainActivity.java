package com.example.micha.viewsandlayouts;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Console;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView firstText;
    private TextView secondText;
    private Button doBtn;
    private Button elseBthn;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        doBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = edit.getText().toString();
                firstText.setText(data);
                Log.d(TAG, "onClick: ");
            }
        });
    }

    private void bindViews() {
        firstText = findViewById(R.id.firstText);
        secondText = findViewById(R.id.secondText);
        doBtn = findViewById(R.id.btnSomething);
        elseBthn = findViewById(R.id.btnElse);
        edit = findViewById(R.id.edit);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onDoSomethingElse(View view) {
        Log.d(TAG, "onDoSomethingElse");
        secondText.setTextColor(getColor(R.color.colorPrimaryDark));
    }

    public void onShowWebView(View view) {

        Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
        startActivity(intent);

    }
}
