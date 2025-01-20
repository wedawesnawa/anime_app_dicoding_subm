package com.example.animeapp

object AnimeData {
    private val animeNames = arrayOf(
        "Naruto",
        "One Piece",
        "Attack on Titan",
        "My Hero Academia",
        "Vinland Saga",
        "Dr. Stone",
        "Jujutsu Kaisen",
        "One Punch Man",
        "Suzume",
        "Kintama",
    )

    private val animeDescriptions = arrayOf(
        "Deskripsi Naruto...",
        "Deskripsi One Piece...",
        "Deskripsi Attack on Titan...",
        "Deskripsi My Hero Academia...",
        "Deskripsi My Hero Academia...",
        "Deskripsi My Hero Academia...",
        "Deskripsi My Hero Academia...",
        "Deskripsi My Hero Academia...",
        "Deskripsi My Hero Academia...",
        "Deskripsi My Hero Academia...",
        "Deskripsi My Hero Academia...",
    )

    private val animeImages = intArrayOf(
        R.drawable.anime_naruto,
        R.drawable.anime_one_piece,
        R.drawable.anime_attack_on_titan,
        R.drawable.anime_my_hero_academia,
        R.drawable.anime_virland_saga,
        R.drawable.anime_dr_stone,
        R.drawable.anime_jujutsu_kaisen,
        R.drawable.anime_one_punch_man,
        R.drawable.anime_suzume,
        R.drawable.anime_kintama,
    )

    val listData: ArrayList<Anime>
        get() {
            val list = arrayListOf<Anime>()
            for (position in animeNames.indices) {
                val anime = Anime(
                    name = animeNames[position],
                    description = animeDescriptions[position],
                    photo = animeImages[position]
                )
                list.add(anime)
            }
            return list
        }
}