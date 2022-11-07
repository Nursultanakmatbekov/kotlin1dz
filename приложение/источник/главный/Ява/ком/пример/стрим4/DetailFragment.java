package com.example.strim4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class DetailFragment extends Fragment {

    private ImageView ivFullScreen;
    private OnePieceModel model;
    private TextView tvName, tvAge;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivFullScreen = view.findViewById(R.id.iv_fullscreen);
        tvName = view.findViewById(R.id.tv_name);
        tvAge = view.findViewById(R.id.tv_age);
        getData();
    }

    private void getData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            model = (OnePieceModel) arguments.getSerializable("name");
            Glide.with(ivFullScreen.getContext()).load(model.getImageUrl()).into(ivFullScreen);
            tvName.setText(model.getName());
            tvAge.setText(String.valueOf(model.getAge()));
        }
    }
}
