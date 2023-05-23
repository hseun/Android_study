package com.example.todolist3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BoardAdapter extends RecyclerView.Adapter<BoardAdapter.ViewHolder> {
    private ArrayList<Board> boardList;

    @NonNull
    @Override
    public BoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BoardAdapter.ViewHolder holder, int position) {
        holder.onBind(boardList.get(position));
    }

    public void setBoardList(ArrayList<Board> list) {
        this.boardList = list;
    }
    @Override
    public int getItemCount() {
        if(boardList != null) {
            return boardList.size();
        }
        return 0;
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView contents;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.item_title);
            contents = (TextView) itemView.findViewById(R.id.item_content);
        }
        void onBind(Board item) {
            title.setText(item.getTitle());
            contents.setText(item.getContents());
        }
    }
}
