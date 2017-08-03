package com.bignerdranch.android.link;

import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CY on 2017. 8. 3..
 */

public class TabFragmentLinks extends Fragment {

    RecyclerView rvMyLink;
    MyLinkAdapter adapter;
    Paint p = new Paint();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_fragment_links, container, false);
        rvMyLink = (RecyclerView) view.findViewById(R.id.rv_my_link);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rvMyLink.setLayoutManager(lm);

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

        rvMyLink.setAdapter(new MyLinkAdapter(getActivity(), items, R.layout.tab_fragment_links));


        return view;
    }
}