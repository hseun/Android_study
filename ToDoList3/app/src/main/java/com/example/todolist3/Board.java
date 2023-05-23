package com.example.todolist3;

import android.text.Editable;

public class Board {
    String title;
    Editable contents;

    public Board(String title, Editable contents) {
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Editable getContents() {
        return contents;
    }
    public void setContents(Editable contents) {
        this.contents = contents;
    }
}
