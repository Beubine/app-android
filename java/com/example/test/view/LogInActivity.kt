package com.example.test.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.test.R
import com.example.test.databinding.LogInPageBinding
import com.example.test.viewmodele.LogInViewModel


class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this).get(LogInViewModel::class.java)
        val binding: LogInPageBinding = DataBindingUtil.setContentView(this,R.layout.log_in_page)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.succeed.observe(this, Observer { value ->
            if (value) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        })
    }

}



