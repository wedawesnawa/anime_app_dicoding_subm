package com.example.animeapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAnimeAdapter(private val listAnime: List<Anime>) : RecyclerView.Adapter<ListAnimeAdapter.AnimeViewHolder>() {

    class AnimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val animeImage: ImageView = itemView.findViewById(R.id.anime_image)
        val animeTitle: TextView = itemView.findViewById(R.id.anime_title)
        val animeOverview: TextView = itemView.findViewById(R.id.anime_overview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_anime, parent, false)
        return AnimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        val anime = listAnime[position]
        holder.animeImage.setImageResource(anime.photo)
        holder.animeTitle.text = anime.name
        holder.animeOverview.text = anime.description

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("ANIME_TITLE", anime.name)
            intent.putExtra("ANIME_IMAGE", anime.photo)
            intent.putExtra("ANIME_DESCRIPTION", anime.description)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listAnime.size
}
