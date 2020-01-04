package com.example.gunungtertinggiind;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardGunungAdapter extends RecyclerView.Adapter<CardGunungAdapter.ListViewHolder> {
    private ArrayList<Gunung> listgunung;
    private Context context;

    public CardGunungAdapter(Context context, ArrayList<Gunung> listgunung){
        this.listgunung = listgunung;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_gunung, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Gunung gunung = listgunung.get(position);
        Glide.with(holder.itemView.getContext())
                .load(gunung.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(gunung.getName());
        holder.tvDesc.setText(gunung.getDescription());

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailgunung = new Intent(context, DetailListGunung.class);
                detailgunung.putExtra("gunung_id", gunung.getId());
                context.startActivity(detailgunung);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listgunung.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_gunung_list);
            tvName = itemView.findViewById(R.id.name_gunung_list);
            tvDesc = itemView.findViewById(R.id.desc_gunung_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
