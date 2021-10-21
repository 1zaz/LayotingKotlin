package com.azis.layotingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.azis.layotingkotlin.databinding.ActivityCardBinding

class CardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}