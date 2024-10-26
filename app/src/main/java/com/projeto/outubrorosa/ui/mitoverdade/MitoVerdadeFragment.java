package com.projeto.outubrorosa.ui.mitoverdade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.projeto.outubrorosa.databinding.FragmentMitoverdadeBinding;

public class MitoVerdadeFragment extends Fragment {

    private FragmentMitoverdadeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MitoVerdadeViewModel mitoVerdadeViewModel =
                new ViewModelProvider(this).get(MitoVerdadeViewModel.class);

        binding = FragmentMitoverdadeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textmitoverdade;
        mitoVerdadeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}