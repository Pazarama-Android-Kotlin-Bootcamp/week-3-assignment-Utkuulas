package com.utkuulasaltin.racingcarsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.utkuulasaltin.racingcarsapp.data.CarModel

class DetailsFragment : Fragment() {
    private lateinit var navController: NavController
    private lateinit var tvChassis: TextView
    private lateinit var tvConstructor: TextView
    private lateinit var tvDescription: TextView
    private lateinit var ivCar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        navController = findNavController()

        //Provides to handling onBackPressed actions
        activity?.onBackPressedDispatcher?.addCallback(this, object: OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                navController.navigate(R.id.action_detailsFragment_to_recyclerFragment)
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupViews(view)
    }

    private fun setupViews(view: View) {
        tvChassis = view.findViewById(R.id.tv_details_chassis)
        tvConstructor = view.findViewById(R.id.tv_details_constructor)
        tvDescription = view.findViewById(R.id.tv_details_description)
        ivCar = view.findViewById(R.id.iv_details)

        arguments?.let {
            val carData = it.getString("carModel")

            carData?.let { safeCarData ->
                val car = CarModel.fromJson(safeCarData)

                tvChassis.text = car.chassis
                tvConstructor.text = car.constructor
                tvDescription.text = car.description
                ivCar.setImageResource(car.image)

            }
        }
    }
}