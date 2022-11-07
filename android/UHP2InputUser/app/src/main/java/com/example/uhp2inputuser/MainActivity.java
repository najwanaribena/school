package com.example.uhp2inputuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText bilangan1, bilangan2, hasil;
    private int b1, b2, b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bilangan1 = findViewById(R.id.bilangan1);
        bilangan2 = findViewById(R.id.bilangan2);
        hasil = findViewById(R.id.hasil);

        bilangan1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                b1 = (s == null) ? 0 : Integer.parseInt(s.toString());
                b3 = b1 + b2;
                hasil.setText(Integer.toString(b3));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        bilangan2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                b2 = (s == null) ? 0 : Integer.parseInt(s.toString());
                b3 = b1 + b2;
                hasil.setText(Integer.toString(b3));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}