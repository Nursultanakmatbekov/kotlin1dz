package com.example.strim4;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class OnePieceAdapter extends RecyclerView.Adapter<OnePieceAdapter.CharacterViewHolder> implements View.OnClickListener {

    private List<OnePieceModel> listCharacter;
    private OnItemClickListener onItemClickListener;

    public OnePieceAdapter(RecyclerFragment onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setData(List<OnePieceModel> listCharacter) {
        this.listCharacter = listCharacter;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CharacterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        holder.itemView.setOnClickListener(this);
        holder.onBind(listCharacter.get(position));
    }

    @Override
    public int getItemCount() {
        return listCharacter.size();
    }

    @Override
    public void onClick(View view) {
        onItemClickListener.onClick((OnePieceModel) view.getTag());
    }

    public class CharacterViewHolder extends RecyclerView.ViewHolder {

        private MaterialCardView mainContainer;
        private ImageView ivImage;
        private TextView tvName;
        private TextView tvAge;

        public CharacterViewHolder(@NonNull View view) {
            super(view);
            ivImage = view.findViewById(R.id.iv_image);
            tvName = view.findViewById(R.id.tv_name);
            tvAge = view.findViewById(R.id.tv_age);
            mainContainer = view.findViewById(R.id.main_container);
        }

        public void onBind(OnePieceModel character) {
            Glide.with(ivImage.getContext()).load(character.getImageUrl()).into(ivImage);
            tvName.setText(character.getName());
            tvAge.setText(String.valueOf(character.getAge()));
            mainContainer.setCardBackgroundColor(Color.parseColor(character.getColor()));
            itemView.setTag(character);
        }
    }
}


