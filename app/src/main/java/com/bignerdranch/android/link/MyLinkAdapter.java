package com.bignerdranch.android.link;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by CY on 2017. 7. 31..
 */

public class MyLinkAdapter extends RecyclerView.Adapter<MyLinkAdapter.ViewHolder> {
    Context context;
    List<MyLink> items;
    int itemLayout;
    public MyLinkAdapter(Context context, List<MyLink> items, int itemLayout) {
        this.context = context;
        this.items = items;
        this.itemLayout = itemLayout;
    }

    @Override
    public MyLinkAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_my_link, null);
        return new MyLinkAdapter.ViewHolder(v);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(MyLinkAdapter.ViewHolder holder, int position) {
        final MyLink item = items.get(position);
        Drawable drawable = context.getResources().getDrawable(item.getThumbnail());
        holder.thumbnail.setBackground(drawable);
        holder.title.setText(item.getTitle());
        holder.explanation.setText(item.getExplanation());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView explanation;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            thumbnail = (ImageView)itemView.findViewById(R.id.iv_thumbnail);
            title = (TextView)itemView.findViewById(R.id.tv_title);
            explanation = (TextView)itemView.findViewById(R.id.tv_explaination);
            cardView = (CardView) itemView.findViewById(R.id.cv_my_link);
        }
    }
}
