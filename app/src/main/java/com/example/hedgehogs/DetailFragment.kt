package com.example.hedgehogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
        val img = view?.findViewById<ImageView>(R.id.imageView)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val views = view?.findViewById<TextView>(R.id.textView)
        val img = view?.findViewById<ImageView>(R.id.imageView)
        when(selectedItem){
            "Персидская кошка" -> {views?.setText(R.string.persidska)
                                img?.setImageResource(R.drawable.persidska)
            }
            "Кошка сфинкс" -> {views?.setText(R.string.sfinks)
                img?.setImageResource(R.drawable.sfinks)
            }
            "Сиамская кошка" -> {views?.setText(R.string.siamska)
                img?.setImageResource(R.drawable.siamska)
            }
        }
    }
}
