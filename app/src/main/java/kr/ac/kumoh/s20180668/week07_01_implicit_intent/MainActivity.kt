package kr.ac.kumoh.s20180668.week07_01_implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180668.week07_01_implicit_intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnHomepage.setOnClickListener {
            val uri = Uri.parse("http://bwoh.github.io")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}