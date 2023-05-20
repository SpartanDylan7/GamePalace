package com.spartan.gamepalace;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javax.sound.midi.MidiChannel;
import java.util.ArrayList;
import java.util.List;

public class MineSweeperController {

    @FXML
    private Text bombcountLbl;

    @FXML
    private Button defuseBtn;
//called when you defuse the bombs
    @FXML
    void onDefuseClick(ActionEvent event) {
        tilesList.forEach(Tile::openFlags);
    }
//starts a new game
    @FXML
    void onGameClick(ActionEvent event) {
        onNewGame();
    }
//goes back to the main menu
    @FXML
    void onMenuClick(ActionEvent event) {
        ViewManager.switchTo(View.MAINMENU);
    }

    @FXML
    private Pane gamePane;
    @FXML
    private ChoiceBox<String> gameLevel;

    private static final int TILE_SIZE = 40;
    private static final int W = 800;
    private static final int H = 400;
    private static final int X_TILES = W / TILE_SIZE;
    private static final int Y_TILES = H / TILE_SIZE;
    private final Tile[][] grid = new Tile[X_TILES][Y_TILES];
    private final List<Tile> minesList = new ArrayList<>();
    private final List<Tile> tilesList = new ArrayList<>();
    private MediaPlayer player;
    private boolean gameOver = false;
    private double level = 0.15; // 0.15 = 15% bombs
    private MidiChannel channel;
    private final IntegerProperty flags = new SimpleIntegerProperty();
    int bombcount;
//called when minesweeper opens
    @FXML
    private void initialize() {
        // setting size and content
        gamePane.setPrefSize(W, H);
        gamePane.getChildren().add(createContent());

        // flagged label will keep track of Tiles' flags

        gameLevel.getItems().addAll("Hard", "Medium", "Easy");
        gameLevel.getSelectionModel().select(1); // Medium Level
        gameLevel.setStyle("-fx-font-family: Roboto Bold; -fx-background-color: Orange;");
        gameLevel.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                case "Easy" -> level = 0.05;// 5% bombs
                case "Medium" -> level = 0.15;// 15% bombs
                case "Hard" -> level = 0.25; // 25% bombs
            }
            onNewGame();
        });
    }
//dynamically creates a new board with different bomb locations
    @FXML
    private void onNewGame() {
        gameOver = false;
        gamePane.getChildren().removeAll();
        gamePane.getChildren().add(createContent());

    }
//called when you lose
    private void gameOver() {
        gameOver = true;
        minesList.forEach(Tile::open);
    }
//creates the tiles dynamically with bombs and starts the game
    public Parent createContent() {

        Pane root = new Pane();
        root.setPrefSize(W, H);

        minesList.clear();
        tilesList.clear();
        flags.setValue(0);

        for (int y = 0; y < Y_TILES; y++) {
            for (int x = 0; x < X_TILES; x++) {
                Tile tile = new Tile(x, y, Math.random() < level);

                grid[x][y] = tile;
                root.getChildren().add(tile);
            }
        }

        for (int y = 0; y < Y_TILES; y++) {
            for (int x = 0; x < X_TILES; x++) {
                Tile tile = grid[x][y];

                if (tile.hasBomb)
                    continue;

                long bombs = getNeighbors(tile).stream().filter(t -> t.hasBomb).count();

                if (bombs > 0)
                    tile.text.setText(String.valueOf(bombs));
            }
        }
        bombcountLbl.setText("\uD83D\uDEA9" + minesList.size());
        bombcount = minesList.size();
        return root;

    }
//gets the amount of bombs a tile is touching
    private List<Tile> getNeighbors(Tile tile) {
        List<Tile> neighbors = new ArrayList<>();

        // ttt
        // tXt
        // ttt

        int[] points = new int[]{
                -1, -1,
                -1, 0,
                -1, 1,
                0, -1,
                0, 1,
                1, -1,
                1, 0,
                1, 1
        };

        for (int i = 0; i < points.length; i++) {
            int dx = points[i];
            int dy = points[++i];

            int newX = tile.x + dx;
            int newY = tile.y + dy;

            if (newX >= 0 && newX < X_TILES
                    && newY >= 0 && newY < Y_TILES) {
                neighbors.add(grid[newX][newY]);
            }
        }

        return neighbors;
    }
//code for the tiles
    private class Tile extends StackPane {
        private final int x, y;
        private final boolean hasBomb;
        private boolean isOpen;
        private final Rectangle border = new Rectangle(TILE_SIZE - 2, TILE_SIZE - 2, Color.rgb(14, 172, 9));
        private final Circle circle = new Circle(TILE_SIZE / 2 - 2, Color.rgb(13, 145, 9));
        private final Text text = new Text();
        private final Text flagText = new Text("\uD83D\uDEA9");


        public Tile(int x, int y, boolean hasBomb) {
            this.x = x;
            this.y = y;
            this.hasBomb = hasBomb;
            tilesList.add(this);
            if (hasBomb) {
                minesList.add(this);
            }

            border.setStroke(Color.DARKGREEN);

            text.setFont(Font.font(18));
            text.setFill(Color.WHITE);
            text.setText(hasBomb ? "\uD83D\uDCA3" : "");
            flagText.setFill(Color.RED);
            text.setVisible(false);
            flagText.setFont(Font.font(25));
            flagText.setVisible(false);
            // Diag
//            text.setVisible(true);
//            text.setFill(Color.WHITE);

            getChildren().addAll(border, circle, text, flagText);

            setTranslateX(x * TILE_SIZE);
            setTranslateY(y * TILE_SIZE);

            setOnMouseClicked(event -> {
                if (event.getButton() == MouseButton.PRIMARY) {
                    if (!gameOver) {
                        if (flagText.isVisible()) {
                            flagText.setVisible(false);
                        }
                        open();
                    }
                }
                if (event.getButton() == MouseButton.SECONDARY && !this.isOpen) {

                    flagTile();
                }

            });

        }
//flags a tile when you right click on it
        private void flagTile() {
            if (!gameOver) {
                if (flagText.isVisible()) {
                    flagText.setVisible(false);
                    bombcount += 1;
                } else {
                    text.setVisible(false);
                    flagText.setVisible(true);
                    bombcount -= 1;
                }
                bombcountLbl.setText("\uD83D\uDEA9" + bombcount);
            }
        }
//called when you open a tile
        private void open() {
            if (isOpen) return;
            if (flagText.isVisible()) {
                flagText.setVisible(false);
            }
            if (hasBomb) {
                circle.setFill(Color.GOLD);
                ScaleTransition transition = new ScaleTransition(Duration.seconds(1), circle);
                transition.setToX(0.1);
                transition.setToY(0.1);
                transition.setAutoReverse(true);
                transition.setCycleCount(Animation.INDEFINITE);
                transition.play();
                text.setFill(Color.BLACK);
                flagText.setFill(Color.BLACK);
                if (!gameOver) {
                    gameOver();
                }

            }
            isOpen = true;

            text.setVisible(true);

            if (text.getText().isEmpty()) {
                circle.setFill(null);
                getNeighbors(this).forEach(Tile::open);
            }
        }
//opens all the flagged tiles when you defuse the bombs
        private void openFlags() {
            flagText.setFill(Color.BLACK);
            if (isOpen) return;
            if (flagText.isVisible()) {
                if (hasBomb) {
                    flagText.setText("✔");
                }
                if (!hasBomb) {
                    flagText.setText("✘");
                }
            } else {
                if (hasBomb) {
                    if (!flagText.isVisible()) {
                        flagText.setVisible(true);
                        flagText.setText("\uD83D\uDCA3");
                        flagText.setFont(Font.font(18));
                        circle.setFill(Color.GOLD);
                        ScaleTransition transition = new ScaleTransition(Duration.seconds(1), circle);
                        transition.setToX(0.1);
                        transition.setToY(0.1);
                        transition.setAutoReverse(true);
                        transition.setCycleCount(Animation.INDEFINITE);
                        transition.play();
                    }
                }
            }
            isOpen = true;
        }
    }
}

