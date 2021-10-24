package com.azis.layotingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.azis.layotingkotlin.databinding.ActivityCardBinding
import com.google.android.material.snackbar.Snackbar

class CardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.cardIstiqlal.setOnLongClickListener {
            binding.cardIstiqlal.isChecked = !binding.cardIstiqlal.isChecked
            true
        }
        binding.cardJakarta.setOnLongClickListener {
            binding.cardJakarta.isChecked = !binding.cardJakarta.isChecked
            true
        }
        binding.cardBorobudur.setOnLongClickListener {
            binding.cardBorobudur.isChecked = !binding.cardBorobudur.isChecked
            true
        }

        binding.btnWhatsSelected.setOnClickListener {
            var msg = ""

            if (binding.cardIstiqlal.isChecked) {
                msg += "'Masjid Istiqlal'"
            }
            if (binding.cardJakarta.isChecked) {
                msg += "'Jakarta'"
            }
            if (binding.cardBorobudur.isChecked) {
                msg += "'Candi Borobudur'"
            }

            Snackbar.make(it, "$msg Selected", Snackbar.LENGTH_LONG).show()
        }
    }
}