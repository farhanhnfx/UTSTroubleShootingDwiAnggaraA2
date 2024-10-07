package com.example.soal_uts_bug_fixing

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.soal_uts_bug_fixing.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val tipe = intent.getStringExtra("EXTRA_TIPE")
        val alamat = intent.getStringExtra("EXTRA_ALAMAT")
        val tanggal = intent.getStringExtra("EXTRA_TANGGAL")
        val waktu = intent.getStringExtra("EXTRA_WAKTU")
        val nama = intent.getStringExtra("EXTRA_NAMA")
        val identitas = intent.getStringExtra("EXTRA_IDENTITAS")
        val gender = intent.getStringExtra("EXTRA_GENDER")


        with(binding){
            namaTxt.text = nama
            identitasTxt.text = identitas
            genderTxt.text = gender
            tipeTxt.text = tipe
            waktuTxt.text = waktu
            tanggalTxt.text = tanggal
            tipeTxt.text = alamat
            if(tipe=="Offline"){
                lokasiTitle.visibility = View.VISIBLE
                lokasiTxt.visibility = View.VISIBLE
                lokasiTxt.text = alamat
            }

            backBtn.setOnClickListener(){
                val intentToHome = Intent(this@ResultActivity, MainActivity::class.java)
                startActivity(intentToHome)
            }
        }

    }
}