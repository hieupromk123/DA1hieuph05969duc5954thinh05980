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
import com.example.acer.da1hieuph05969duc5954thinh05980.model.Gpu;

import java.util.List;

public class GpuAdapter extends RecyclerView.Adapter<GpuAdapter.GpuViewHolder> {
    private Context mCtx;
    private List<Gpu> gpus;

    public GpuAdapter(Context mCtx, List<Gpu> gpus) {
        this.mCtx = mCtx;
        this.gpus = gpus;
    }



    @NonNull
    @Override
    public GpuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.gpu_cardview, null);
        return new GpuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GpuViewHolder holder, int i) {
        Gpu product = gpus.get(i);


        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.textViewPrice.setText(String.valueOf(product.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));



    }

    @Override
    public int getItemCount() {
        return gpus.size();
    }

    class GpuViewHolder extends RecyclerView.ViewHolder{
        TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
        ImageView imageView;

        public GpuViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
