package com.example.todolist;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public TextView content;

    ViewHolder(Context context, View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.item_title);
        content = itemView.findViewById(R.id.item_content);
    }
}
