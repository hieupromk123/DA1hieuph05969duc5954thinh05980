package com.example.acer.da1hieuph05969duc5954thinh05980.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.acer.da1hieuph05969duc5954thinh05980.R;
import com.example.acer.da1hieuph05969duc5954thinh05980.model.Hdd;

import java.util.List;

public class HddAdapter extends RecyclerView.Adapter<HddAdapter.HddViewHolder> {
    public HddAdapter(Context mCtx, List<Hdd> hdds) {
        this.mCtx = mCtx;
        this.hdds = hdds;
    }

    private Context mCtx;
    private List<Hdd> hdds;





    @NonNull
    @Override
    public HddViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.hdd_cardview, null);
        return new HddViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HddViewHolder holder, int i) {
        Hdd product = hdds.get(i);


        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));



    }

    @Override
    public int getItemCount() {
        return hdds.size();
    }

    class HddViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public HddViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
