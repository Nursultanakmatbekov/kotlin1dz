package com.example.strim4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class RecyclerFragment extends Fragment implements OnItemClickListener {

    private final OnePieceRepository repository = new OnePieceRepository();
    private final OnePieceAdapter adapter = new OnePieceAdapter(this);
    private RecyclerView rvListOfName;
    private FloatingActionButton buttonAdd;
    private EditText edUrl, edName, edAge;
    private OnePieceModel model;
    private List<OnePieceModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvListOfName = view.findViewById(R.id.rv_list_of_name);
        buttonAdd = view.findViewById(R.id.btn_add);
        edUrl = view.findViewById(R.id.ed_url);
        edName = view.findViewById(R.id.ed_name);
        edAge = view.findViewById(R.id.ed_age);
        initialize();
        setUpListeners();
        adapter.setData(repository.getListOfCharacters());
        onAdd();
        list = repository.getListOfCharacters();
     }

    private void initialize() {
        rvListOfName.setAdapter(adapter);
    }

    @Override
    public void onClick(OnePieceModel model) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("name", model);
        getParentFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, DetailFragment.class, bundle)
                .addToBackStack("RecyclerFragment")
                .commit();
    }

    private void setUpListeners() {
        buttonAdd.setOnClickListener((View view) -> {
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new ThirdFragment())
                        .addToBackStack("RecyclerFragment")
                        .commit();
        });
    }
    
    private void onAdd() {
        getParentFragmentManager().setFragmentResultListener("bundle", getViewLifecycleOwner(), new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                if (requestKey.equals("backStack")) {
                    model = (OnePieceModel) result.getSerializable("component");
                    list.add(model);
                    adapter.setData(list);

                }
            }
        });
    }
}

