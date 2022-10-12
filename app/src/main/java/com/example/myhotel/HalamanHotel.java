package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HalamanHotel extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_hotel);

        productList = new ArrayList<>();

        final TextView cin = (TextView) findViewById(R.id.text_checkin);
        final TextView cout = (TextView) findViewById(R.id.text_checkout);
        final TextView kam = (TextView) findViewById(R.id.kamar);

        Intent intent = getIntent();
        String output1 = intent.getStringExtra("checkin");
        String output2 = intent.getStringExtra("checkout");
        String output3 = intent.getStringExtra("kamar");

        cin.setText(output1);
        cout.setText(output2);
        kam.setText(output3);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Hotel Sarila Sukoharjo",
                        "Hotel Melati di Sukoharjo",
                        4.3,
                        "Rp 1.0000.000/Malam",
                        R.drawable.hotel1));

        productList.add(
                new Product(
                        2,
                        "Hotel Kendedes Surakarta",
                        "Hotal Bagus di Sukoharjo",
                        4.8,
                        "Rp 500.000/Malam",
                        R.drawable.hotel2));

        productList.add(
                new Product(
                        3,
                        "Hotel Paragon)",
                        "Hotel Mewah di Surakarta",
                        8,
                        "543.000/Malam",
                        R.drawable.hotel3));
        productList.add(
                new Product(
                        1,
                        "Hotel Sarila Sukoharjo",
                        "Hotel Melati di Sukoharjo",
                        4.3,
                        "Rp 1.0000.000/Malam",
                        R.drawable.hotel1));

        productList.add(
                new Product(
                        2,
                        "Hotel Kendedes Surakarta",
                        "Hotal Bagus di Sukoharjo",
                        4.8,
                        "Rp 500.000/Malam",
                        R.drawable.hotel2));

        productList.add(
                new Product(
                        3,
                        "Hotel Paragon)",
                        "Hotel Mewah di Surakarta",
                        8,
                        "543.000/Malam",
                        R.drawable.hotel3));
        productList.add(
                new Product(
                        1,
                        "Hotel Sarila Sukoharjo",
                        "Hotel Melati di Sukoharjo",
                        4.3,
                        "Rp 1.0000.000/Malam",
                        R.drawable.hotel1));

        productList.add(
                new Product(
                        2,
                        "Hotel Kendedes Surakarta",
                        "Hotal Bagus di Sukoharjo",
                        4.8,
                        "Rp 500.000/Malam",
                        R.drawable.hotel2));

        productList.add(
                new Product(
                        3,
                        "Hotel Paragon)",
                        "Hotel Mewah di Surakarta",
                        8,
                        "543.000/Malam",
                        R.drawable.hotel3));
        productList.add(
                new Product(
                        1,
                        "Hotel Sarila Sukoharjo",
                        "Hotel Melati di Sukoharjo",
                        4.3,
                        "Rp 1.0000.000/Malam",
                        R.drawable.hotel1));

        productList.add(
                new Product(
                        2,
                        "Hotel Kendedes Surakarta",
                        "Hotal Bagus di Sukoharjo",
                        4.8,
                        "Rp 500.000/Malam",
                        R.drawable.hotel2));

        productList.add(
                new Product(
                        3,
                        "Hotel Paragon)",
                        "Hotel Mewah di Surakarta",
                        8,
                        "543.000/Malam",
                        R.drawable.hotel3));
        productList.add(
                new Product(
                        1,
                        "Hotel Sarila Sukoharjo",
                        "Hotel Melati di Sukoharjo",
                        4.3,
                        "Rp 1.0000.000/Malam",
                        R.drawable.hotel1));

        productList.add(
                new Product(
                        2,
                        "Hotel Kendedes Surakarta",
                        "Hotal Bagus di Sukoharjo",
                        4.8,
                        "Rp 500.000/Malam",
                        R.drawable.hotel2));

        productList.add(
                new Product(
                        3,
                        "Hotel Paragon)",
                        "Hotel Mewah di Surakarta",
                        8,
                        "543.000/Malam",
                        R.drawable.hotel3));


        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);


    }
}