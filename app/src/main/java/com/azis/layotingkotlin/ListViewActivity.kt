package com.azis.layotingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.azis.layotingkotlin.databinding.ActivityListViewBinding

class ListViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListViewBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // data yang akan kita tampilkan ke dala ListView
        val languages = listOf("Java", "Kotlin", "Javascript", "PHP", "Python")

        // memberikan adapter ke ListView
        binding.lvLanguages.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)

    }
}