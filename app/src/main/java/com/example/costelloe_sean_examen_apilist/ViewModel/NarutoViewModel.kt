package com.example.costelloe_sean_examen_apilist.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.costelloe_sean_examen_apilist.Moduls.*
import com.example.costelloe_sean_examen_apilist.Retrofit.Repository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NarutoViewModel: ViewModel() {

    //Retrofit
    private val repository = Repository()

    private val _characters = MutableLiveData<Data?>(null)
    val characters = _characters

    private val _isLoading = MutableLiveData(true)
    val isLoading = _isLoading

    //Retrofit methods
    fun getCharacters() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = repository.getAllCharacter()
            withContext(Dispatchers.Main) {
                if(response.isSuccessful) {
                    _characters.value = response.body()
                    _isLoading.value = false
                }else {
                    Log.e("ERROR_RETROFIT", "ERROR_RETROFIT: " + response.message())
                }
            }
        }
    }

}