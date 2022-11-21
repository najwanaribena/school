package com.damel.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    private String[] SubjectValues;
    private Context context;
    private static ClickListener clickListener;

    AdapterRecyclerView(Context context1, String[] SubjectValues1) {
        SubjectValues = SubjectValues1;
        context = context1;
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public LinearLayout linearLayout;
        public TextView textView;
        ViewHolder(View v) {
            super(v);
            textView = v.findViewById(R.id.text_item);
            linearLayout = v.findViewById(R.id.list_item);
            linearLayout.setOnClickListener((View.OnClickListener) this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(), v);
        }
    }

    public void setOnItemClickListener(ClickListener clickListener) {
        AdapterRecyclerView.clickListener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        holder.textView.setText(SubjectValues[position]);
    }

    @Override
    public int getItemCount() {
        return SubjectValues.length;
    }
}
