package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.layout.ColumnScopeInstance.weight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}


@Composable
fun BusinessCardApp(modifier: Modifier = Modifier){
    Column(
        modifier
            .fillMaxSize()
            .background(Color.Green),
    ) {
        val image = painterResource(R.drawable.android_logo)
        Column(
            modifier
                .weight(3f)
                .background(Color.Green)
                .background(Color(0xFF154360))
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(80.dp)
            )
            Text(text = "Jennifer Doe", color = Color.White, fontSize = 35.sp)
            Text(text = "Android Developer Extraordinaire",  color = Color(0xFF3ddc84), fontWeight = FontWeight.Bold)





        }

        Column(modifier.weight(1f))
        {
            SecondSection(modifier.weight(1f))
        }


    }
}


@Composable
fun SecondSection(modifier: Modifier) {
    Column(
        modifier
            .background(Color.DarkGray)
            .background(Color(0xFF154360))
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth(1f)
                .width(12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row {

            Icon(modifier =Modifier.weight(1f,true),
                painter = painterResource(R.drawable.ic_call),
                contentDescription = null, tint = Color(0xFF3ddc84))
            Text(modifier =Modifier.weight(4f,true),
                text = "+11 (123) 444 555 666",
                color = Color.White)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth(1f)
                .width(12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row {

            Icon(modifier =Modifier.weight(1f,true),
                painter = painterResource(R.drawable.ic_share),
                contentDescription = null, tint = Color(0xFF3ddc84))

            Text(modifier =Modifier.weight(4f,true),
                text = "@AndroidDev", color = Color.White)
        }
        Spacer(modifier = Modifier.height(8.dp))



        Divider(
            color = Color.LightGray,
            modifier = Modifier
                .fillMaxWidth(1f)
                .width(12.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row {

            Icon(
                modifier = Modifier.weight(1f, true),
                painter = painterResource(R.drawable.ic_email),
                contentDescription = null, tint =  Color(0xFF3ddc84)
            )

            Text(
                modifier =Modifier.weight(4f,true),
                text = "jen.doe@android.com", color = Color.White)

        }
        Spacer(modifier = Modifier.height(56.dp))
    }
}





@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}