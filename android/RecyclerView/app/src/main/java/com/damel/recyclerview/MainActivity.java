package com.damel.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    AdapterRecyclerView recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerViewLayoutManager;
    String[] subjects = {
            "Facebook", "Twitter", "Instagram", "SnapChat",
            "WhatsApp", "LINE", "KakaoTalk", "Telegram", "Messenger",
            "YouTube", "TikTok", "Vine", "Vimeo",
            "Figma", "Adobe XD", "Sketch", "Framer",
            "Android", "IOS", "Windows",
            "Opera", "Mozilla", "Safari", "Edge",
            "Bitcoin", "Ethereum",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();
        recyclerView = findViewById(R.id.recycler_view);
        recyclerViewLayoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter = new AdapterRecyclerView(context, subjects);
        recyclerViewAdapter.setOnItemClickListener(new AdapterRecyclerView.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Toast.makeText(context, subjects[position], Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(recyclerViewAdapter);
    }

}