package com.betrybe.sociallogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private val inputEmail: TextInputEditText by lazy { findViewById(R.id.email_text_input_layout) }
    private val btnLogin: MaterialButton by lazy { findViewById(R.id.login_button) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val typedEmail = inputEmail.text.toString().trim()

            if (typedEmail.isEmpty()) {
                inputEmail.error = "Email é obrigatório"
            } else if (!validateEmail(typedEmail)) {
                inputEmail.error = "Email inválido"
            } else {
                inputEmail.error = null
            }
        }
    }

    private fun validateEmail(typedEmail: String): Boolean {
        val emailPattern = Regex(
        "^[A-Za-z0-9.]+" +
               "@" +
               "[A-Za-z]+" +
               "\\." +
               "[A-Za-z]+$"
        )

        return emailPattern.matches(typedEmail)
    }
}
