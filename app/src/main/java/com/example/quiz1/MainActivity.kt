package com.example.quiz1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz1.ui.theme.Quiz1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quiz1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth()
        , verticalArrangement = Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopLogo()
        MiddleBox()
        Spacer(modifier = Modifier.height(130.dp))
        BottomIcon()
    }

}

@Composable
fun TopLogo(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.hsi_sakinah_logo)
            , contentDescription = null
            , modifier = Modifier.size(100.dp)
        )
    }

}

@Composable
fun MiddleBox(){
    Column(
        modifier = Modifier
            .background(
                color = Color.LightGray, shape = RoundedCornerShape(20.dp)
            )
            .padding(8.dp)
            .height(400.dp)
            .width(350.dp),
        verticalArrangement = Arrangement.Center
        , horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Isi Form CV dulu, yuk!"
            , textAlign = TextAlign.Center
            , fontWeight = FontWeight.Bold
            , fontSize = 25.sp

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Untuk bisa memulai pencarian pasangan,\n" +
                    "Antum harus mengisi form CV antum terlebih\n" +
                    "dahulu"
            , fontSize = 15.sp
            , textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.pngwing_com)
            , contentDescription = null
            , modifier = Modifier.size(150.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row (
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Button( onClick = { /* Do something! */ }
                , shape = RoundedCornerShape(8.dp)
                , colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color.Transparent
                    , contentColor = Color.Blue
                )
                , border = BorderStroke(
                    width = 1.dp
                    , color = Color.Blue)
                , modifier = Modifier
                    .height(40.dp)
                    .width(150.dp)

            ) {
                Text("Lewati")
            }
            Button( onClick = { /* Do something! */ }
                , shape = RoundedCornerShape(8.dp)
                , colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Color.Blue
                    , contentColor = Color.White
                )
                , modifier = Modifier
                    .height(40.dp)
                    .width(150.dp)
            ) {
                Text("Isi CV")
            }
        }
    }

}

@Composable
fun BottomIcon(){
    Row(
        horizontalArrangement = Arrangement.spacedBy(70.dp)

    ){
        Column (
            verticalArrangement = Arrangement.Center
            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(
                    id = R.drawable.baseline_home_black_48)
                , contentDescription = null)
            Text(text = "Home")
        }
        Column (
            verticalArrangement = Arrangement.Center
            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(
                    id = R.drawable.baseline_search_black_48)
                , contentDescription = null)
            Text(text = "Pencarian")
        }
        Column (
            verticalArrangement = Arrangement.Center
            , horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(
                    id = R.drawable.baseline_perm_identity_black_48)
                , contentDescription = null)
            Text(text = "Profil")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Quiz1Theme {
        Greeting("Android")
    }
}