package com.example.mysteryhelper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import com.example.mysteryhelper.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        plot_fragments = getResources().getStringArray(R.array.plot_fragements);

        Random random = new Random();


        binding.clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = binding.plotTextbox;
                int randomPlot = random.nextInt(plot_fragments.length);
                String plot = plot_fragments[randomPlot];
                t.setText(plot);
            }
        });

    }

    private String[] plot_fragments;


}