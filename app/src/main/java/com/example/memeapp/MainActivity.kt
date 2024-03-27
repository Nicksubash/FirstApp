package com.example.memeapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.memeapp.ui.theme.MemeAppTheme

class MainActivity : ComponentActivity() {
    lateinit var userNameInput:EditText
    lateinit var Password_input:EditText
    lateinit var login_btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userNameInput=findViewById(R.id.userNameInput)
        Password_input=findViewById(R.id.Password_input)
        login_btn=findViewById(R.id.login_btn)

        login_btn.setOnClickListener{
            val userName=userNameInput.text.toString()
            val password=Password_input.text.toString()
            Log.i("Test credentials","Username:$userName and Password: $password")
        }

    }
}
