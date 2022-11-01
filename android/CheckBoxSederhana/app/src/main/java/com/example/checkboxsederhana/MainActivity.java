package com.example.checkboxsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox ayam1, ayam2, ayam3;
    private String menu1, menu2, menu3;
    private Button pesan;
    private TextView pilihan1, pilihan2, pilihan3, totalHargaText;
    private int totalHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ayam1 = findViewById(R.id.ayam1);
        ayam2 = findViewById(R.id.ayam2);
        ayam3 = findViewById(R.id.ayam3);
        pilihan1 = findViewById(R.id.menu_satu);
        pilihan2 = findViewById(R.id.menu_dua);
        pilihan3 = findViewById(R.id.menu_tiga);
        pesan = findViewById(R.id.pesan);
        totalHargaText = findViewById(R.id.total_harga);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ayam1.isChecked()) {
                    menu1 = "Kopi";
                    totalHarga += 8000;
                } else if (!ayam1.isChecked()) {
                    menu1 = " ";
                }

                if (ayam2.isChecked()) {
                    menu2 = "Indomie";
                    totalHarga += 5000;
                } else if (!ayam2.isChecked()) {
                    menu2 = " ";
                }

                if (ayam3.isChecked()) {
                    menu3 = "Teh Manis";
                    totalHarga += 3000;
                } else if (!ayam3.isChecked()) {
                    menu3 = " ";
                }

               if (!ayam1.isChecked() && !ayam1.isChecked() && !ayam3.isChecked()) {
                   Toast.makeText(MainActivity.this, "Tidak Ada Menu Makanan Yang Dipesan", Toast.LENGTH_SHORT).show();
               } else {
                   Toast.makeText(MainActivity.this, "Pesanan Terkirim", Toast.LENGTH_SHORT).show();
                   pilihan1.setText("Menu 1: " + menu1);
                   pilihan2.setText("Menu 2: " + menu2);
                   pilihan3.setText("Menu 3: " + menu3);
                   totalHargaText.setText("Total Harga: Rp " + Integer.toString(totalHarga));
                   totalHarga = 0;
               }
            }
        });
    }
}