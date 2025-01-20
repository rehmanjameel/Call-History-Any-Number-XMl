package com.keyur.callhistoryofanynumber;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;
import com.keyur.callhistoryofanynumber.databinding.ActivityPlansBinding;

public class PlansActivity extends AppCompatActivity {

    private ActivityPlansBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPlansBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.oldPrice.setPaintFlags(binding.oldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        binding.standardOldPrice.setPaintFlags(binding.standardOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        binding.premiumOldPrice.setPaintFlags(binding.premiumOldPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        binding.basicCard.setOnClickListener(v -> {
            handleCardClick(binding.basicLayout, binding.basicDetails);
        });

        binding.standardCard.setOnClickListener(v -> {
            handleCardClick(binding.standardLayout, binding.standardDetails);
        });

        binding.premiumCard.setOnClickListener(v -> {
            handleCardClick(binding.premiumLayout, binding.premiumDetails);
        });

        binding.backButton.setOnClickListener(v -> onBackPressed());

    }

    private void handleCardClick(RelativeLayout selectedCard, MaterialCardView detailCard) {
        // Reset all cards and texts
        resetCards();

        // Highlight the selected card and show the corresponding text
        selectedCard.setBackgroundResource(R.drawable.gradient_background); // Change to your desired color
        detailCard.setVisibility(View.VISIBLE);
    }

    private void resetCards() {
        // Reset all cards to white
        binding.basicLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        binding.standardLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        binding.premiumLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.white));

        // Hide all text views
        binding.basicDetails.setVisibility(View.GONE);
        binding.standardDetails.setVisibility(View.GONE);
        binding.premiumDetails.setVisibility(View.GONE);
    }
}