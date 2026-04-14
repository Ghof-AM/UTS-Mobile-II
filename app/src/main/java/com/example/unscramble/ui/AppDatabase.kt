package com.example.unscramble.ui

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [GameUiState::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun HistoryDao(): GameUiStateDAO
}