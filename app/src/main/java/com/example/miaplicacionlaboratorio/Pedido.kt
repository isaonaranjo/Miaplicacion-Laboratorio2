package com.example.miaplicacionlaboratorio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class Pedido : AppCompatActivity() {
    internal lateinit var lista2: ListView
    internal var elementos2: Array<String>
    internal lateinit var Inicio: Button
    internal var HacerPedido: Button? = null
    internal var LimpiarPedido: Button? = null

    init {
        elementos2 = arrayOf("Pizza", "Hamburguesa", "Helado", "Pastel de chocolate", "Pasta")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        lista2 = findViewById<View>(R.id.Lista1) as ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, elementos2)

        lista2.adapter = adapter
        adapter.notifyDataSetChanged()




        Inicio = findViewById<View>(R.id.boton3) as Button

        Inicio.setOnClickListener {
            val Inicio = Intent(this@Pedido, MainActivity::class.java)
            startActivity(Inicio)
            // Boton volver a inicio


            HacerPedido!!.setOnClickListener {
                val toast1: Toast
                toast1 = Toast.makeText(applicationContext,
                        "Se realizo el pedido con exito", Toast.LENGTH_SHORT)

                toast1.show()
            }
            LimpiarPedido!!.setOnClickListener {
                val toast2: Toast

                toast2 = Toast.makeText(applicationContext,
                        "Se limpio el pedido", Toast.LENGTH_SHORT)

                toast2.show()
            }
        }
    }
}
