package com.example.unscramble.ui

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "History")
data class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)

