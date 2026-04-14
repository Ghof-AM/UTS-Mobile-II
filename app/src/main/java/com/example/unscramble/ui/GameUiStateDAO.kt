package com.example.unscramble.ui

import androidx.room.Query

interface GameUiStateDAO {
    @Query("SELECT * FROM History ")
    suspend fun getHistory(): List<GameUiState>
}