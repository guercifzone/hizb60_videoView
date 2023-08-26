package com.example.hizb60_video_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.hizb60_video_view.*;
import com.example.hizb60_video_view.koraa.layout.Abdrahman_Naboulsi_Activity;
import com.example.hizb60_video_view.koraa.layout.Kiraa_jamaaia_Activity;
import com.example.hizb60_video_view.koraa.layout.Laayoun_Alkoushi_Activity;
import com.example.hizb60_video_view.koraa.layout.Omar_kzabriActivity;

public class MainActivity extends AppCompatActivity {
private ImageButton abdrahman_naboulsi ,kiraa_jamaaia,laayoun_alkoushi,omar_kzabri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
abdrahman_naboulsi = findViewById(R.id.abdrahim_naboulsi);
kiraa_jamaaia = findViewById(R.id.kiraa_jmaaia);
laayoun_alkoushi = findViewById(R.id.laayoun_elkoushi);
omar_kzabri = findViewById(R.id.omar_lkzabri);

abdrahman_naboulsi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this , Abdrahman_Naboulsi_Activity.class));
    }
});
kiraa_jamaaia.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this , Kiraa_jamaaia_Activity.class));
    }
});
laayoun_alkoushi.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this , Laayoun_Alkoushi_Activity.class));
    }
});
omar_kzabri.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        startActivity(new Intent(MainActivity.this , Omar_kzabriActivity.class));
    }
});
    }
}