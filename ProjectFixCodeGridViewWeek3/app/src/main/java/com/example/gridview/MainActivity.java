package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.gridview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String[] item = {"Cáp chuyển từ Cổng \n" +
                "USB sang PS2...", "Cáp chuyển từ Cổng \n" +
                "USB sang PS2...", "Cáp chuyển từ Cổng \n" +
                "USB sang PS2...", "Cáp chuyển từ Cổng \n" +
                "USB sang PS2...", "Cáp chuyển từ Cổng \n" +
                "USB sang PS2...", "Cáp chuyển từ Cổng \n" +
                "USB sang PS2..."};
        int[] itemImages = {R.drawable.daucam_1, R.drawable.carbusbtops2_1, R.drawable.dauchuyendoi_1, R.drawable.dauchuyendoipsps2_1, R.drawable.daynguon_1,
        R.drawable.giacchuyen_1};

        GridAdapter gridAdapter = new GridAdapter(MainActivity.this,item,itemImages);
        binding.gridView.setAdapter(gridAdapter);


        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,"You Clicked on "+ item[position],Toast.LENGTH_SHORT).show();

            }
        });

    }
}