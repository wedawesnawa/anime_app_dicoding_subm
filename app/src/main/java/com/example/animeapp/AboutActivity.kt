package com.example.animeapp

import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "My Profile"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val nameTextView: TextView = findViewById(R.id.name_text)
        val emailTextView: TextView = findViewById(R.id.email_text)
        val profileImageView: ImageView = findViewById(R.id.profile_image)

        nameTextView.text = "Wed."
        emailTextView.text = "komangweda360@gmail.com"
        profileImageView.setImageResource(R.drawable.profile)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}