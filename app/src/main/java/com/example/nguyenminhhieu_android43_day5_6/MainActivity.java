package com.example.nguyenminhhieu_android43_day5_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import com.example.nguyenminhhieu_android43_day5_6.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity /*implements ILongin*/{
    ActivityMainBinding binding;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = binding.etloginUserName.getText().toString();
                String pass = binding.etloginPassWord.getText().toString();

                if (userName.equals("VietNam") && pass.equals("123456")){
                    Intent intent1 = new Intent(getBaseContext(), Food_order_activity.class);
                    Toast.makeText(getBaseContext(), "Login thành công!", Toast.LENGTH_LONG).show();
                    startActivityForResult(intent1, 113);
                }
                else
                {
                    Intent intent1 = new Intent(getBaseContext(), MainActivity.class);
                    Toast.makeText(getBaseContext(), "Login không thành công!", Toast.LENGTH_LONG).show();
                    startActivityForResult(intent1, 116);
                }


            }
        });


    }


//    @Override
//    public void onLoginsucsetfull(String mess) {
//        Toast.makeText(getBaseContext(), mess, Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    public void onLoginErro(String mess) {
//        Toast.makeText(getBaseContext(), mess, Toast.LENGTH_LONG).show();
//    }
}