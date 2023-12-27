package com.alesmihovec.kalkulator

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.input.MouseEvent

class KalkulatorCtrl {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }

    @FXML
    fun test(mouseEvent: MouseEvent) {
        println("test")
    }
}