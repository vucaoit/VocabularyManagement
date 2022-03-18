package com.example.vocabularymanagement.views.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import com.example.vocabularymanagement.R

class RegisterFragment : Fragment() {
    private lateinit var btnCreate: Button
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnCreate = view.findViewById(R.id.register_btn_create)
        btnLogin = view.findViewById(R.id.register_btn_login)
        btnLogin.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_registerFragment2_to_loginFragment2)
        }
        btnCreate.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_registerFragment2_to_loginFragment2)
        }
    }
}