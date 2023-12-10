package com.google.mediapipe.examples.gesturerecognizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.mediapipe.examples.gesturerecognizer.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}