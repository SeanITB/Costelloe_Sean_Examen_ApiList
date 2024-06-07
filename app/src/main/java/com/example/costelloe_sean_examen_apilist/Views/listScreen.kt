package com.example.costelloe_sean_examen_apilist.Views

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.costelloe_sean_examen_apilist.Moduls.Character
import com.example.costelloe_sean_examen_apilist.ViewModel.NarutoViewModel

@Composable
fun ListScreen(narutoVM: NarutoViewModel, navController: NavController, modifier: Modifier = Modifier) {
    val characters by narutoVM.characters.observeAsState(null)
    val isLoading by narutoVM.isLoading.observeAsState(true)
    if (isLoading) {
        Text("Loading...")
    } else {
        Log.i("RETOFIT", "RETOFIT values: " + characters)
        LazyColumn() {
            items(characters!!.characters) {
                NarutoItem(it)
            }

        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun NarutoItem(character: Character) {
    Card(
        border = BorderStroke(2.dp, Color.LightGray),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row {
            GlideImage(
                model = character.images.get(0),
                contentDescription = "Character Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp)
            )
            Column {
                Text(character.name)
            }

        }
    }
}