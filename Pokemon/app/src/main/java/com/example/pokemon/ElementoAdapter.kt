package com.example.pokemon
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ElementoAdapter(
    var context: Context,
    var pokemons: List<Pokemon>,
    private val itemClickListener: onItemListener
): RecyclerView.Adapter<ElementoAdapter.ViewHolder>() {

    interface onItemListener{
        fun onImagenItinerarioClick(id: String)
        fun onItemClick(Id: String)
    }

    inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view){

        var idPokemon = view.findViewById<TextView>(R.id.ranking)
        var nombre = view.findViewById<TextView>(R.id.nombre)
        var altura = view.findViewById<TextView>(R.id.altura)
        var peso = view.findViewById<TextView>(R.id.peso)
        var imagenPokemon = view.findViewById<ImageView>(R.id.idfoto)
        var iconoPokemon = view.findViewById<ImageView>(R.id.idIcon)

        fun bind(pokemon: Pokemon,context: Context){
            idPokemon.text = pokemon.id
            nombre.text = pokemon.nombre
            altura.text = pokemon.altura
            peso.text = pokemon.peso
            Log.i("IMAGEN","Imagen: ${pokemon.image}")
            Log.i("ICONO","Icono: ${pokemon.icon}")
            Glide.with(context).load(pokemon.image).into(imagenPokemon);
            Glide.with(context).load(pokemon.icon).into(iconoPokemon);
            view.setOnClickListener {
                itemClickListener.onItemClick(pokemon.nombre)

                Toast.makeText(view.context,"Pokemon pulsado",Toast.LENGTH_LONG).show()}
            imagenPokemon.setOnClickListener {
                itemClickListener.onImagenItinerarioClick(pokemon.id)
            }




        }


    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        //Aqui se infla la vista xml con datos

        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.layoutpokemon,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var pokemon = pokemons[position]
        holder.bind(pokemon,context)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }


}
