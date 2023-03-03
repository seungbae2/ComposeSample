package com.example.composesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesample.ui.theme.SurfaceTheme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurfaceTheme {
                Greeting4("Android")
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
//    Surface(
//        modifier = Modifier.padding(5.dp)
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 스텝 1: Surface에 elevation을 설정합시다.

//    Surface(
//        modifier = Modifier.padding(5.dp),
//        elevation = 5.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 스텝 2: border의 값을 설정해봅시다.

//    Surface(
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        ),
//        modifier = Modifier.padding(5.dp),
//        elevation = 5.dp
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 스텝 3: Surface의 shape도 설정해봅시다.

//    Surface(
//        border = BorderStroke(
//            width = 2.dp,
//            color = Color.Magenta
//        ),
//        modifier = Modifier.padding(5.dp),
//        elevation = 5.dp,
//        shape = CircleShape
//    ) {
//        Text(
//            text = "Hello $name!",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    // 스텝 4: color를 지정합시다.
    // MaterialTheme.colors에서 primary, error,
    // background, surface, secondary 등을 지정해봅시다.
    // contentColor가 자동으로 선택됩니다.

    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta
        ),
        modifier = Modifier.padding(5.dp),
        elevation = 5.dp,
        shape = CircleShape,
        color = MaterialTheme.colors.error
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    SurfaceTheme {
        Greeting4("Android")
    }
}