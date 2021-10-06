package com.ruru.sorteio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        val txtResult = findViewById<TextView>(R.id.txtresultado)
        txtResult.visibility = View.VISIBLE
        txtResult.setText("" + numberDrawn)
    }
}