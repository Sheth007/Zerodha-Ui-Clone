package com.example.zerodha;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class position extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position);
        ImageView iv = findViewById(R.id.backbutton);
        TextView txtv = findViewById(R.id.backbuttontext);

        iv.setOnClickListener(v -> {
            Intent re = new Intent(position.this, MainActivity.class);
            startActivity(re);
        });

        txtv.setOnClickListener(v -> {
            Intent re = new Intent(position.this, MainActivity.class);
            startActivity(re);
        });
    }
}