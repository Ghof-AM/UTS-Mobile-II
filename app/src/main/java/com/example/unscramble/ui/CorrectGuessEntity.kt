package com.example.unscramble.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "correct_guesses")
data class CorrectGuessEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long = 0,
    @ColumnInfo(name = "word")
    val word: String,
    @ColumnInfo(name = "guessedAt")
    val guessedAt: Long = System.currentTimeMillis(),
)

