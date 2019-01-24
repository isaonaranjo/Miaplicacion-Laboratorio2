package com.example.miaplicacionlaboratorio

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import kotlin.reflect.KClass


class menu() : AppCompatActivity(), Parcelable {
    internal lateinit var lista1: ListView
    internal var elementos: Array<String>
    internal lateinit var Inicio: Button

    constructor(parcel: Parcel) : this() {
        elementos = parcel.createStringArray()
    }

    init {
        elementos = arrayOf("Pizza", "Hamburguesa", "Helado", "Pastel de chocolate", "Pasta")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        lista1 = findViewById<View>(R.id.Lista1) as ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, elementos)

        lista1.adapter = adapter
        adapter.notifyDataSetChanged()

        Inicio = findViewById<View>(R.id.boton3) as Button

        Inicio.setOnClickListener {
            val Inicio1 = Intent(this@menu, MainActivity::class)
            startActivity(Inicio1)
            // Boton volver a inicio
        }
    }

    private fun startActivity(inicio1: Unit) {

    }

    private fun Intent(menu: menu, kClass: KClass<MainActivity>): Unit = Unit
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeStringArray(elementos)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<menu> {
        override fun createFromParcel(parcel: Parcel): menu {
            return menu(parcel)
        }

        override fun newArray(size: Int): Array<menu?> {
            return arrayOfNulls(size)
        }
    }
}


