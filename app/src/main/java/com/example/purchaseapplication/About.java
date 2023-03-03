package com.example.purchaseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {
    TextView purchase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        purchase = findViewById(R.id.purchase);

        if (Checker.checkPurchase()) {
            purchase.setText(getString(R.string.pro));
        } else {
            purchase.setText(getString(R.string.purchase));
        }
    }
}