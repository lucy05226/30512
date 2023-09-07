package com.example.mybookmark;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mybookmark.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding; //멤버변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //클래스 구조로 띄우기
        setContentView(binding.getRoot());

        //뷰페이저가 프래그먼트 3개와 연결하고자한다.
        binding.viewPager.
    }
}