package com.danta.sidqi.pts_genap_10rpl2_29;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    private RecyclerView rv;
    private RvAdapter adapter;
    private ArrayList<Data> datalist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        rv = (RecyclerView) findViewById(R.id.list);
        adapter = new RvAdapter(datalist);

        addData();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomePage.this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(layoutManager);






    }

    void addData() {
        datalist = new ArrayList<>();
        datalist.add(new Data("The Starry Night", "Van Gogh", 1889, R.drawable.starry));
        datalist.add(new Data("The Creation of Adam", "Michaelangelo", 1512, R.drawable.creation));
        datalist.add(new Data("The Weeping Woman", "Pablo Picasso", 1937, R.drawable.weeping));
    }

}

