package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] listViewTitle = {"RPL", "TKJ", "MM", "AVI", "TOI"};
    String[] listViewDesc = {
            "Rekayasa Perangkat Lunak",
            "Teknik Komputer dan Jaringan",
            "Multimedia",
            "Audio Video",
            "Teknik Otomasi Industri"
    };
    int[] listViewImage = {
            R.drawable.smk4,
            R.drawable.smk4,
            R.drawable.smk4,
            R.drawable.smk4,
            R.drawable.smk4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 5; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("title", listViewTitle[i]);
            hm.put("desc", listViewDesc[i]);
            hm.put("image", Integer.toString(listViewImage[i]));
            list.add(hm);
        }

        String[] from = {"title", "desc", "image"};
        int[] to = {R.id.listview_item_title, R.id.listview_item_desc, R.id.listview_image};

        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), list, R.layout.activity_listview, from, to);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}