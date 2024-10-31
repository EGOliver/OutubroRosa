package com.projeto.outubrorosa.ui.guiaautoexame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.projeto.outubrorosa.databinding.FragmentGuiaautoexameBinding;


public class GuiaAutoexameFragment extends Fragment {

    private FragmentGuiaautoexameBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GuiaAutoexameViewModel guiaAutoexameViewModel =
                new ViewModelProvider(this).get(GuiaAutoexameViewModel.class);

        binding = FragmentGuiaautoexameBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGuiaAutoexame;
        guiaAutoexameViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}