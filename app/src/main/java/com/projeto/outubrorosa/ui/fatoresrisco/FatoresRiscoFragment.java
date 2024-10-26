package com.projeto.outubrorosa.ui.fatoresrisco;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.projeto.outubrorosa.databinding.FragmentFatoresriscoBinding;

public class FatoresRiscoFragment extends Fragment {

    private FragmentFatoresriscoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FatoresRiscoViewModel fatoresriscoViewModel =
                new ViewModelProvider(this).get(FatoresRiscoViewModel.class);

        binding = FragmentFatoresriscoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFatoresrisco;
        fatoresriscoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}