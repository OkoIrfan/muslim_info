package com.okoirfan.user.sholatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.okoirfan.user.sholatapp.JadwalSholat.MainActivity;
import com.okoirfan.user.sholatapp.ProdukHalal.ProdukHalal;

public class MenuUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        findViewById(R.id.JadwalSholat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,MainActivity.class));
            }
        });
        findViewById(R.id.ProdukHalal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,ProdukHalal.class));
            }
        });
    }
}
