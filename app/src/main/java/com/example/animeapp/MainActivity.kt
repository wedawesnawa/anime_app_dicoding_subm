package com.example.animeapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Halaman Utama"

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val listAnime = generateAnimeList()
        recyclerView.adapter = ListAnimeAdapter(listAnime)
    }

    private fun generateAnimeList(): List<Anime> {
        // Buat dummy data atau ambil dari sumber lain
        return listOf(
            Anime("One Piece", "One Piece menjadi rekomendasi anime terbaik pertama yang perlu ditonton. Anime bergenre petualangan, aksi dan fantasi ini, diadaptasi dari manga yang pertama kali diterbitkan pada tahun 1997.\n" +
                    "\n" +
                    "Hingga saat ini manganya sudah lebih dari 100 volume terjual di seluruh dunia. Anime One Piece pertama kali tayang setelah dua tahun manga pertama dirilis.\n" +
                    "\n" +
                    "Cerita awalnya mengisahkan petualangan karakter utama bernama Monkey D. Luffy dan krunya kapal di dunia bajak laut. Dia berlayar di laut, untuk mencari harta karun pamungkas yang disebut \"One Piece\". Banyak adegan pertarungan yang kuat antara Iblis laut dan Luffy yang dikemas dengan menarik. Sehingga, anime ini wajib banget deh buat ditonton!\n" +
                    "\n" +
                    "Baca artikel detikjabar, \"30 Rekomendasi Anime Terbaik Sepanjang Masa, Wajib Nonton!\"", R.drawable.anime_one_piece),
            Anime("Naruto", "Naruto memang cocok untuk masuk menjadi rekomendasi anime populer sepanjang masa. Anime ini berhasil menarik banyak penggemar, dan mungkin hampir semua orang tahu anime Naruto kan? Naruto adalah anime yang bertema kehidupan ninja, yang diadaptasi dari manga karya Masashi Kishimoto.\n" +
                    "\n" +
                    "Manga Naruto dirilis Weekly Shonen Jump oleh pada tahun 1999, dan berjalan hingga tahun 2014. Kemudian serial anime Naruto selesai pada tahun 2017. Anime Naruto sendiri terdiri dari dua judul, yakni Naruto yang ditayangkan pada 2002-2007 dan Naruto: Shippuden yang ditayangkan pada 2007-2017.\n" +
                    "\n" +
                    "Anime ini settingnya tentang dunia fiksi Shinobi (Ninja), dan karakter utama bernama Uzumaki Naruto yang merupakan anak laki-laki hiperaktif yang bercita-cita menjadi seorang Hokage (pemimpin desa). Awal kemunculannya Naruto sering dikucilkan para penduduk desa Konoha, karena di dalam tubuhnya ada monster ekor 9 bernama Kurama yang sempat menghancurkan desa itu.\n" +
                    "\n" +
                    "Dalam anime ini menampilkan Naruto dan karakter Ninja lainnya bertarung dengan berbagai teknik dan energi cakra untuk melakukan setiap misi. Banyak pesan penting yang ada di dalam anime ini, seperti ikatan kuat dengan teman dan keluarga, pengkhianatan, perpisahan, hingga kegigihan untuk tak pantang menyerah.\n" +
                    "\n" +
                    "Setelah Naruto tamat, hadir manga dan anime Boruto: Naruto Next Generations. Di mana Boruto merupakan anime spin-off serial Naruto, yang berfokus pada cerita anaknya Naruto, yakni Boruto Uzumaki.\n" +
                    "\n" +
                    "Baca artikel detikjabar, \"30 Rekomendasi Anime Terbaik Sepanjang Masa, Wajib Nonton!\" selengkapnya https://www.detik.com/jabar/jabar-gaskeun/d-6212258/30-rekomendasi-anime-terbaik-sepanjang-masa-wajib-nonton.\n" +
                    "\n" +
                    "Download Apps Detikcom Sekarang https://apps.detik.com/detik/", R.drawable.anime_naruto),
            Anime("One Punch Man", "The seemingly unimpressive Saitama has a rather unique hobby: being a hero. In order to pursue his childhood dream, Saitama relentlessly trained for three years, losing all of his hair in the process. Now, Saitama is so powerful, he can defeat any enemy with just one punch. However, having no one capable of matching his strength has led Saitama to an unexpected problem—he is no longer able to enjoy the thrill of battling and has become quite bored.\n" +
                    "\n" +
                    "One day, Saitama catches the attention of 19-year-old cyborg Genos, who witnesses his power and wishes to become Saitama's disciple. Genos proposes that the two join the Hero Association in order to become certified heroes that will be recognized for their positive contributions to society. Saitama, who is shocked that no one knows who he is, quickly agrees. Meeting new allies and taking on new foes, Saitama embarks on a new journey as a member of the Hero Association to experience the excitement of battle he once felt.", R.drawable.anime_one_punch_man),
            Anime("Gintama", "Edo is a city that was home to the vigor and ambition of samurai across the country. However, following feudal Japan's surrender to powerful aliens known as the \"Amanto,\" those aspirations now seem unachievable. With the once-influential shogunate rebuilt as a puppet government, a new law is passed that promptly prohibits all swords in public.\n" +
                    "\n" +
                    "Enter Gintoki Sakata, an eccentric silver-haired man who always carries around a wooden sword and maintains his stature as a samurai despite the ban. As the founder of Yorozuya, a small business for odd jobs, Gintoki often embarks on endeavors to help other people—though usually in rather strange and unforeseen ways.\n" +
                    "\n" +
                    "Assisted by Shinpachi Shimura, a boy with glasses supposedly learning the way of the samurai; Kagura, a tomboyish girl with superhuman strength and an endless appetite; and Sadaharu, their giant pet dog who loves biting on people's heads, the Yorozuya encounter anything from alien royalty to scuffles with local gangs in the ever-changing world of Edo.", R.drawable.anime_kintama),
            Anime("Jujutsu Kasisen", "Jujutsu Kaisen menjadi serial anime populer, sejak manganya dirilis oleh Weekly Shonen Jump pada tahun 2018. Anime bergenre action dan dark fantasy ini menceritakan tentang Yuji Itadori siswa SMA berbakat, yang memutuskan untuk bergabung ke klub ilmu gaib di sekolahnya. Kemudian hidupnya mulai berubah ketika ia menemukan jimat terkutuk.\n" +
                    "\n" +
                    "Musim pertama dari adaptasi anime ini, diproduksi oleh studio anime Jepang Mappa, ditayangkan dengan 24 episode pada tahun 2020. Musim kedua terbaru anime Jujutsu Kaisen akan mengudara pada tahun 2023 mendatang.\n" +
                    "\n" +
                    "Walaupun animasi tidak hanya dari Jepang saja, namun banyak orang di seluruh dunia mencintai anime Jepang. Setiap tahunnya, ada banyak animasi yang diproduksi dan dirilis di seluruh dunia.\n" +
                    "\n" +
                    "Industri anime telah berkembang pesat di Jepang, di mana negeri Sakura itu juga memiliki budaya lainnya seperti video game, cosplay, manga, hingga musik pop Jepang (Jpop). Saat ini, siapa pun bisa menikmati anime Jepang dengan subtitle dari berbagai bahasa.\n" +
                    "\n" +
                    "Bahkan untuk mengakses anime terbaru saja, kita bisa tonton dengan mudah lewat banyak aplikasi. Nonton anime sekarang bisa streaming film online atau Video on Demand (VoD) seperti Netflix dan beberapa streaming video lainnya secara legal, di internet.\n" +
                    "\n", R.drawable.anime_jujutsu_kaisen),
            Anime("Vinland Saga", "Young Thorfinn grew up listening to the stories of old sailors that had traveled the ocean and reached the place of legend, Vinland. It's said to be warm and fertile, a place where there would be no need for fighting—not at all like the frozen village in Iceland where he was born, and certainly not like his current life as a mercenary. War is his home now. Though his father once told him, \"You have no enemies, nobody does. There is nobody who it's okay to hurt,\" as he grew, Thorfinn knew that nothing was further from the truth.\n" +
                    "\n" +
                    "The war between England and the Danes grows worse with each passing year. Death has become commonplace, and the viking mercenaries are loving every moment of it. Allying with either side will cause a massive swing in the balance of power, and the vikings are happy to make names for themselves and take any spoils they earn along the way. Among the chaos, Thorfinn must take his revenge and kill Askeladd, the man who murdered his father. The only paradise for the vikings, it seems, is the era of war and death that rages on.", R.drawable.anime_virland_saga),
            Anime("Dr. Stone", "After five years of harboring unspoken feelings, high-schooler Taiju Ooki is finally ready to confess his love to Yuzuriha Ogawa. Just when Taiju begins his confession however, a blinding green light strikes the Earth and petrifies mankind around the world—turning every single human into stone.\n" +
                    "\n" +
                    "Several millennia later, Taiju awakens to find the modern world completely nonexistent, as nature has flourished in the years humanity stood still. Among a stone world of statues, Taiju encounters one other living human: his science-loving friend Senkuu, who has been active for a few months. Taiju learns that Senkuu has developed a grand scheme—to launch the complete revival of civilization with science. Taiju's brawn and Senkuu's brains combine to forge a formidable partnership, and they soon uncover a method to revive those petrified.\n" +
                    "\n" +
                    "However, Senkuu's master plan is threatened when his ideologies are challenged by those who awaken. All the while, the reason for mankind's petrification remains unknown.", R.drawable.anime_dr_stone),
            Anime("Attack On Titan", "Anime Attack on Titan merupakan anime terbaik dalam beberapa tahun terakhir, yang pantas untuk masuk daftar rekomendasi anime yang wajib ditonton. Anime ini awalnya dirilis sebagai manga pada tahun 2009. Kemudian, ditayangkan sebagai anime pada tahun 2013.\n" +
                    "\n" +
                    "Attack on Titan menceritakan tentang kondisi di mana umat manusia berdiri di ambang kepunahan karena diserang oleh para raksasa yang disebut Titan. Karakter utama Eren Yeager dan Mikasa Ackerman dengan anggota Survey Corps lainnya, berusaha untuk melawan para raksasa itu.\n" +
                    "\n" +
                    "Kisah seri manga Attack on Titan tamat pada April 2021. Musim keempat (terakhir dari seri anime) telah tayang pada 2020 dan akan selesai pada bagian akhir yang ditayangkan tahun 2023 mendatang.\n" +
                    "\n" +
                    "Baca artikel detikjabar, \"30 Rekomendasi Anime Terbaik Sepanjang Masa, Wajib Nonton!\" selengkapnya https://www.detik.com/jabar/jabar-gaskeun/d-6212258/30-rekomendasi-anime-terbaik-sepanjang-masa-wajib-nonton.\n" +
                    "\n" +
                    "Download Apps Detikcom Sekarang https://apps.detik.com/detik/", R.drawable.anime_attack_on_titan),
            Anime("Suzume", "Perjalanan Suzume dimulai di sebuah kota yang tenang di Kyushu (terletak di Barat daya Jepang) ketika dia bertemu dengan seorang pria muda yang mengatakan kepadanya, \"Saya sedang mencari pintu.\" Apa yang Suzume temukan adalah satu pintu lapuk yang berdiri tegak di tengah reruntuhan seolah terlindung", R.drawable.anime_suzume),
            Anime("My Hero Academia", "Boku no Hero Academia (Jepang: 僕のヒーローアカデミア, Hepburn: Boku no Hīrō Akademia), yang diterbitkan di Indonesia dengan judul My Hero Academia, adalah sebuah seri manga shōnen Jepang bertema pahlawan super yang ditulis dan diilustrasikan oleh Kōhei Horikoshi. Manga ini mulai dimuat dalam majalah Weekly Shōnen Jump sejak bulan Juli 2014, dan telah dibundel menjadi 37 volume tankōbon hingga bulan Februari 2023. Ceritanya mengisahkan tentang Izuku Midoriya (nama pahlawan: Deku), seorang anak lelaki tanpa kekuatan super (yang disebut quirk) di dunia tempat hal seperti itu sudah menjadi sesuatu yang umum, tetapi masih bercita-cita untuk menjadi seorang pahlawan. Ia kemudian bertemu dengan pahlawan terhebat di Jepang, All Might, yang memberikan quirk miliknya kepada Izuku setelah melihat potensinya, dan kemudian memasukkannya dalam sebuah SMA prestisius yang dikhususkan untuk para pahlawan muda yang sedang dalam pelatihan.", R.drawable.anime_my_hero_academia),
        )
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_page -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
