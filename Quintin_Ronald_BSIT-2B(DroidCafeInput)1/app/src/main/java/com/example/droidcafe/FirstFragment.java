package com.example.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.droidcafe.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.donut.setOnClickListener(v -> ((MainActivity) requireActivity()).showDonutOrder(v));
        binding.iceCream.setOnClickListener(v -> ((MainActivity) requireActivity()).showIceCreamOrder(v));
        binding.froyo.setOnClickListener(v -> ((MainActivity) requireActivity()).showFroyoOrder(v));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}