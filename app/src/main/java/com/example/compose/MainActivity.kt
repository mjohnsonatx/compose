package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppUI()
        }
    }
}

@Composable
fun BoxExample(){
    Box(modifier = Modifier
        .background(color = Color.Green)
        .size(100.dp, 300.dp)
    ){
        Box (modifier = Modifier
            .background(color = Color.Yellow)
            .size(125.dp, 100.dp)
            .align(Alignment.TopEnd)
        ){

        }

        Text(text = "hello", style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .background(color = Color.White)
                .size(90.dp, 50.dp)
                .align(Alignment.BottomCenter)
                )
    }
}

@Composable
fun BoxExample2(){
    Box (
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize()
    ){
        Text(text = "TopStart", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopStart)
        )
        Text(text = "TopCenter", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopCenter)
        )
        Text(text = "TopEnd", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.TopEnd)
        )
        Text(text = "CenterStart", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterStart)
        )
        Text(text = "Center", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.Center)
        )
        Text(text = "CenterEnd", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.CenterEnd)
        )
        Text(text = "BottomStart", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomStart)
        )
        Text(text = "BottomCenter", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomCenter)
        )
        Text(text = "BottomEnd", style = MaterialTheme.typography.bodySmall,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .align(Alignment.BottomEnd)
        )

    }
}

@Composable
fun BoxExample3(){
    Box {
        Image(
            painter = painterResource(id = R.drawable.climbing_pose),
            contentDescription = "sample pic")
        Text(
            text = "sample pic in box",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomStart)
        )

        Button(
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color.DarkGray,
                containerColor = Color.White
            ),
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(10.dp)
                .border(5.dp, Color.DarkGray, RectangleShape)
            ) {
            Text("Add to cart?")
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Red,
        textAlign = TextAlign.Center,
        // modifiers are used to process user input, make UI aspects
        // interactive; clickable, zoomable....
        modifier = Modifier
            .background(Color.Yellow)
            .border(2.dp, color = Color.Green)
            .padding(10.dp)
    )
}

@Composable
fun AppUI() {

    Row(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly,

    ) {
        Greeting("Michael")
        Greeting("John")
        Greeting("James")
    }

    BoxExample3()

    //BoxExample2()
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTheme {
        AppUI()
    }
}