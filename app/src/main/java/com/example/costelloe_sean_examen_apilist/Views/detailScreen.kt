package com.example.costelloe_sean_examen_apilist.Views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.costelloe_sean_examen_apilist.ViewModel.NarutoViewModel

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun DetailScreen(narutoVM: NarutoViewModel) {
    val character by narutoVM.character.observeAsState(null)
    Card(
        border = BorderStroke(2.dp, Color.LightGray),
        modifier = Modifier
    ) {
        Row {
            GlideImage(
                model = character!!.images.get(0),
                contentDescription = "Character Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )
            Column {
                Text("Name: " + character!!.name)
                Text("jutsu: " + character!!.jutsu)
                Text("Tool: " + character!!.tools.get(0))
            }
        }
    }
}