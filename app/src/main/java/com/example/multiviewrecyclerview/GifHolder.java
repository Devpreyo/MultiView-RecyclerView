package com.example.multiviewrecyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import pl.droidsonroids.gif.GifImageView;

public class GifHolder extends RecyclerView.ViewHolder {
    public GifImageView gifImageView;

    public GifHolder(@NonNull View itemView) {
        super(itemView);

        gifImageView = itemView.findViewById(R.id.ivGif);
    }

    public GifImageView getGifImageView() {
        return gifImageView;
    }

    public void setGifImageView(GifImageView gifImageView) {
        this.gifImageView = gifImageView;
    }
}
