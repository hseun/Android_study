package com.example.todolist3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private BoardAdapter mAdapter;
    private ArrayList<Board> mBoard;

    Button btnAdd;
    EditText editTextAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = (Button) findViewById(R.id.btn);
        editTextAdd = (EditText) findViewById(R.id.editText);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new BoardAdapter();

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        mBoard = new ArrayList<>();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBoard.add(new Board("title", editTextAdd.getText()));
                mAdapter.setBoardList(mBoard);
                mAdapter.notifyDataSetChanged();
                editTextAdd.setText("");
            }
        });
    }
}