package com.ruru.sorteio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun drawNumber(view: View){

        val text = findViewById<TextView>(R.id.txtSorteio)
        text.setText(R.string.txt_selecionado)
        val numberDrawn = Random().nextInt(11)
        val imageResult = findViewById<ImageView>(R.id.imageResult)

        when (numberDrawn){
            0 -> imageResult.setImageResource(R.drawable.zero)
            1 -> imageResult.setImageResource(R.drawable.um)
            2 -> imageResult.setImageResource(R.drawable.dois)
            3 -> imageResult.setImageResource(R.drawable.tres)
            4 -> imageResult.setImageResource(R.drawable.quatro)
            5 -> imageResult.setImageResource(R.drawable.cinco)
            6 -> imageResult.setImageResource(R.drawable.seis)
            7 -> imageResult.setImageResource(R.drawable.sete)
            8 -> imageResult.setImageResource(R.drawable.oito)
            9 -> imageResult.setImageResource(R.drawable.nove)
            10 -> imageResult.setImageResource(R.drawable.dez)
        }
        imageResult.visibility = View.VISIBLE
    }
}