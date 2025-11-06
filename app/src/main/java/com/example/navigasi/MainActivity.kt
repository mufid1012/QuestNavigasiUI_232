package com.example.navigasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.navigasi.ui.theme.NavigasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigasiTheme {
                Surface(modifier = Modifier) {
                    DataApp() // ⬅️ ini fungsi utama navigasi kamu
                }
            }
        }
    }
}
