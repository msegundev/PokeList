package com.example.pokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

public class MainActivity : AppCompatActivity(),ElementoAdapter.onItemListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView1()
    }

    private fun setupRecyclerView1() {

        var pokemons: List<Pokemon> = listOf(
            Pokemon(
                id = "1",
                nombre = "MEWTWO",
                altura ="2m",
                peso="122KG",
                image = R.drawable.mewtwo,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "2",
                nombre = "DRAGONITE",
                altura ="2.2M",
                peso="210KG",
                image = R.drawable.dragonite,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "3",
                nombre = "MEW",
                altura ="0.4M",
                peso="4KG",
                image = R.drawable.mew,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "4",
                nombre = "ARTICUNO",
                altura ="1.7M",
                peso="55.4KG",
                image = R.drawable.articuno,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "5",
                nombre = "SNORLAX",
                altura ="2.1M",
                peso="460KG",
                image = R.drawable.snorlax,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "6",
                nombre = "MOLTRES",
                altura ="2M",
                peso="60KG",
                image = R.drawable.moltres,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "7",
                nombre = "LAPRAS",
                altura ="2.5M",
                peso="220KG",
                image = R.drawable.lapras,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "8",
                nombre = "ARCANINE",
                altura ="1.9M",
                peso="155KG",
                image = R.drawable.arcanine,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "9",
                nombre = "BLASTOISE",
                altura ="1.6M",
                peso="85.5KG",
                image = R.drawable.blastoise,
                icon = R.drawable.pokoball
            ),
            Pokemon(
                id = "10",
                nombre = "VAPOREON",
                altura ="1M",
                peso="29KG",
                image = R.drawable.vaporeon,
                icon = R.drawable.pokoball
            )
        )


        var recycler = findViewById<RecyclerView>(R.id.rvPokemons)
        recycler.adapter = ElementoAdapter(this, pokemons, this)
        recycler.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }
    override fun onImagenItinerarioClick(id: String) {

        val intent = Intent(this, MainActivityImagenRecyclerView::class.java)
        intent.putExtra("id", id)
        startActivity(intent)
    }
    override fun onItemClick(Id: String) {
        Toast.makeText(this, "has clickeado", Toast.LENGTH_LONG).show()
    }
}