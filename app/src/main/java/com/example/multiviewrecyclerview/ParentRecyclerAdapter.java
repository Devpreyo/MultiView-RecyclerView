package com.example.multiviewrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ParentRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context mContext;
    LayoutInflater mInflater;
    ArrayList<Object> items = new ArrayList<>();

    private final int welcome = 0, gifLoad = 1;


    public ParentRecyclerAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);


        items.add(new WelcomeView());
        items.add(new GifLoader());
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;

        RecyclerView.ViewHolder viewHolder;

//        View view1 = mInflater.inflate(R.layout.welcome_view, parent, false);
//        viewHolder = new WelcomeViewHolder(view1);

        switch (viewType) {
            case welcome:
                View view1 = mInflater.inflate(R.layout.welcome_view, parent, false);
                viewHolder = new WelcomeViewHolder(view1);
                break;
            case gifLoad:
                View view2 = mInflater.inflate(R.layout.gif_video_view, parent, false);
                viewHolder = new GifHolder(view2);
            default:
                throw new IllegalStateException("Unexpected value: " + viewType);
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        switch (holder.getItemViewType()) {
//            case welcome:
//                RecyclerView.ViewHolder vh1 = holder;
//                configureViewHolder1(vh1, position);
//                break;
//            case gifLoad:
//                GifLoader gifLoader = new GifLoader();
//                Picasso.get().load(gifLoader.getImgUrl()).into(holder.itemView.findViewWithTag());
//                RecyclerView.ViewHolder vh2 = holder;
//                configureViewHolder2(vh2, position);
//                break;
//        }
    }

//    private void configureViewHolder2(RecyclerView.ViewHolder vh2, int position) {
//        vh2.itemView.findViewById(R.id.ivGif).
//    }
//
//
//    private void configureViewHolder1(RecyclerView.ViewHolder vh1, int position) {
//    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
//        return super.getItemViewType(position);

        if (items.get(position) instanceof WelcomeView) {
            return welcome;
        } else if (items.get(position) instanceof GifLoader) {
            return gifLoad;
        }
        return -1;
    }
}
