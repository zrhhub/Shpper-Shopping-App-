package com.example.myapplication.Adapet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.Clothing;
import com.example.myapplication.R;

import java.util.List;

public class ClothingAdapter extends RecyclerView.Adapter<ClothingAdapter.ClothingViewHolder> {

    private List<Clothing> clothingList;

    public ClothingAdapter(List<Clothing> clothingList){
        this.clothingList = clothingList;
    }

    @NonNull
    @Override
    public ClothingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.clothing_layout, parent, false);
        return new ClothingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClothingViewHolder holder, int position) {
        holder.offer.setText(clothingList.get(position).getOffer());
        holder.mimageView.setImageResource(clothingList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return clothingList.size();
    }

    public class ClothingViewHolder extends RecyclerView.ViewHolder{

        private TextView offer;
        private ImageView mimageView;
        public ClothingViewHolder(@NonNull View itemView) {
            super(itemView);

            offer = itemView.findViewById(R.id.clothing_offer_tv);
            mimageView = itemView.findViewById(R.id.clothing_Img);
        }
    }
}
