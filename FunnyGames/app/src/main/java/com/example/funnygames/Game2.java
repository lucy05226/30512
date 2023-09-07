package com.example.funnygames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;

import com.example.funnygames.databinding.ActivityGame2Binding;

public class Game2 extends AppCompatActivity implements View.OnClickListener, NumberPicker.OnScrollListener {

    ActivityGame2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGame2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //바인딩
        binding.btnAdd.setOnClickListener(this);
        binding.btnClear.setOnClickListener(this);
        binding.btnPlay.setOnClickListener(this);

        //numberPiker.son

        binding.numberPicker.setOnScrollListener(this);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onScrollStateChange(NumberPicker numberPicker, int i) {

    }
}