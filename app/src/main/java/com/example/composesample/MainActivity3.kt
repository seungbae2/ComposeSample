package com.example.composesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesample.ui.theme.ModifierTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModifierTheme {
                ModifierEx()
            }
        }
    }
}

@Composable
fun ModifierEx() {
//    Button(onClick = {}) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }

//    Button(
//        onClick = {},
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }

//    Button(
//        onClick = {},
//        modifier = Modifier.height(100.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }


//    Button(
//        onClick = {},
//        modifier = Modifier
//            .height(100.dp)
//            .width(200.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }

//    Button(
//        onClick = {},
//        modifier = Modifier.size(200.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }

//    Button(
//        onClick = {},
//        modifier = Modifier.size(200.dp).background(Color.Red)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }

//    Button(
//        colors =  ButtonDefaults.buttonColors(
//            backgroundColor = Color.Magenta,
//            contentColor = Color.Cyan,
//        ),
//        onClick = {},
//        modifier = Modifier.size(200.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }

//    Button(
//        colors =  ButtonDefaults.buttonColors(
//            backgroundColor = Color.Magenta,
//            contentColor = Color.Cyan,
//        ),
//        onClick = {},
//        modifier = Modifier.size(200.dp).padding(10.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text("Search")
//    }

    // 스탭 8: Button에 enabled를 false로 설정하고, Text의
    // modifier에 clickable을 넣어봅시다.
//    Button(
//        colors =  ButtonDefaults.buttonColors(
//            backgroundColor = Color.Magenta,
//            contentColor = Color.Cyan,
//        ),
//        onClick = {},
//        enabled = false,
//        modifier = Modifier.size(200.dp).padding(10.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Filled.Search,
//            contentDescription = null
//        )
//        Spacer(
//            modifier = Modifier.size(ButtonDefaults.IconSpacing)
//        )
//        Text(
//            "Search",
//            modifier = Modifier.clickable {}
//        )
//    }

    // 스탭 9: Text의 modifier에 offset를 설정하고 x 파라미터를
    // 설정합니다.

    Button(
        colors =  ButtonDefaults.buttonColors(
            backgroundColor = Color.Magenta,
            contentColor = Color.Cyan,
        ),
        onClick = {},
        modifier = Modifier.size(200.dp).padding(10.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
                .background(Color.Blue)
        )
        Text(
            "Search",
            modifier = Modifier
                .offset(x = 10.dp)
                .background(Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    ModifierTheme {
        ModifierEx()
    }
}