package com.example.tic_tac_toe_matala1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object GameData {
    private var _gameModel:MutableLiveData<GameModel> = MutableLiveData()
    var gameModel : LiveData<GameModel> = _gameModel

    fun saveGameModel(model : GameModel){
        _gameModel.postValue(model)
    }
}