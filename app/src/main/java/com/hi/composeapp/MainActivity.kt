package com.hi.composeapp

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hi.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { // from here main task start,here we have to code  //
            ComposeAppTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    busapp("Dhun")
                }
            }
        }
    }
}
@Composable
fun busapp(name: String) {
}

val text = mutableStateOf("dd/mm/yyyy")

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeAppTheme {

        Column {
            Text("                          My Guide                         ",modifier = Modifier.padding(10.dp),
                 color = Color.Blue,
                 fontWeight = FontWeight.Bold,
                 fontStyle = FontStyle.Italic,
                 fontFamily = FontFamily.Serif,

                )
//            TextField(modifier = Modifier.padding(10.dp),
//                value = "dd/mm/yyyy", onValueChange = {text.value = it},
//                label = { Text("Enter date",
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 16.sp,
//                    fontStyle = FontStyle.Italic,
//                    fontFamily = FontFamily.Serif
//                )},
//moi type korim.. olop rua.
            Row() {
                Text("Monday")
                Text("0 Month, Year")
            }

            Text("12:00 am")
            Row() {
                Row {
                    Text("Status:")
                    Text("Active")

                }
                Row{
                    Text("Route:")
                    Text("Jorhat to JEC")
                }
            }
            Row() {
                Text("Your location:")
                Text("Jorhat Engineering College")
            }

            Text("Distance from nearest stop")
            Text("X m - 00min")
            Text("Walking distance")
        }

    }
}




