package com.app.grup.olive

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.grup.olive.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private lateinit var binding : FragmentDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentDetailsBinding.bind(view)

        val phone = DetailsFragmentArgs.fromBundle(requireArguments()).phone
        val location = DetailsFragmentArgs.fromBundle(requireArguments()).location
        val reservation = DetailsFragmentArgs.fromBundle(requireArguments()).reservation
        val logoCover = DetailsFragmentArgs.fromBundle(requireArguments()).logoCover
        val logoWall = DetailsFragmentArgs.fromBundle(requireArguments()).logoWall

        binding.detailsBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.detailsLogo.setImageResource(logoCover)
        binding.detailsWall.setImageResource(logoWall)

        binding.detailsReservation.setOnClickListener {
            openReservation(reservation)
        }
         if(reservation == "https://baixas.es/"){
           binding.detailsReservation2.text="WEB"
         }else{
             binding.detailsReservation2.text="RESERVAR"

         }
        binding.detailsReservation2.setOnClickListener {
            openReservation(reservation)
        }

        binding.detailsPhone.setOnClickListener {
            callPhoneNumber(phone)
        }

        binding.detailsPhone2.setOnClickListener {
            callPhoneNumber(phone)
        }

        binding.detailsPhone3.setOnClickListener {
            callPhoneNumber(phone)
        }

        binding.detailsLocation.setOnClickListener {
            openLocationInBrowser(location)
        }

        binding.detailsLocation2.setOnClickListener {
            openLocationInBrowser(location)
        }

        binding.detailsLocation3.setOnClickListener {
            openLocationInBrowser(location)
        }

    }

    private fun openReservation(reservation: String) {
        val builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(requireContext(), Uri.parse(reservation))
    }

    private fun callPhoneNumber(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        startActivity(intent)
    }

    private fun openLocationInBrowser(locationUrl: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(locationUrl))
        startActivity(intent)
    }



}