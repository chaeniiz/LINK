package com.bignerdranch.android.link;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyLinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_link);

        RecyclerView rvMyLink = (RecyclerView) findViewById(R.id.rv_my_link);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvMyLink.setHasFixedSize(true);
        rvMyLink.setLayoutManager(layoutManager);

        List<MyLink> items = new ArrayList<>();
        MyLink[] item = new MyLink[5];
        item[0] = new MyLink(R.drawable.thumbnail, "title", "explanation");
        item[1] = new MyLink(R.drawable.thumbnail, "title", "explanation");
        item[2] = new MyLink(R.drawable.thumbnail, "title", "explanation");
        item[3] = new MyLink(R.drawable.thumbnail, "title", "explanation");
        item[4] = new MyLink(R.drawable.thumbnail, "title", "explanation");

        for(int i = 0; i < 5; i++) {
            items.add(item[i]);
        }

        rvMyLink.setAdapter(new MyLinkAdapter(getApplicationContext(), items, R.layout.activity_my_link));
    }
}
