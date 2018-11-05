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
import com.example.acer.da1hieuph05969duc5954thinh05980.model.Ssd;

import java.util.List;

public class SsdAdapter extends RecyclerView.Adapter<SsdAdapter.SsdViewHolder> {


    private Context mCtx;
    private List<Ssd> ssds;

    public SsdAdapter(Context mCtx, List<Ssd> ssds) {
        this.mCtx = mCtx;
        this.ssds = ssds;
    }





    @NonNull
    @Override
    public SsdViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.ssd_cardview, null);
        return new SsdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SsdViewHolder holder, int i) {
        Ssd product = ssds.get(i);


        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));



    }

    @Override
    public int getItemCount() {
        return ssds.size();
    }

    class SsdViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public SsdViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
