package com.example.unscramble.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.flow.Flow

class CorrectGuessHistoryViewModel(application: Application) : AndroidViewModel(application) {
    private val correctGuessDao = AppDatabase.getInstance(application).correctGuessDao()

    val guesses: Flow<List<CorrectGuessEntity>> = correctGuessDao.observeAll()
}
