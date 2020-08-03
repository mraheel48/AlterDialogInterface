package com.example.alterdialoginterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity implements TestDialog.DiaLogClick {

    Button btnClick;
    TextView tvText;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnClick = findViewById(R.id.btnClick);
        tvText = findViewById(R.id.tvText);

        btnClick.setOnClickListener(v -> {

            showDialog();
        });


    }

    private void showDialog() {
        TestDialog dialog = new TestDialog();
        dialog.show(getSupportFragmentManager(), "MyTag");

    }

    @Override
    public void onclick() {
        count++;
        tvText.setText(String.valueOf(count));
    }
}