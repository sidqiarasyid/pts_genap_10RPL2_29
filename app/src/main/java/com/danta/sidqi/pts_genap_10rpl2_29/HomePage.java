package com.danta.sidqi.pts_genap_10rpl2_29;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;


import java.io.ByteArrayOutputStream;
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
        adapter = new RvAdapter(datalist, new RvAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Intent pass = new Intent(getApplicationContext(), Info.class);
                Data myData = datalist.get(position);
                pass.putExtra("title", myData.getTtl());
                pass.putExtra("artist", myData.getArtist());
                pass.putExtra("info", myData.getInfo());
                pass.putExtra("update", myData.getUpdate());
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), myData.getImgurl());
                ByteArrayOutputStream bs = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG,100, bs);
                pass.putExtra("img", bs.toByteArray());

                startActivity(pass);

            }
        });

        addData();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(HomePage.this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(layoutManager);






    }

    void addData() {
        datalist = new ArrayList<>();
        datalist.add(new Data("The Starry Night", "Van Gogh", "The Starry Night is an oil on canvas painting by Dutch Post-Impressionist painter Vincent van Gogh. Painted in June 1889, it depicts the view from the east-facing window of his asylum room at Saint-Rémy-de-Provence, just before sunrise, with the addition of an imaginary village. It has been in the permanent collection of the Museum of Modern Art in New York City since 1941, acquired through the Lillie P. Bliss Bequest. Widely regarded as Van Gogh's magnum opus,The Starry Night is one of the most recognized paintings in Western art.",  1889, R.drawable.starry));
        datalist.add(new Data("The Creation of Adam", "Michaelangelo", "The Creation of Adam is a fresco painting by Italian artist Michelangelo, which forms part of the Sistine Chapel's ceiling, painted c. 1508–1512. It illustrates the Biblical creation narrative from the Book of Genesis in which God gives life to Adam, the first man. The fresco is part of a complex iconographic scheme and is chronologically the fourth in the series of panels depicting episodes from Genesis.\n" +
                "The painting has been reproduced in countless imitations and parodies.\n" +
                "Michelangelo's Creation of Adam is one of the most replicated religious paintings of all time.\n",1512, R.drawable.creation));
        datalist.add(new Data("The Weeping Woman", "Pablo Picasso", "The Weeping Woman is an oil on canvas painting by Pablo Picasso, which he created in France in 1937. The painting depicts Dora Maar, Picasso's mistress and muse. The Weeping Woman was created at the end of a series of paintings that Picasso produced in response to the bombing of Guernica in the Spanish Civil War and is closely associated with the iconography in his painting Guernica. Picasso was intrigued with the subject of the weeping woman, and revisited the theme numerous times that year.",1937, R.drawable.weeping));
    }

}

