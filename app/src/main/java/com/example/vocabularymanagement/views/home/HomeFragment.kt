package com.example.vocabularymanagement.views.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.vocabularymanagement.R
import com.example.vocabularymanagement.views.login.LoginActivity

class HomeFragment : Fragment() {
private lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().title="Home"
        btnLogin = view.findViewById(R.id.home_btn_login)
        btnLogin.setOnClickListener{
            requireActivity().startActivity(Intent(requireContext(),LoginActivity::class.java))
        }
    }
}