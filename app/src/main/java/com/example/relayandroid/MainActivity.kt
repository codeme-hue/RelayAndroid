package com.example.relayandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.relayandroid.newscard.NewsCard
import com.example.relayandroid.ui.theme.RelayAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RelayAndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NewsList()
                }
            }
        }
    }
}

@Composable
fun NewsList() {
    LazyColumn{
        item(20) {
            NewsCard()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RelayAndroidTheme {
        NewsList()
    }
}