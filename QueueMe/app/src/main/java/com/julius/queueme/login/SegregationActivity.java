package com.julius.queueMe.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.julius.queueMe.merchant.QueueActivity;
import gcsenxmk.q.R;
import com.julius.queueMe.customer.Init_Cust_Profile;

public class SegregationActivity extends AppCompatActivity {

    private Button btncust, btnmerc;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segregate);

        btncust=(Button) findViewById(R.id.btnCustomer);
        btnmerc=(Button) findViewById(R.id.btnMerchant);

        btncust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile= new Intent(SegregationActivity.this, Init_Cust_Profile.class);
                startActivity(profile);

            }
        });

        btnmerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent queueactivity= new Intent(SegregationActivity.this, QueueActivity.class);
                startActivity(queueactivity);

            }

        });

    }
    }
