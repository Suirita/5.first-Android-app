package com.example.l7ambelbar9ou9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.l7ambelbar9ou9.ui.theme.L7amBelBar9ou9Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            L7amBelBar9ou9Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LocalCraft(
                        name = "l7am bel bar9ou9",
                        description = "Meat with prunes is one of the most delicious Moroccan dishes. Therefore, cooking it is considered a way to honor guests and it is recommended at parties and weddings.",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LocalCraft(name: String, description: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.tata)

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE5F5FC))
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        ) {
            Card(
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.cardElevation(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Header(name)
                    Spacer(modifier = Modifier.height(16.dp))
                    Description(description)
                }
            }
        }
    }
}


@Composable
fun Header(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.l7am_bel_bar9ou9)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .size(200.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(8.dp)
        )
    }
}

@Composable
fun Description(description: String, modifier: Modifier = Modifier) {
    Text(
        text = description,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        textAlign = TextAlign.Center,
        modifier = modifier.padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    L7amBelBar9ou9Theme {
        LocalCraft(
            "l7am bel bar9ou9",
            "Meat with prunes is one of the most delicious Moroccan dishes. Therefore, cooking it is considered a way to honor guests and it is recommended at parties and weddings."
        )
    }
}
