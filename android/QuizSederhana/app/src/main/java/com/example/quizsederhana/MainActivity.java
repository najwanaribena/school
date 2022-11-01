package com.example.quizsederhana;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[] kunciJawaban = {2, 3, 4, 4, 3, 4, 2, 3, 2, 1};
    private int nilai;
    private RadioGroup radioGroups[] = new RadioGroup[10];
    private int radioButtonsId[] = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = findViewById(R.id.submit);
        TextView hasil = findViewById(R.id.hasil);
        Resources res = getResources();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 10; i++) {
                    radioGroups[i] = findViewById(res.getIdentifier("rg_" + (i + 1), "id", getApplicationContext().getPackageName()));
                    for (int j = 0; j < 4; j++) {
                        radioButtonsId[j] = res.getIdentifier("r" + (i + 1) + "_" + (char)('a' + j), "id", getApplicationContext().getPackageName());
                    }
                    int checkedId = radioGroups[i].getCheckedRadioButtonId();
                    Log.d("TEST", Integer.toString(checkedId));
                    if (checkedId == radioButtonsId[kunciJawaban[i] - 1]) {
                       nilai += 10;
                    }
                }
                showNilai(nilai);
                nilai = 0;
            }
        });
    }

    public void showNilai(int nilai) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Nilai anda " + nilai);
        builder.setTitle("Hasil");
        builder.setCancelable(false);
        builder.setPositiveButton("Lihat Jawaban", (DialogInterface.OnClickListener) (dialog, which) -> {
            dialog.cancel();
        });
        builder.setNegativeButton("Ok", (DialogInterface.OnClickListener) (dialog, which) -> {
            dialog.cancel();
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}