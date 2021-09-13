package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helloandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        binding.imageView.setImageResource(R.drawable.elephant);
        Toast.makeText(this, "안녕하세요 버튼 클릭입니다", Toast.LENGTH_LONG).show();
    }
}