package com.example.nguyenminhhieu_android43_day5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class Your_Order_activity extends AppCompatActivity {
    TextView tvDoAn;
    View btnBack_Order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_oder_view);

        tvDoAn = findViewById(R.id.tvYourOrder);
        btnBack_Order = findViewById(R.id.back_order);
        Intent intent = getIntent();

        String tenDoAn = intent.getStringExtra("DoAn");

        tvDoAn.setText(tenDoAn);

        btnBack_Order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getBaseContext(), Food_order_activity.class);
                startActivityForResult(intent1, 113);
            }
        });
    }


}