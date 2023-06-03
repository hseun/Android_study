package com.example.todolist4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BoardAdapter boardAdapter;
    private ArrayList<Board> boards;

    Button btnAdd;
    EditText editTextAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btn);
        editTextAdd = findViewById(R.id.editText);
        recyclerView = findViewById(R.id.recycler_view);
        boardAdapter = new BoardAdapter();

        recyclerView.setAdapter(boardAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        boards = new ArrayList<>();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boards.add(new Board(editTextAdd.getText().toString(), "contents"));
                boardAdapter.setBoardList(boards);
                boardAdapter.notifyDataSetChanged();
                editTextAdd.setText("");
            }
        });
    }
}