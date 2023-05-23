package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.view.databinding.ActivityMainBinding;
import com.example.view.databinding.ActivitySecondBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private ActivitySecondBinding secondBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        secondBinding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        setContentView(secondBinding.getRoot());
        test();
        secondTest();
    }

    private void test() {
        mainBinding.text1.setText("No.1");
        mainBinding.text2.setText("No.2");
        mainBinding.text3.setText("No.3");
    }
    private void secondTest() {
        secondBinding.secondText.setText("second");
    }
}