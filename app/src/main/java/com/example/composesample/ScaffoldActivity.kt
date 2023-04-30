package com.example.composesample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composesample.ui.theme.ScaffoldTheme

class ScaffoldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScaffoldEx()
                }
            }
        }
    }
}

@Composable
fun CheckBoxWithContent(
    checked: Boolean,
    toggleState: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { toggleState() }
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = { toggleState() },
        )
        content()
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldEx() {
    var checked by remember { mutableStateOf(false) }

    Scaffold(topBar = {
        // 스텝 1: `topBar`를 `TopAppBar`로 채워 봅시다.
        TopAppBar(
            navigationIcon = {
                             IconButton(onClick = { /*TODO*/ }) {
                                 Image(
                                     imageVector = Icons.Filled.ArrowBack,
                                     contentDescription = "뒤로가기"
                                 )
                             }
            },
            title = {
                Text(text="Scaffold App")
            }
        )
    },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                
            }
        }
    ) {
        Surface(modifier = Modifier.padding(8.dp)) {
            // 스텝 2: 아래에 CheckBoxWithContent를 넣어봅시다.
            CheckBoxWithContent(
                checked = checked,
                toggleState = { checked = !checked }
            ) {
                Text(text = "컴포즈를 좋아합니다.")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview16() {
    ScaffoldTheme {
        ScaffoldEx()
    }
}