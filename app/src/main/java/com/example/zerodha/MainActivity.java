package com.example.zerodha;

import android.content.Intent;
import android.graphics.pdf.models.ListItem;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
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
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv1 = findViewById(R.id.imageView1);
        HorizontalScrollView hsv1 = findViewById(R.id.horizontalScrollView);
        LinearLayout ll2 = findViewById(R.id.ll2);
        ImageView iv2 = findViewById(R.id.imageView2);
        HorizontalScrollView hsv2 = findViewById(R.id.horizontalScrollView2);
        ListView lv = findViewById(R.id.listview);
        TextView txt7 = findViewById(R.id.textView7);

        String[] dummydata = new String[]{
                "Sbi Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹100",
                "Icici Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹200",
                "Bob Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹150",
                "Pnb Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹180",
                "Rnsb Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹130",
                "Hdfc Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹220",
                "Kotak Mahindra\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹250",
                "Axis Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹140",
                "Indusland Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹160",
                "Yes Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹190",
                "Uco Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹110",
                "Idbi Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹170",
                "Union Bank of India\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹210",
                "Indian Overseas Bank\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t₹125"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dummydata);
        lv.setAdapter(adapter);

        iv1.setY(-20);
        hsv1.setY(110);
        ll2.setY(230);
        txt7.setOnClickListener(v -> {
            Intent i1 = new Intent(MainActivity.this, position.class);
            startActivity(i1);
        });
    }
}