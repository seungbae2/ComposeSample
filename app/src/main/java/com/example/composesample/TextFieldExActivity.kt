package com.example.composesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesample.ui.theme.ComposeSampleTheme
import com.example.composesample.ui.theme.TextFieldTheme

class TextFieldExActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldTheme {
                Greeting2()
            }
        }
    }
}

@Composable
fun Greeting2() {
    var name by remember { mutableStateOf("Tom") }

    Column(modifier = Modifier.padding(16.dp)) {
        // 스텝 1: TextField를 Text위에 만듭니다.
        // value와 onValueChanged는 비워둡시다.
//        TextField(value = "Tom", onValueChange = {})

        // 스텝 2: Text에 Android 대신 TextField 입력을
        // 출력하게 합시다. mutableStateOf("") 필드를
        // 하나 만듭시다.
//        TextField(value = name, onValueChange = { name = it })

        // 스텝 3: TextField에 label을 추가합시다.
        // 내용에는 `Text("Name")`을 채워봅시다.
//        TextField(
//            value = name,
//            label = {
//                    Text("이름")
//            },
//            onValueChange = { name = it }
//        )

        // 스텝 4: TextField와 Text 사이에 Spacer를 넣어 8.dp
        // 간격을 줍시다.
//        TextField(
//            value = name,
//            label = {
//                Text("이름")
//            },
//            onValueChange = { name = it }
//        )
//        Spacer(modifier = Modifier.size(8.dp))

        // 스텝 5: TextField를 OutlinedTextField로 변경해봅시다.
        OutlinedTextField(
            value = name,
            label = {
                Text("이름")
            },
            onValueChange = { name = it }
        )
        Spacer(modifier = Modifier.size(8.dp))

        Text(text = "Hello $name")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview13() {
    ComposeSampleTheme {
        Greeting2()
    }
}