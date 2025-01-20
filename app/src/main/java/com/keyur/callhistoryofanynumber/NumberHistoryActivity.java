package com.keyur.callhistoryofanynumber;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.keyur.callhistoryofanynumber.databinding.ActivityNumberHistoryBinding;

public class NumberHistoryActivity extends AppCompatActivity {

    private ActivityNumberHistoryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNumberHistoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(v -> onBackPressed());

        binding.getHistoryButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, PlansActivity.class);
            startActivity(intent);
        });
    }
}