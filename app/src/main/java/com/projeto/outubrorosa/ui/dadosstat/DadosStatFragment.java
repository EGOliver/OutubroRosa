package com.projeto.outubrorosa.ui.dadosstat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.projeto.outubrorosa.databinding.FragmentDadosstatBinding;

public class DadosStatFragment extends Fragment {

    private FragmentDadosstatBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DadosStatViewModel dadosstatViewModel =
                new ViewModelProvider(this).get(DadosStatViewModel.class);

        binding = FragmentDadosstatBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDadosStat;
        dadosstatViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}