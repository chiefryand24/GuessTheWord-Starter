package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int, finalWord: String) : ViewModel() {
    var score = finalScore
    var word = finalWord
    init {
        Log.i("ScoreViewModel", "Final score is $finalScore and final word is $finalWord")
    }
}