package com.example.prk4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import java.lang.reflect.Modifier

@Composable
fun ActivityPertama(modifier: Modifier){
    Column (
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(id=R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
