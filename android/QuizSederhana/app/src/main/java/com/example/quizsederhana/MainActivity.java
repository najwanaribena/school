package com.example.quizsederhana;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    private RadioButton[] radioButton = new RadioButton[10];
    private Resources res;
    private int skor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit);
        res = getResources();

        for (int i = 0; i < 10; i++) {
           radioButton[i] = findViewById(res.getIdentifier("r" + (i + 1), "id", getApplicationContext().getPackageName()));
        }

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    if (radioButton[i].isChecked()) {
                        skor += 10;
                    }
                }
                showSkor(skor);
                skor = 0;
            }
        });
    }

    public void showSkor(int skor) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Skor anda " + skor);
        builder.setTitle("Hasil");
        builder.setCancelable(false);
        builder.setNegativeButton("Ok", (DialogInterface.OnClickListener) (dialog, which) -> {
            dialog.cancel();
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}