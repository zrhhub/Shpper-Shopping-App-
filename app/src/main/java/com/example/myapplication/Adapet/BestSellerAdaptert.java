package com.example.myapplication.Adapet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Model.BestSeller;
import com.example.myapplication.R;

import java.lang.invoke.LambdaConversionException;
import java.util.List;

public class BestSellerAdaptert extends RecyclerView.Adapter<BestSellerAdaptert.BestSellerViewHolder> {

    private List<BestSeller> BestSellerList;

    public BestSellerAdaptert(List<BestSeller> bestSellerList){
        this.BestSellerList = bestSellerList;
    }

    @NonNull
    @Override
    public BestSellerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.best_seller, parent,false);
        return new BestSellerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BestSellerViewHolder holder, int position) {
        holder.mText.setText(BestSellerList.get(position).getOffer());
        holder.mImageView.setImageResource(BestSellerList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return BestSellerList.size();
    }

    public class BestSellerViewHolder extends RecyclerView.ViewHolder {

        private TextView mText;
        private ImageView mImageView;

        public BestSellerViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.bestSeller_iv);
            mText = itemView.findViewById(R.id.bestSeller_tv);


        }
    }

}
