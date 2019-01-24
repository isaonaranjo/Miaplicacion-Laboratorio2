package com.example.miaplicacionlaboratorio

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    internal lateinit var mostrarMenu: Button
    internal lateinit var mostrarPedido: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)



        mostrarMenu = findViewById<View>(R.id.boton1) as Button
        // Boton mostrar menu

        mostrarPedido = findViewById<View>(R.id.boton2) as Button
        // Boton mostrar pedido

        mostrarPedido.setOnClickListener {
            val mostrarPedido = Intent(this@MainActivity, Pedido::class.java)
            startActivity(mostrarPedido)

            mostrarMenu.setOnClickListener {
                val mostrarMenu = Intent(this@MainActivity, menu::class.java)
                startActivity(mostrarMenu)

                val uno: ImageView
                uno = findViewById<View>(R.id.imageView) as ImageView
                uno.setImageResource(R.drawable.pic)
            }
        }
    }
}
