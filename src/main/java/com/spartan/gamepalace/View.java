package com.spartan.gamepalace;

public enum View {
    BLACKJACK("BlackJack-view.fxml"),
    TICTACTOE("TicTacToe-view.fxml"),
    MAINMENU("MainMenu-view.fxml"),
    MINESWEEPER("MineSweeper-view.fxml");

    private final String fileName;

    View(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }
}
