package com.example.nguyenminhhieu_android43_day5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Food_order_activity extends AppCompatActivity {

    AdapterContactBook adapterContactBook;
    TextView count_order;
    ListView lvContact;
    Button btnOrder;
    View btnshopping_cart;
    List<Contactbook> contactBookList;
    List<Contactbook> contactbookList1;
    Contactbook contactBook,contactBook1, contactBook2, contactBook3, contactBook4, contactBook5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_oder_layout);

        lvContact = findViewById(R.id.lvcontact);
        btnOrder = findViewById(R.id.btnOder);
        count_order = findViewById(R.id.count_order);
        btnshopping_cart = findViewById(R.id.shopping_cart);
        contactBookList = new ArrayList<>();

        contactBook1 = new Contactbook("Gà rán");
        contactBook2 = new Contactbook("Gà luộc");
        contactBook3 = new Contactbook("Gà sào");
        contactBook4 = new Contactbook("Gà nướng");
        contactBook5 = new Contactbook("Gà chiên giòn");

        contactBookList.add(contactBook1);
        contactBookList.add(contactBook2);
        contactBookList.add(contactBook3);
        contactBookList.add(contactBook4);
        contactBookList.add(contactBook5);

        adapterContactBook = new AdapterContactBook(contactBookList);
        lvContact.setAdapter(adapterContactBook);

        btnshopping_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getBaseContext(), Your_Order_activity.class);
                startActivityForResult(intent1, 115);

            }
        });

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Contactbook contactbookcl =contactBookList.get(position);
                Toast.makeText(getBaseContext(), contactbookcl.getTenDoAn(), Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getBaseContext() , Your_Order_activity.class);
                intent1.putExtra("DoAn", contactbookcl.getTenDoAn());
                count_order.setText("1");
                startActivity(intent1);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getBaseContext(), Food_order_activity.class);
                startActivityForResult(intent1, 113);
                count_order.setText("0");
                startActivity(intent1);
            }
        });
    }
}