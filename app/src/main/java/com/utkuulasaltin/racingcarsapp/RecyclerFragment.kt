package com.utkuulasaltin.racingcarsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.utkuulasaltin.racingcarsapp.adapter.CarsAdapter
import com.utkuulasaltin.racingcarsapp.adapter.CarsListener
import com.utkuulasaltin.racingcarsapp.data.CarModel
import com.utkuulasaltin.racingcarsapp.data.mockCarData

class RecyclerFragment : Fragment(), CarsListener {
    private lateinit var rvCarList: RecyclerView
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recycler, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        rvCarList = view.findViewById(R.id.rv_recycler)
        setupAdapter()
    }

    private fun setupAdapter() {
        rvCarList.adapter = CarsAdapter(mockCarData, this@RecyclerFragment)
    }

    override fun onClicked(car: CarModel) {
        navController.navigate(R.id.action_recyclerFragment_to_detailsFragment, Bundle().apply {
            putString("carModel", car.toJson())
        })
    }

}