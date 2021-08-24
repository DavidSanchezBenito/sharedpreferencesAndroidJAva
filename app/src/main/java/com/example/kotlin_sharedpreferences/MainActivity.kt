package com.example.kotlin_sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //https://www.youtube.com/watch?v=HGnHNd5Y_FE

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    }

    private fun initUI() {
        //captura el lisstener del boton
        binding.btnContinue.setOnClickListener {
            //le paso otra f
            accessToDetail()
        }
    }

    private fun accessToDetail() {
//has escrito tu numero
        if (binding.edtxName.text.toString().isNotEmpty()){
            //guarda el usuario


        }else {
            //hacer otra cosa
        }
    }
}