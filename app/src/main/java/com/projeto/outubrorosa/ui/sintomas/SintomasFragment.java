package com.projeto.outubrorosa.ui.sintomas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.projeto.outubrorosa.databinding.FragmentSintomasBinding;

public class SintomasFragment extends Fragment {

    private FragmentSintomasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SintomasViewModel sintomasViewModel =
                new ViewModelProvider(this).get(SintomasViewModel.class);

        binding = FragmentSintomasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSintomas;
        sintomasViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}