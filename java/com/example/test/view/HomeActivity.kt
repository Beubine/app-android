package com.example.test.view


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.databinding.LogInPageBinding
import com.example.test.view.adapter.RecipeAdapter
import com.example.test.viewmodele.LogInViewModel


class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this).get(LogInViewModel::class.java)
        val binding: LogInPageBinding = DataBindingUtil.setContentView(this,R.layout.home_page)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}

