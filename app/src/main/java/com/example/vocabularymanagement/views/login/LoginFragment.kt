package com.example.vocabularymanagement.views.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.navigation.Navigation
import com.example.vocabularymanagement.R
import com.example.vocabularymanagement.views.main.MainActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class LoginFragment : Fragment() {
    private lateinit var btnLogin: Button
    private lateinit var btnCreate: Button
    private lateinit var btnForgotPassword: Button
    private lateinit var btnShowPassword: ImageButton
    private lateinit var edtPassword:EditText
    private var isShowPass = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().title = "Login"
        btnCreate = view.findViewById(R.id.login_btn_create)
        btnLogin = view.findViewById(R.id.login_btn_login)
        btnShowPassword = view.findViewById(R.id.login_btn_show_password)
        btnForgotPassword = view.findViewById(R.id.login_btn_forgotpassword)
        edtPassword = view.findViewById(R.id.login_edt_password)

        btnCreate.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_loginFragment2_to_registerFragment2)
        }
        btnLogin.setOnClickListener {
            requireContext().startActivity(Intent(requireContext(), MainActivity::class.java))
        }
        btnForgotPassword.setOnClickListener {
            showBottomSheet(requireContext())
        }
        btnShowPassword.setOnClickListener {
            if(!isShowPass){
                btnShowPassword.setImageResource(R.drawable.ic_eye_enable)
                edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                isShowPass=!isShowPass
            }
            else{
                btnShowPassword.setImageResource(R.drawable.ic_eye_disable)
                edtPassword.inputType = InputType.TYPE_TEXT_VARIATION_PASSWORD or InputType.TYPE_CLASS_TEXT
                isShowPass=!isShowPass
            }
        }
    }
    fun showBottomSheet(context: Context) {
        val dialog = BottomSheetDialog(context)
        val view = layoutInflater.inflate(R.layout.dialog_layout, null)
        dialog.setContentView(view)
        dialog.show()
    }
}