package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab04.ui.theme.Lab04Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        Greeting("Android")
    }
}

@Composable
fun MyProgressBar() {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(color = Color.Blue)
        LinearProgressIndicator(modifier = Modifier.padding(top = 8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProgressBar() {
    MyProgressBar()
}

@Composable
fun MyIconControls() {
    Row(modifier = Modifier.padding(16.dp)) {
        Icon(Icons.Default.Favorite, contentDescription = "Favorite", tint = Color.Red)
        Spacer(Modifier.width(10.dp))
        Icon(Icons.Default.Share, contentDescription = "Share", tint = Color.Blue)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIconControls() {
    MyIconControls()
}

@Composable
fun MyBottomNavigation() {
    BottomAppBar {
        Text("Inicio", modifier = Modifier.weight(1f), textAlign = TextAlign.Center)
        Text("Perfil", modifier = Modifier.weight(1f), textAlign = TextAlign.Center)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomNavigation() {
    MyBottomNavigation()
}
