package com.betrybe.sociallogin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private val inputEmail: TextInputEditText by lazy {
        findViewById(R.id.email_text_input)
    }
    private val inputPassword: TextInputEditText by lazy {
        findViewById(R.id.input_password_text)
    }
    private val btnLogin: MaterialButton by lazy { findViewById(R.id.login_button) }
    private val inputEmailLayout: TextInputLayout by lazy {
        findViewById(R.id.email_text_input_layout)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val typedEmail = inputEmail.text.toString().trim()

            if (!validateEmail(typedEmail)) {
                inputEmailLayout.error = getString(R.string.email_warning)
            } else {
                inputEmailLayout.error = null
            }
        }

        val inputsWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }
            override fun afterTextChanged(s: Editable?) {
                checkFields()
            }
        }

        inputEmail.addTextChangedListener(inputsWatcher)
        inputPassword.addTextChangedListener(inputsWatcher)
    }

    private fun validateEmail(typedEmail: String): Boolean {
        val emailPattern = Regex(
        "^[A-Za-z0-9.]{2,}@[A-Za-z]{2,}(?:\\.[A-Za-z]*)+$"
        )

        return emailPattern.matches(typedEmail)
    }

    private fun checkFields() {
        val isFilledEmail = inputEmail.text.toString().trim().isNotEmpty()
        val isFilledPassword = inputPassword.text.toString().trim().isNotEmpty()

        btnLogin.isEnabled = isFilledEmail && isFilledPassword
    }
}
