package com.keyur.callhistoryofanynumber;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.keyur.callhistoryofanynumber.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.getDetails.setOnClickListener(v -> {
            if (!binding.numberET.getText().toString().isEmpty()) {
                Intent intent = new Intent(this, NumberHistoryActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Please enter the number", Toast.LENGTH_SHORT).show();
            }
        });
    }
}