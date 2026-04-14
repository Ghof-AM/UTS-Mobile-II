package com.example.unscramble.ui

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CorrectGuessDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(guess: CorrectGuessEntity)

    @Query("SELECT * FROM correct_guesses ORDER BY guessedAt DESC")
    fun observeAll(): Flow<List<CorrectGuessEntity>>
}
