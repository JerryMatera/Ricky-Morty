package io.github.jerrymatera.rickymorty.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import io.github.jerrymatera.rickymorty.presentation.ui.MainScreen
import io.github.jerrymatera.rickymorty.presentation.ui.theme.RickyMortyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContent {
            RickyMortyTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showSystemUi = true,showBackground = true)
@Composable
fun DefaultPreview() {
    RickyMortyTheme {
        MainScreen()
    }
}