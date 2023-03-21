package com.example.bind.ViewBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bind.databinding.ActivityViewBindingBinding;

public class ViewBinding extends AppCompatActivity {

    ActivityViewBindingBinding viewBindingBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBindingBinding = ActivityViewBindingBinding.inflate(getLayoutInflater());
        setContentView(viewBindingBinding.getRoot());

        viewBindingBinding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewBinding.this, Company_Detail.class);
                startActivity(intent);
            }
        });
    }
}