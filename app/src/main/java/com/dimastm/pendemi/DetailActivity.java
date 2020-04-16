package com.dimastm.pendemi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    public static String NAMAP = "namap";
    public static String DETAIL = "detail";
    public static String TAHUN = "tahun";
    public static String TOTAL = "total";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(getIntent().getStringExtra(NAMAP));
        }

        TextView namap = findViewById(R.id.tv_namap);
        TextView total = findViewById(R.id.tv_total);
        TextView tahun = findViewById(R.id.tv_tahun);
        TextView detail = findViewById(R.id.tv_detail);
        ImageView foto = findViewById(R.id.img_item_photo);


        Glide.with(this)
                .load(getIntent().getIntExtra("value",0))
                .into(foto);
        namap.setText(getIntent().getStringExtra(NAMAP));
        detail.setText(getIntent().getStringExtra(DETAIL));
        total.setText(getIntent().getStringExtra(TOTAL));
        tahun.setText(getIntent().getStringExtra(TAHUN));



    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

}
