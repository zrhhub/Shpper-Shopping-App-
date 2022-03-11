package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Adapet.BestSellerAdaptert;
import com.example.myapplication.Adapet.ClothingAdapter;
import com.example.myapplication.Adapet.OfferAdapter;
import com.example.myapplication.Model.BestSeller;
import com.example.myapplication.Model.Clothing;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView offerRecyclerView;
    private RecyclerView bestSeller2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //offer RecyclerView
        offerRecyclerView = findViewById(R.id.offerREcyclerView);
        offerRecyclerView.setHasFixedSize(true);
        offerRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.offer);
        imageList.add(R.drawable.deals);
        imageList.add(R.drawable.sale);

        OfferAdapter offerAdapter = new OfferAdapter(imageList);
        offerRecyclerView.setAdapter(offerAdapter);


        //Best RecyclerView
        RecyclerView bestSellerRecyclerView = findViewById(R.id.bestSellerRecyclerView);
        bestSellerRecyclerView.setHasFixedSize(true);
        bestSellerRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        List<BestSeller> bestSellerList = new ArrayList<>();
        bestSellerList.add(new BestSeller(R.drawable.sunglasess, "Upto 40% off"));
        bestSellerList.add(new BestSeller(R.drawable.ladeishirts, "Upto 60% off"));
        bestSellerList.add(new BestSeller(R.drawable.shirts, "Upto 40% off"));

        BestSellerAdaptert bestSellerAdaptert = new BestSellerAdaptert(bestSellerList);
        bestSellerRecyclerView.setAdapter(bestSellerAdaptert);


        //clothing Recyclerview
        RecyclerView clockThingsRecyclerView = findViewById(R.id.clockThingsRecyclerView);
        clockThingsRecyclerView.setHasFixedSize(true);
        clockThingsRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        List<Clothing> clothingList = new ArrayList<>();
        clothingList.add(new Clothing(R.drawable.men, "Upto 44% off"));
        clothingList.add(new Clothing(R.drawable.shoes, "Upto 20% off"));
        clothingList.add(new Clothing(R.drawable.bags, "Upto 66% off"));

        ClothingAdapter clothingAdapter = new ClothingAdapter(clothingList);
        clockThingsRecyclerView.setAdapter(clothingAdapter);


        bestSeller2 = findViewById(R.id.bestSeller2);
        bestSeller2.setHasFixedSize(true);
        bestSeller2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));

        bestSeller2.setAdapter(bestSellerAdaptert);

    }
}