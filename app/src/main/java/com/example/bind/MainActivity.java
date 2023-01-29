package com.example.bind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.bind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("ajay", "nikhil.com");
        activityMainBinding.setDetails(user);

        activityMainBinding.btn.setOnClickListener(v -> {
//            activityMainBinding.id1.setText("Leo");
            user.setName("Leo");
//            activityMainBinding.btn.setVisibility(v.INVISIBLE);
            activityMainBinding.invalidateAll();
        });
//        user.setName("Nikhil");
    }

}