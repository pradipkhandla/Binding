package com.example.bind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bind.ViewBinding.DataBinding;
import com.example.bind.ViewBinding.ViewBinding;

public class MainActivity extends AppCompatActivity {
    Button btn_viewBinding,btn_dataBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_viewBinding = findViewById(R.id.btn_viewBinding);
        btn_dataBinding = findViewById(R.id.btn_dataBinding);

        btn_viewBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ViewBinding.class);
                startActivity(intent);
            }
        });

        btn_dataBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DataBinding.class);
                startActivity(intent);
            }
        });

    }
}