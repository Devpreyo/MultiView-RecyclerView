package com.example.multiviewrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WelcomeViewHolder extends RecyclerView.ViewHolder {
    public TextView tvWelcome, tvWhat;

    public WelcomeViewHolder(@NonNull View itemView) {
        super(itemView);

        tvWelcome = itemView.findViewById(R.id.tvWelcome);
        tvWhat = itemView.findViewById(R.id.tvWhat);
    }
}
