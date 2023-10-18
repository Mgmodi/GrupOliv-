package com.app.grup.olive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app.grup.olive.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*
        1-Olive
Telefono: +34 934 52 19 90
Maps https://www.google.com/maps/place/Restaurant+L'Oliv%C3%A9/@41.3890958,2.1626826,15z/data=!4m2!3m1!1s0x0:0x549059360b575c3b?sa=X&ved=2ahUKEwi4nM3ejdb-AhUoVKQEHTjPAb4Q_BJ6BAhjEAg
Reserva : https://resercom.grupoliveslowfoods.com/es/node/add/reserva/1

2-Barceloneta
Telefono: +34 932 21 21 11
Maps https://www.google.com/maps/place/Barceloneta/@41.3758653,2.1854126,17z/data=!3m1!4b1!4m6!3m5!1s0x12a4a3ab864bf7eb:0x27a94cb1cebcce32!8m2!3d41.3758653!4d2.1876013!16s%2Fg%2F113fbdbx8
Reserva : https://resercom.grupoliveslowfoods.com/es/node/add/reservab/2

3- Paco
TelËfon: +34 934 30 90 27
Maps https://www.google.com/maps/place/Paco+Meralgo/@41.3916259,2.1524973,15z/data=!4m2!3m1!1s0x0:0x335fc4e792290e11?sa=X&ved=2ahUKEwiKrejCj9b-AhWDi_0HHWM2AlcQ_BJ6BAhMEAg
Reserva : https://resercom.grupoliveslowfoods.com/es/node/add/reserva/3

4- Barcelonamilano
TelËfon: +34 934 30 72 79
Maps https://www.google.com/maps/place/Restaurant+BarcelonaMilano/@41.391104,2.149182,15z/data=!4m2!3m1!1s0x0:0x2d3515fbb652c38e?sa=X&ved=2ahUKEwiCga_qj9b-AhXpVaQEHSxxCkkQ_BJ6BAhNEAg
Reserva https://resercom.grupoliveslowfoods.com/es/node/add/reserva/4

5-CaÒete
TelËfon: +34 932 70 34 58
Maps https://www.google.com/maps/place/Bar+Ca%C3%B1ete/@41.3791528,2.173125,15z/data=!4m2!3m1!1s0x0:0x1c77b2f8f4cdfb63?sa=X&ved=2ahUKEwifovGakNb-AhVzU6QEHcv0BY0Q_BJ6BAhHEAg
Reserva https://resercom.grupoliveslowfoods.com/es/node/add/reserva/7
         */

        binding = FragmentHomeBinding.bind(view)

        binding.oneButton.setOnClickListener {
            firstMove()
        }
        binding.oneImage.setOnClickListener {
            firstMove()
        }
        binding.oneLogo.setOnClickListener {
            firstMove()
        }

        binding.twoButton.setOnClickListener {
            secondMove()
        }
        binding.twoImage.setOnClickListener {
            secondMove()
        }
        binding.twoLogo.setOnClickListener {
            secondMove()
        }

        binding.threeButton.setOnClickListener { thirdMove() }
        binding.threeImage.setOnClickListener { thirdMove() }
        binding.threeLogo.setOnClickListener { thirdMove() }

        binding.fourButton.setOnClickListener { fourthMove() }
        binding.fourImage.setOnClickListener { fourthMove() }
        binding.fourLogo.setOnClickListener { fourthMove() }

        binding.fiveButton.setOnClickListener { fifthMove() }
        binding.fiveImage.setOnClickListener { fifthMove() }
        binding.fiveLogo.setOnClickListener { fifthMove() }

        binding.sixButton.setOnClickListener { sixthMove() }
        binding.sixImage.setOnClickListener { sixthMove() }
        binding.sixLogo.setOnClickListener { sixthMove() }

    }

    private fun firstMove() {
        val phone = "+34 934 52 19 90"
        val location =
            "https://www.google.com/maps/place/Restaurant+L'Oliv%C3%A9/@41.3890958,2.1626826,15z/data=!4m2!3m1!1s0x0:0x549059360b575c3b?sa=X&ved=2ahUKEwi4nM3ejdb-AhUoVKQEHTjPAb4Q_BJ6BAhjEAg"
        val reservation = "https://resercom.grupoliveslowfoods.com/es/node/add/reserva/1"
        val logoCover = R.drawable.olive_cover
        val logoWall = R.drawable.olive_wall
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
            phone,
            location,
            reservation,
            logoCover,
            logoWall
        )
        findNavController().navigate(action)
    }

    private fun secondMove() {
        val phone = "+34 932 21 21 11"
        val location =
            "https://www.google.com/maps/place/Barceloneta/@41.3758653,2.1854126,17z/data=!3m1!4b1!4m6!3m5!1s0x12a4a3ab864bf7eb:0x27a94cb1cebcce32!8m2!3d41.3758653!4d2.1876013!16s%2Fg%2F113fbdbx8"
        val reservation = "https://resercom.grupoliveslowfoods.com/es/node/add/reservab/2"
        val logoCover = R.drawable.barceloneta_cover
        val logoWall = R.drawable.barceloneta_wall
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
            phone,
            location,
            reservation,
            logoCover,
            logoWall
        )
        findNavController().navigate(action)
    }

    private fun thirdMove(){
        val phone = "+34 934 30 90 27"
        val location =
            "https://www.google.com/maps/place/Paco+Meralgo/@41.3916259,2.1524973,15z/data=!4m2!3m1!1s0x0:0x335fc4e792290e11?sa=X&ved=2ahUKEwiKrejCj9b-AhWDi_0HHWM2AlcQ_BJ6BAhMEAg"
        val reservation = "https://resercom.grupoliveslowfoods.com/es/node/add/reserva/3"
        val logoCover = R.drawable.paco_cover
        val logoWall = R.drawable.paco_wall
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
            phone,
            location,
            reservation,
            logoCover,
            logoWall
        )
        findNavController().navigate(action)
    }

    private fun fourthMove(){
        val phone = "+34 934 30 72 79"
        val location =
            "https://www.google.com/maps/place/Restaurant+BarcelonaMilano/@41.391104,2.149182,15z/data=!4m2!3m1!1s0x0:0x2d3515fbb652c38e?sa=X&ved=2ahUKEwiCga_qj9b-AhXpVaQEHSxxCkkQ_BJ6BAhNEAg"
        val reservation = "https://resercom.grupoliveslowfoods.com/es/node/add/reserva/4"
        val logoCover = R.drawable.barcelonamilano_cover
        val logoWall = R.drawable.barcelonamilano_wall
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
            phone,
            location,
            reservation,
            logoCover,
            logoWall
        )
        findNavController().navigate(action)
    }

    private fun fifthMove(){
        val phone = "+34 932 70 34 58"
        val location =
            "https://www.google.com/maps/place/Bar+Ca%C3%B1ete/@41.3791528,2.173125,15z/data=!4m2!3m1!1s0x0:0x1c77b2f8f4cdfb63?sa=X&ved=2ahUKEwifovGakNb-AhVzU6QEHcv0BY0Q_BJ6BAhHEAg"
        val reservation = "https://resercom.grupoliveslowfoods.com/es/node/add/reserva/7"
        val logoCover = R.drawable.canete_cover
        val logoWall = R.drawable.canete_wall
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
            phone,
            location,
            reservation,
            logoCover,
            logoWall
        )
        findNavController().navigate(action)
    }


    private fun sixthMove(){
        val phone = "+34 932 09 25 42"
        val location = "https://www.google.es/maps/place/C%2F+de+Muntaner,+331,+08021+Barcelona"
        val reservation = "https://baixas.es/"
        val logoCover = R.drawable.cover_baixa
        val logoWall = R.drawable.food
        val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
            phone,
            location,
            reservation,
            logoCover,
            logoWall
        )
        findNavController().navigate(action)
    }





}