package com.projeto.outubrorosa.ui.saibamais;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.projeto.outubrorosa.databinding.FragmentSaibamaisBinding;


public class SaibaMaisFragment extends Fragment {

    private FragmentSaibamaisBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SaibaMaisViewModel saibaMaisViewModel =
                new ViewModelProvider(this).get(SaibaMaisViewModel.class);

        binding = FragmentSaibamaisBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSaibaMais;
        saibaMaisViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}