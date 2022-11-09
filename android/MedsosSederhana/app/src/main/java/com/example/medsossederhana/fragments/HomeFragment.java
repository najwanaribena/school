package com.example.medsossederhana.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.medsossederhana.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeFragment extends Fragment {

    String[] listViewTitle = {
            "Pizza Keju",
            "Big Mac Burger",
            "Es Milo",
            "Pizza Keju",
            "Pizza Keju"
    };

    String[] listViewDesc = {
            "Domino Pizza",
            "Mcdonald",
            "Milo Indonesia",
            "Domino Pizza",
            "Domino Pizza",
    };

    String[] listViewPrice = {
            "Rp 120.000",
            "Rp 40.000",
            "Rp 10.000",
            "Rp 120.000",
            "Rp 120.000",
    };

    int[] listViewImage = {
            R.drawable.pizzalistview,
            R.drawable.burger,
            R.drawable.milo,
            R.drawable.pizzalistview,
            R.drawable.pizzalistview,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 5; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listViewTitle[i]);
            hm.put("listview_desc", listViewDesc[i]);
            hm.put("listview_image", Integer.toString(listViewImage[i]));
            hm.put("listview_price", listViewPrice[i]);
            list.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_desc", "listview_price"};
        int[] to = {R.id.listview_image, R.id.listview_title, R.id.listview_desc, R.id.listview_price};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity().getBaseContext(), list, R.layout.listview, from, to);
        ListView androidListView = view.findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);

        return view;
    }
}