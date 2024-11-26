package com.example.ulearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ulearn.ui.theme.UlearnTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            login()
        }
    }
}

@Composable
fun login(){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Login", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text("", fontSize = 30.sp)
        Box(modifier = Modifier.size(width = 300.dp, height = 450.dp)) {
            Column {
                Column (
                    modifier = Modifier.size(width = 300.dp, height = 80.dp)
                ){
                    Text("Username", fontSize = 15.sp, fontWeight = FontWeight.Bold, modifier =
                    Modifier.padding(horizontal = 8.dp))
                    Text("", fontSize = 10.sp)
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxSize(),
                        singleLine = true,
                        placeholder = { Text("Username", fontSize = 10.sp) }
                    )
                }

                Text("", fontSize = 10.sp)

                Column (modifier = Modifier.size(width = 300.dp, height = 80.dp)){
                    Text("Password", fontSize = 15.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 8.dp))
                    Text("", fontSize = 10.sp)
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxSize(),
                        singleLine = true,
                        placeholder = { Text("Password", fontSize = 10.sp) }
                    )
                }

                TextButton(onClick = {}) {
                    Text("Forgot ur password?", color = Color.Black)
                }

                TextButton(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)
                    .size(width = 300.dp, height = 60.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)) {
                    Text("Log in", color = Color.White, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                }

                Text("Or", modifier = Modifier.align(Alignment.CenterHorizontally).
                padding(vertical = 5.dp), fontSize = 15.sp)

                TextButton(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)
                    .size(width = 300.dp, height = 60.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue)) {
                    Text("Continue with Facebook", color = Color.White, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                }

                Text("", fontSize = 10.sp)
                TextButton(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)
                    .size(width = 300.dp, height = 60.dp)
                    .border(width = 2.dp, color = Color.Black, shape = MaterialTheme.shapes.extraLarge),
                    colors = ButtonDefaults.buttonColors(Color.White)) {
                    Text("Continue with Google", color = Color.Black, fontSize = 15.sp, fontWeight = FontWeight.Bold)
                }

            }

        }
        Row {
            Text("Not have accout yet ?")
            Text("Sign up", fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 2.dp))
        }
        Text("", fontSize = 2.sp)
        Row {
            Text("Are you a Mentor?")
            Text("Get Started here", fontWeight = FontWeight.Bold, modifier = Modifier.padding(horizontal = 2.dp))
        }
    }
}

@Composable
fun background(){
    Box(
        modifier = with (Modifier){
            fillMaxSize()
                .paint(
                    painterResource(id = R.drawable.background),
                    contentScale = ContentScale.FillHeight)

        })
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
            Text("Learn The Step", fontSize = 50.sp, color = Color.White)
            Surface(
                color = Color.White,
                modifier = Modifier.size(
                    width = 300.dp,
                    height = 40.dp
                )

            )
            {
                Text("Achieve the greatness", fontSize = 30.sp, color = Color.Black)
            }
            Text("to be honest we definetely cooked", fontSize = 20.sp, color = Color.White,
                modifier = Modifier.size(width = 300.dp, height = 20.dp))

            Text("", fontSize = 50.sp)

            TextButton(onClick = {
            },
                modifier = Modifier.size(width = 300.dp, height = 80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,

                    )) {
                Text(
                    "Get Started", color = Color.Black, fontSize = 35.sp, fontWeight = FontWeight.Bold
                )
            }


//        Button(onClick = {null}, modifier = Modifier.size(width = 250.dp, height = 80.dp) ,colors = ButtonDefaults.buttonColors(
//            containerColor = Color.White,
//        ),
//        ) {
//            Text (text = "Get Started",
//                color = Color.Black,
//                modifier = Modifier.fillMaxSize()
//
//

    }

    }




