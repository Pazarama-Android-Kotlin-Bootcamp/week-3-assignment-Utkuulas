package com.utkuulasaltin.racingcarsapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.utkuulasaltin.racingcarsapp.R
import com.utkuulasaltin.racingcarsapp.data.CarModel

class CarsAdapter(
    private val carList: MutableList<CarModel>,
    private val listener: CarsListener
) :
    RecyclerView.Adapter<CarsAdapter.CarsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {

        //Binds the object to the xml file
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
        return CarsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.bind(carList[position], listener)
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    class CarsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvChassis = view.findViewById<TextView>(R.id.tv_row_chassis)
        private val tvConstructor = view.findViewById<TextView>(R.id.tv_row_constructor)
        private val ivCar = view.findViewById<ImageView>(R.id.iv_row)

        fun bind(car: CarModel, listener: CarsListener) {
            tvChassis.text = car.chassis
            tvConstructor.text = car.constructor
            ivCar.setImageResource(car.image)

            itemView.setOnClickListener {
                listener.onClicked(car)
            }
        }
    }


}

interface CarsListener {
    fun onClicked(car: CarModel)
}