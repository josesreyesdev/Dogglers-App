package com.example.mascotas.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mascotas.R
import com.example.mascotas.data.DataSource
import com.example.mascotas.model.Dog
import java.lang.IllegalArgumentException

class DogCardAdapter(
    private val context: Context?,
    private val layout: Int,
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    //inicializando los datos de usando la lista de datasource
    private val dataset: List<Dog> = DataSource.dogs

    //clase anidada, viewHolder representa cada vista de mi lista
    class DogCardViewHolder(view: View): RecyclerView.ViewHolder(view) {
        //Horizontal, Vertical && Grid
        val imageView: ImageView = view.findViewById(R.id.dog_image)
        val names: TextView = view.findViewById(R.id.dog_name)
        val ages: TextView = view.findViewById(R.id.dog_age)
        val hobbies: TextView = view.findViewById(R.id.dog_hobbies)
    }

    //Creando las interfaces de vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        //Creando la nueva view para Grid
        val adapterLayoutGrid = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_list_item, parent, false)

        //Creando la nueva view para Horizontal y vertical layout
        val adapterLayoutVerticalHorizontal = LayoutInflater.from(parent.context)
            .inflate(R.layout.vertical_horizontal_list_item, parent, false)

        return when (layout) {
            3 -> DogCardViewHolder(adapterLayoutGrid)
            2 -> DogCardViewHolder(adapterLayoutVerticalHorizontal)
            1 -> DogCardViewHolder(adapterLayoutVerticalHorizontal)
            else -> throw IllegalArgumentException("Error en layout para lanzar el adaptador en DogCardAdapter")
        }
    }

    //Reemplazando el contenido de las vistas, recibe una vista y su posicion
    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dataset[position]
        //Actualizando las vistas del contenedor
        holder.imageView.setImageResource(item.imageResourceID)
        if (context != null) {
            holder.names.text = context.resources.getString( R.string.dog_name, item.nameResourceId)
            holder.ages.text = context.resources.getString(R.string.dog_age, item.ageResourceId)
        }

        val resources = context?.resources
        holder.hobbies.text = resources?.getString(R.string.dog_hobbies, item.hobbiesResource)

    }

    override fun getItemCount(): Int = dataset.size //retorno el tamaño de datos

}