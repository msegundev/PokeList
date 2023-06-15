package com.example.pokemon
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoView

class MainActivityImagenRecyclerView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_imagen_recycler_view)
        var photoView = findViewById<PhotoView>(R.id.photo_view)
        val strValor = intent.getStringExtra("id")
        var toast1 = Toast.makeText(this,"Imagen Ampliada",Toast.LENGTH_LONG)
        toast1.setGravity(Gravity.LEFT,200,0)
        //print(strValor)
        if (intent.extras != null) {

            if (strValor.equals("1")) {
                Glide.with(this).load(R.drawable.mewtwo).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("2")) {
                    Glide.with(this).load(R.drawable.dragonite).into(photoView)
                    toast1.show()
            }
            else if(strValor.equals("3")) {
                Glide.with(this).load(R.drawable.mew).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("4")) {
                Glide.with(this).load(R.drawable.articuno).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("5")) {
                Glide.with(this).load(R.drawable.snorlax).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("6")) {
                Glide.with(this).load(R.drawable.moltres).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("7")) {
                Glide.with(this).load(R.drawable.lapras).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("8")) {
                Glide.with(this).load(R.drawable.arcanine).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("9")) {
                Glide.with(this).load(R.drawable.blastoise).into(photoView)
                toast1.show()
            }
            else if(strValor.equals("10")) {
                Glide.with(this).load(R.drawable.vaporeon).into(photoView)
                toast1.show()
            }
        }
        }
    }