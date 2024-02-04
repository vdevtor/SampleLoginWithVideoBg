package com.vitorthemyth.sampleloginwithvideobg

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.vitorthemyth.sampleloginwithvideobg.ui.theme.SampleLoginWithVideoBgTheme
import com.vitorthemyth.sampleloginwithvideobg.ui.theme.login.Login

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleLoginWithVideoBgTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray)
                ) {
                    Login(getVideoUri())
                }
            }
        }
    }

    private fun getVideoUri() : Uri{
        val rawId = resources.getIdentifier("sponge_live_bg","raw",packageName)
        val videoUri = "android.resource://$packageName/$rawId"
        return Uri.parse(videoUri)
    }
}

