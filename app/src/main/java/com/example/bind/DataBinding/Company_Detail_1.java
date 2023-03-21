package com.example.bind.DataBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bind.R;
import com.example.bind.ViewBinding.DataBinding;
import com.example.bind.databinding.ActivityCompanyDetail1Binding;

public class Company_Detail_1 extends AppCompatActivity {


    private CompanyDetailData companyDetailData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_company_detail1);
        ActivityCompanyDetail1Binding companyDetail1Binding = DataBindingUtil.setContentView(this,R.layout.activity_company_detail1);

        companyDetail1Binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Company_Detail_1.this,Personal_Detail_2.class);
                startActivity(intent);
            }
        });
    }
}