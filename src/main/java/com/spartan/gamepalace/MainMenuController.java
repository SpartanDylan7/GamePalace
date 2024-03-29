package com.spartan.gamepalace;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {
        @FXML
        private Button bjBtn;

        @FXML
        private Button tttBtn;
//opens the blackjack game
        @FXML
        void onBjClick(ActionEvent event) {
            ViewManager.switchTo(View.BLACKJACK);
        }
//opens the tictactoe game
        @FXML
        void onTTTClick(ActionEvent event) {
            ViewManager.switchTo(View.TICTACTOE);
        }
//opens the minesweeper game
        @FXML
        void onMsClick(ActionEvent event) {
            System.out.println("MineSweeper");
        ViewManager.switchTo(View.MINESWEEPER);
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
