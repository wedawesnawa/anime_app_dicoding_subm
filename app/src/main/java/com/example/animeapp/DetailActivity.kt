package com.example.animeapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val animeTitle = intent.getStringExtra("ANIME_TITLE")
        val animeImage = intent.getIntExtra("ANIME_IMAGE", 0)
        val animeDescription = intent.getStringExtra("ANIME_DESCRIPTION")

        val titleTextView: TextView = findViewById(R.id.detail_title)
        val imageView: ImageView = findViewById(R.id.detail_image)
        val descriptionTextView: TextView = findViewById(R.id.detail_description)

        titleTextView.text = animeTitle
        imageView.setImageResource(animeImage)
        descriptionTextView.text = animeDescription

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = animeTitle
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_share -> {
                val shareIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Check out this anime: ${intent.getStringExtra("animeTitle")}")
                    type = "text/plain"
                }
                startActivity(Intent.createChooser(shareIntent, "Share via"))
                true
            }
            android.R.id.home -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return true
    }
}
