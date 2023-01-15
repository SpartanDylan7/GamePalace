package com.spartan.gamepalace;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class MineSweeperController implements Initializable {
    @FXML
    private Button b1;

    @FXML
    private Button b10;

    @FXML
    private Button b11;

    @FXML
    private Button b12;

    @FXML
    private Button b13;

    @FXML
    private Button b14;

    @FXML
    private Button b15;

    @FXML
    private Button b16;

    @FXML
    private Button b17;

    @FXML
    private Button b18;

    @FXML
    private Button b19;

    @FXML
    private Button b2;

    @FXML
    private Button b20;

    @FXML
    private Button b21;

    @FXML
    private Button b22;

    @FXML
    private Button b23;

    @FXML
    private Button b24;

    @FXML
    private Button b25;

    @FXML
    private Button b26;

    @FXML
    private Button b27;

    @FXML
    private Button b28;

    @FXML
    private Button b29;

    @FXML
    private Button b3;

    @FXML
    private Button b30;

    @FXML
    private Button b31;

    @FXML
    private Button b32;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    private Button defuseBtn;

    @FXML
    private Text correctLbl;

    @FXML
    private Text incorrectLbl;

    @FXML
    private Text bombcountLbl;

    public void countBombs(int i, Button b){
        if(b.getTextFill()==Color.RED){
            bombcount++;
        }
        i = bombcount;
        bombcountLbl.setText("\uD83D\uDEA9 " + i);
    }

    @FXML
    void onMenuClick(ActionEvent event){
        ViewManager.switchTo(View.MAINMENU);
    }
    int correctCount=0;
    int incorrectCount=0;
    int bombcount = 0;

    public void defuseCheck(Button b){
            if (b.getText().equals("\uD83D\uDEA9")) {
                if (b.getTextFill() == Color.RED) {
                    b.setTextFill(Color.BLACK);
                    b.setText("✔");
                    correctCount++;
                } else {
                    b.setTextFill(Color.RED);
                    b.setText("❌");
                    incorrectCount++;
                }
                setBtnDisabled();
                defuseBtn.setDisable(true);
            }
    }

    @FXML
    void onDefuseClick(ActionEvent event){
        defuseCheck(b1);
        defuseCheck(b2);
        defuseCheck(b3);
        defuseCheck(b4);
        defuseCheck(b5);
        defuseCheck(b6);
        defuseCheck(b7);
        defuseCheck(b8);
        defuseCheck(b9);
        defuseCheck(b10);
        defuseCheck(b11);
        defuseCheck(b12);
        defuseCheck(b13);
        defuseCheck(b14);
        defuseCheck(b15);
        defuseCheck(b16);
        defuseCheck(b17);
        defuseCheck(b18);
        defuseCheck(b19);
        defuseCheck(b20);
        defuseCheck(b21);
        defuseCheck(b22);
        defuseCheck(b23);
        defuseCheck(b24);
        defuseCheck(b25);
        defuseCheck(b26);
        defuseCheck(b27);
        defuseCheck(b28);
        defuseCheck(b29);
        defuseCheck(b30);
        defuseCheck(b31);
        defuseCheck(b32);
        correctLbl.setText(""+correctCount);
        incorrectLbl.setText(""+incorrectCount);
    }

    @FXML
    void onGameClick(ActionEvent event){
        bombcount = 0;
        correctCount = 0;
        incorrectCount = 0;
        correctLbl.setText("0");
        incorrectLbl.setText("0");
        defuseBtn.setDisable(false);
        b1.setDisable(false);
        b1.setText("");
        b1.setTextFill(Color.BLACK);
        b2.setDisable(false);
        b2.setText("");
        b2.setTextFill(Color.BLACK);
        b3.setDisable(false);
        b3.setText("");
        b3.setTextFill(Color.BLACK);
        b4.setDisable(false);
        b4.setText("");
        b4.setTextFill(Color.BLACK);
        b5.setDisable(false);
        b5.setText("");
        b5.setTextFill(Color.BLACK);
        b6.setDisable(false);
        b6.setText("");
        b6.setTextFill(Color.BLACK);
        b7.setDisable(false);
        b7.setText("");
        b7.setTextFill(Color.BLACK);
        b8.setDisable(false);
        b8.setText("");
        b8.setTextFill(Color.BLACK);
        b9.setDisable(false);
        b9.setText("");
        b9.setTextFill(Color.BLACK);
        b10.setDisable(false);
        b10.setText("");
        b10.setTextFill(Color.BLACK);
        b11.setDisable(false);
        b11.setText("");
        b11.setTextFill(Color.BLACK);
        b12.setDisable(false);
        b12.setText("");
        b12.setTextFill(Color.BLACK);
        b13.setDisable(false);
        b13.setText("");
        b13.setTextFill(Color.BLACK);
        b14.setDisable(false);
        b14.setText("");
        b14.setTextFill(Color.BLACK);
        b15.setDisable(false);
        b15.setText("");
        b15.setTextFill(Color.BLACK);
        b16.setDisable(false);
        b16.setText("");
        b16.setTextFill(Color.BLACK);
        b17.setDisable(false);
        b17.setText("");
        b17.setTextFill(Color.BLACK);
        b18.setDisable(false);
        b18.setText("");
        b18.setTextFill(Color.BLACK);
        b19.setDisable(false);
        b19.setText("");
        b19.setTextFill(Color.BLACK);
        b20.setDisable(false);
        b20.setText("");
        b20.setTextFill(Color.BLACK);
        b21.setDisable(false);
        b21.setText("");
        b21.setTextFill(Color.BLACK);
        b22.setDisable(false);
        b22.setText("");
        b22.setTextFill(Color.BLACK);
        b23.setDisable(false);
        b23.setText("");
        b23.setTextFill(Color.BLACK);
        b24.setDisable(false);
        b24.setText("");
        b24.setTextFill(Color.BLACK);
        b25.setDisable(false);
        b25.setText("");
        b25.setTextFill(Color.BLACK);
        b26.setDisable(false);
        b26.setText("");
        b26.setTextFill(Color.BLACK);
        b27.setDisable(false);
        b27.setText("");
        b27.setTextFill(Color.BLACK);
        b28.setDisable(false);
        b28.setText("");
        b28.setTextFill(Color.BLACK);
        b29.setDisable(false);
        b29.setText("");
        b29.setTextFill(Color.BLACK);
        b30.setDisable(false);
        b30.setText("");
        b30.setTextFill(Color.BLACK);
        b31.setDisable(false);
        b31.setText("");
        b31.setTextFill(Color.BLACK);
        b32.setDisable(false);
        b32.setText("");
        b32.setTextFill(Color.BLACK);
        Random r1 = new Random();
        int m1 = r1.nextInt(32) + 1;
        Random r2 = new Random();
        int m2 = r2.nextInt(32) + 1;
        Random r3 = new Random();
        int m3 = r3.nextInt(32) + 1;
        Random r4 = new Random();
        int m4 = r4.nextInt(32) + 1;
        switch (m1) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }
        switch (m2) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }
        switch (m3) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }
        switch (m4) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }

        countBombs(bombcount, b1);
        countBombs(bombcount, b2);
        countBombs(bombcount, b3);
        countBombs(bombcount, b4);
        countBombs(bombcount, b5);
        countBombs(bombcount, b6);
        countBombs(bombcount, b7);
        countBombs(bombcount, b8);
        countBombs(bombcount, b9);
        countBombs(bombcount, b10);
        countBombs(bombcount, b11);
        countBombs(bombcount, b12);
        countBombs(bombcount, b13);
        countBombs(bombcount, b14);
        countBombs(bombcount, b15);
        countBombs(bombcount, b16);
        countBombs(bombcount, b17);
        countBombs(bombcount, b18);
        countBombs(bombcount, b19);
        countBombs(bombcount, b20);
        countBombs(bombcount, b21);
        countBombs(bombcount, b22);
        countBombs(bombcount, b23);
        countBombs(bombcount, b24);
        countBombs(bombcount, b25);
        countBombs(bombcount, b26);
        countBombs(bombcount, b27);
        countBombs(bombcount, b28);
        countBombs(bombcount, b29);
        countBombs(bombcount, b30);
        countBombs(bombcount, b31);
        countBombs(bombcount, b32);

        Random r = new Random();
        int i = r.nextInt(2) + 1;
        if(i==1) {
            if (b1.getTextFill() != Color.RED) {
                if (getNeighbors(b1) == 0) {
                    mineSweep(b1);
                }
                count = 0;
            }
            if (b2.getTextFill() != Color.RED) {
                if (getNeighbors(b2) == 0) {
                    mineSweep(b2);
                }
                count = 0;
            }
            if (b3.getTextFill() != Color.RED) {
                if (getNeighbors(b3) == 0) {
                    mineSweep(b3);
                }
                count = 0;
            }
            if (b4.getTextFill() != Color.RED) {
                if (getNeighbors(b4) == 0) {
                    mineSweep(b4);
                }
                count = 0;
            }
            if (b5.getTextFill() != Color.RED) {
                if (getNeighbors(b5) == 0) {
                    mineSweep(b5);
                }
                count = 0;
            }
            if (b6.getTextFill() != Color.RED) {
                if (getNeighbors(b6) == 0) {
                    mineSweep(b6);
                }
                count = 0;
            }
            if (b7.getTextFill() != Color.RED) {
                if (getNeighbors(b7) == 0) {
                    mineSweep(b7);
                }
                count = 0;
            }
            if (b8.getTextFill() != Color.RED) {
                if (getNeighbors(b8) == 0) {
                    mineSweep(b8);
                }
                count = 0;
            }
            if (b9.getTextFill() != Color.RED) {
                if (getNeighbors(b9) == 0) {
                    mineSweep(b9);
                }
                count = 0;
            }
            if (b10.getTextFill() != Color.RED) {
                if (getNeighbors(b10) == 0) {
                    mineSweep(b10);
                }
                count = 0;
            }
            if (b11.getTextFill() != Color.RED) {
                if (getNeighbors(b11) == 0) {
                    mineSweep(b11);
                }
                count = 0;
            }
            if (b12.getTextFill() != Color.RED) {
                if (getNeighbors(b12) == 0) {
                    mineSweep(b12);
                }
                count = 0;
            }
            if (b13.getTextFill() != Color.RED) {
                if (getNeighbors(b13) == 0) {
                    mineSweep(b13);
                }
                count = 0;
            }
            if (b14.getTextFill() != Color.RED) {
                if (getNeighbors(b14) == 0) {
                    mineSweep(b14);
                }
                count = 0;
            }
            if (b15.getTextFill() != Color.RED) {
                if (getNeighbors(b15) == 0) {
                    mineSweep(b15);
                }
                count = 0;
            }
            if (b16.getTextFill() != Color.RED) {
                if (getNeighbors(b16) == 0) {
                    mineSweep(b16);
                }
                count = 0;
            }
        }
        else {
            if (b17.getTextFill() != Color.RED) {
                if (getNeighbors(b17) == 0) {
                    mineSweep(b17);
                }
                count = 0;
            }
            if (b18.getTextFill() != Color.RED) {
                if (getNeighbors(b18) == 0) {
                    mineSweep(b18);
                }
                count = 0;
            }
            if (b19.getTextFill() != Color.RED) {
                if (getNeighbors(b19) == 0) {
                    mineSweep(b19);
                }
                count = 0;
            }
            if (b20.getTextFill() != Color.RED) {
                if (getNeighbors(b20) == 0) {
                    mineSweep(b20);
                }
                count = 0;
            }
            if (b21.getTextFill() != Color.RED) {
                if (getNeighbors(b21) == 0) {
                    mineSweep(b21);
                }
                count = 0;
            }
            if (b22.getTextFill() != Color.RED) {
                if (getNeighbors(b22) == 0) {
                    mineSweep(b22);
                }
                count = 0;
            }
            if (b23.getTextFill() != Color.RED) {
                if (getNeighbors(b23) == 0) {
                    mineSweep(b23);
                }
                count = 0;
            }
            if (b24.getTextFill() != Color.RED) {
                if (getNeighbors(b24) == 0) {
                    mineSweep(b24);
                }
                count = 0;
            }
            if (b25.getTextFill() != Color.RED) {
                if (getNeighbors(b25) == 0) {
                    mineSweep(b25);
                }
                count = 0;
            }
            if (b26.getTextFill() != Color.RED) {
                if (getNeighbors(b26) == 0) {
                    mineSweep(b26);
                }
                count = 0;
            }
            if (b27.getTextFill() != Color.RED) {
                if (getNeighbors(b27) == 0) {
                    mineSweep(b27);
                }
                count = 0;
            }
            if (b28.getTextFill() != Color.RED) {
                if (getNeighbors(b28) == 0) {
                    mineSweep(b28);
                }
                count = 0;
            }
            if (b29.getTextFill() != Color.RED) {
                if (getNeighbors(b29) == 0) {
                    mineSweep(b29);
                }
                count = 0;
            }
            if (b30.getTextFill() != Color.RED) {
                if (getNeighbors(b30) == 0) {
                    mineSweep(b30);
                }
                count = 0;
            }
            if (b31.getTextFill() != Color.RED) {
                if (getNeighbors(b31) == 0) {
                    mineSweep(b31);
                }
                count = 0;
            }
            if (b32.getTextFill() != Color.RED) {
                if (getNeighbors(b32) == 0) {
                    mineSweep(b32);
                }
                count = 0;
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        correctLbl.setText("0");
        incorrectLbl.setText("0");
        int bombcount = 0;
        Random r1 = new Random();
        int m1 = r1.nextInt(32) + 1;
        Random r2 = new Random();
        int m2 = r2.nextInt(32) + 1;
        Random r3 = new Random();
        int m3 = r3.nextInt(32) + 1;
        Random r4 = new Random();
        int m4 = r4.nextInt(32) + 1;
        switch (m1) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }
        switch (m2) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }
        switch (m3) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }
        switch (m4) {
            case(1):
                b1.setTextFill(Color.RED);
                break;
            case(2):
                b2.setTextFill(Color.RED);
                break;
            case(3):
                b3.setTextFill(Color.RED);
                break;
            case(4):
                b4.setTextFill(Color.RED);
                break;
            case(5):
                b5.setTextFill(Color.RED);
                break;
            case(6):
                b6.setTextFill(Color.RED);
                break;
            case(7):
                b7.setTextFill(Color.RED);
                break;
            case(8):
                b8.setTextFill(Color.RED);
                break;
            case(9):
                b9.setTextFill(Color.RED);
                break;
            case(10):
                b10.setTextFill(Color.RED);
                break;
            case(11):
                b11.setTextFill(Color.RED);
                break;
            case(12):
                b12.setTextFill(Color.RED);
                break;
            case(13):
                b13.setTextFill(Color.RED);
                break;
            case(14):
                b14.setTextFill(Color.RED);
                break;
            case(15):
                b15.setTextFill(Color.RED);
                break;
            case(16):
                b16.setTextFill(Color.RED);
                break;
            case(17):
                b17.setTextFill(Color.RED);
                break;
            case(18):
                b18.setTextFill(Color.RED);
                break;
            case(19):
                b19.setTextFill(Color.RED);
                break;
            case(20):
                b20.setTextFill(Color.RED);
                break;
            case(21):
                b21.setTextFill(Color.RED);
                break;
            case(22):
                b22.setTextFill(Color.RED);
                break;
            case(23):
                b23.setTextFill(Color.RED);
                break;
            case(24):
                b24.setTextFill(Color.RED);
                break;
            case(25):
                b25.setTextFill(Color.RED);
                break;
            case(26):
                b26.setTextFill(Color.RED);
                break;
            case(27):
                b27.setTextFill(Color.RED);
                break;
            case(28):
                b28.setTextFill(Color.RED);
                break;
            case(29):
                b29.setTextFill(Color.RED);
                break;
            case(30):
                b30.setTextFill(Color.RED);
                break;
            case(31):
                b31.setTextFill(Color.RED);
                break;
            case(32):
                b32.setTextFill(Color.RED);
                break;
        }

        countBombs(bombcount, b1);
        countBombs(bombcount, b2);
        countBombs(bombcount, b3);
        countBombs(bombcount, b4);
        countBombs(bombcount, b5);
        countBombs(bombcount, b6);
        countBombs(bombcount, b7);
        countBombs(bombcount, b8);
        countBombs(bombcount, b9);
        countBombs(bombcount, b10);
        countBombs(bombcount, b11);
        countBombs(bombcount, b12);
        countBombs(bombcount, b13);
        countBombs(bombcount, b14);
        countBombs(bombcount, b15);
        countBombs(bombcount, b16);
        countBombs(bombcount, b17);
        countBombs(bombcount, b18);
        countBombs(bombcount, b19);
        countBombs(bombcount, b20);
        countBombs(bombcount, b21);
        countBombs(bombcount, b22);
        countBombs(bombcount, b23);
        countBombs(bombcount, b24);
        countBombs(bombcount, b25);
        countBombs(bombcount, b26);
        countBombs(bombcount, b27);
        countBombs(bombcount, b28);
        countBombs(bombcount, b29);
        countBombs(bombcount, b30);
        countBombs(bombcount, b31);
        countBombs(bombcount, b32);

        Random r = new Random();
        int i = r.nextInt(2) + 1;
        if(i==1) {
            if (b1.getTextFill() != Color.RED) {
                if (getNeighbors(b1) == 0) {
                    mineSweep(b1);
                }
                count = 0;
            }
            if (b2.getTextFill() != Color.RED) {
                if (getNeighbors(b2) == 0) {
                    mineSweep(b2);
                }
                count = 0;
            }
            if (b3.getTextFill() != Color.RED) {
                if (getNeighbors(b3) == 0) {
                    mineSweep(b3);
                }
                count = 0;
            }
            if (b4.getTextFill() != Color.RED) {
                if (getNeighbors(b4) == 0) {
                    mineSweep(b4);
                }
                count = 0;
            }
            if (b5.getTextFill() != Color.RED) {
                if (getNeighbors(b5) == 0) {
                    mineSweep(b5);
                }
                count = 0;
            }
            if (b6.getTextFill() != Color.RED) {
                if (getNeighbors(b6) == 0) {
                    mineSweep(b6);
                }
                count = 0;
            }
            if (b7.getTextFill() != Color.RED) {
                if (getNeighbors(b7) == 0) {
                    mineSweep(b7);
                }
                count = 0;
            }
            if (b8.getTextFill() != Color.RED) {
                if (getNeighbors(b8) == 0) {
                    mineSweep(b8);
                }
                count = 0;
            }
            if (b9.getTextFill() != Color.RED) {
                if (getNeighbors(b9) == 0) {
                    mineSweep(b9);
                }
                count = 0;
            }
            if (b10.getTextFill() != Color.RED) {
                if (getNeighbors(b10) == 0) {
                    mineSweep(b10);
                }
                count = 0;
            }
            if (b11.getTextFill() != Color.RED) {
                if (getNeighbors(b11) == 0) {
                    mineSweep(b11);
                }
                count = 0;
            }
            if (b12.getTextFill() != Color.RED) {
                if (getNeighbors(b12) == 0) {
                    mineSweep(b12);
                }
                count = 0;
            }
            if (b13.getTextFill() != Color.RED) {
                if (getNeighbors(b13) == 0) {
                    mineSweep(b13);
                }
                count = 0;
            }
            if (b14.getTextFill() != Color.RED) {
                if (getNeighbors(b14) == 0) {
                    mineSweep(b14);
                }
                count = 0;
            }
            if (b15.getTextFill() != Color.RED) {
                if (getNeighbors(b15) == 0) {
                    mineSweep(b15);
                }
                count = 0;
            }
            if (b16.getTextFill() != Color.RED) {
                if (getNeighbors(b16) == 0) {
                    mineSweep(b16);
                }
                count = 0;
            }
        }
        else {
            if (b17.getTextFill() != Color.RED) {
                if (getNeighbors(b17) == 0) {
                    mineSweep(b17);
                }
                count = 0;
            }
            if (b18.getTextFill() != Color.RED) {
                if (getNeighbors(b18) == 0) {
                    mineSweep(b18);
                }
                count = 0;
            }
            if (b19.getTextFill() != Color.RED) {
                if (getNeighbors(b19) == 0) {
                    mineSweep(b19);
                }
                count = 0;
            }
            if (b20.getTextFill() != Color.RED) {
                if (getNeighbors(b20) == 0) {
                    mineSweep(b20);
                }
                count = 0;
            }
            if (b21.getTextFill() != Color.RED) {
                if (getNeighbors(b21) == 0) {
                    mineSweep(b21);
                }
                count = 0;
            }
            if (b22.getTextFill() != Color.RED) {
                if (getNeighbors(b22) == 0) {
                    mineSweep(b22);
                }
                count = 0;
            }
            if (b23.getTextFill() != Color.RED) {
                if (getNeighbors(b23) == 0) {
                    mineSweep(b23);
                }
                count = 0;
            }
            if (b24.getTextFill() != Color.RED) {
                if (getNeighbors(b24) == 0) {
                    mineSweep(b24);
                }
                count = 0;
            }
            if (b25.getTextFill() != Color.RED) {
                if (getNeighbors(b25) == 0) {
                    mineSweep(b25);
                }
                count = 0;
            }
            if (b26.getTextFill() != Color.RED) {
                if (getNeighbors(b26) == 0) {
                    mineSweep(b26);
                }
                count = 0;
            }
            if (b27.getTextFill() != Color.RED) {
                if (getNeighbors(b27) == 0) {
                    mineSweep(b27);
                }
                count = 0;
            }
            if (b28.getTextFill() != Color.RED) {
                if (getNeighbors(b28) == 0) {
                    mineSweep(b28);
                }
                count = 0;
            }
            if (b29.getTextFill() != Color.RED) {
                if (getNeighbors(b29) == 0) {
                    mineSweep(b29);
                }
                count = 0;
            }
            if (b30.getTextFill() != Color.RED) {
                if (getNeighbors(b30) == 0) {
                    mineSweep(b30);
                }
                count = 0;
            }
            if (b31.getTextFill() != Color.RED) {
                if (getNeighbors(b31) == 0) {
                    mineSweep(b31);
                }
                count = 0;
            }
            if (b32.getTextFill() != Color.RED) {
                if (getNeighbors(b32) == 0) {
                    mineSweep(b32);
                }
                count = 0;
            }
        }
    }

    public void setBtnDisabled(){
        b1.setDisable(true);
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b5.setDisable(true);
        b6.setDisable(true);
        b7.setDisable(true);
        b8.setDisable(true);
        b9.setDisable(true);
        b10.setDisable(true);
        b11.setDisable(true);
        b12.setDisable(true);
        b13.setDisable(true);
        b14.setDisable(true);
        b15.setDisable(true);
        b16.setDisable(true);
        b17.setDisable(true);
        b18.setDisable(true);
        b19.setDisable(true);
        b20.setDisable(true);
        b21.setDisable(true);
        b22.setDisable(true);
        b23.setDisable(true);
        b24.setDisable(true);
        b25.setDisable(true);
        b26.setDisable(true);
        b27.setDisable(true);
        b28.setDisable(true);
        b29.setDisable(true);
        b30.setDisable(true);
        b31.setDisable(true);
        b32.setDisable(true);
    }

    public void mineSweep(Button b) {
        if (b.getText().equals("")){
            if (b.getTextFill() == Color.RED) {
                setBtnDisabled();
                if (b1.getTextFill() == Color.RED) {
                    b1.setText("\uD83D\uDCA3");
                }
                if (b2.getTextFill() == Color.RED) {
                    b2.setText("\uD83D\uDCA3");
                }
                if (b3.getTextFill() == Color.RED) {
                    b3.setText("\uD83D\uDCA3");
                }
                if (b4.getTextFill() == Color.RED) {
                    b4.setText("\uD83D\uDCA3");
                }
                if (b5.getTextFill() == Color.RED) {
                    b5.setText("\uD83D\uDCA3");
                }
                if (b6.getTextFill() == Color.RED) {
                    b6.setText("\uD83D\uDCA3");
                }
                if (b7.getTextFill() == Color.RED) {
                    b7.setText("\uD83D\uDCA3");
                }
                if (b8.getTextFill() == Color.RED) {
                    b8.setText("\uD83D\uDCA3");
                }
                if (b9.getTextFill() == Color.RED) {
                    b9.setText("\uD83D\uDCA3");
                }
                if (b10.getTextFill() == Color.RED) {
                    b10.setText("\uD83D\uDCA3");
                }
                if (b11.getTextFill() == Color.RED) {
                    b11.setText("\uD83D\uDCA3");
                }
                if (b12.getTextFill() == Color.RED) {
                    b12.setText("\uD83D\uDCA3");
                }
                if (b13.getTextFill() == Color.RED) {
                    b13.setText("\uD83D\uDCA3");
                }
                if (b14.getTextFill() == Color.RED) {
                    b14.setText("\uD83D\uDCA3");
                }
                if (b15.getTextFill() == Color.RED) {
                    b15.setText("\uD83D\uDCA3");
                }
                if (b16.getTextFill() == Color.RED) {
                    b16.setText("\uD83D\uDCA3");
                }
                if (b17.getTextFill() == Color.RED) {
                    b17.setText("\uD83D\uDCA3");
                }
                if (b18.getTextFill() == Color.RED) {
                    b18.setText("\uD83D\uDCA3");
                }
                if (b19.getTextFill() == Color.RED) {
                    b19.setText("\uD83D\uDCA3");
                }
                if (b20.getTextFill() == Color.RED) {
                    b20.setText("\uD83D\uDCA3");
                }
                if (b21.getTextFill() == Color.RED) {
                    b21.setText("\uD83D\uDCA3");
                }
                if (b22.getTextFill() == Color.RED) {
                    b22.setText("\uD83D\uDCA3");
                }
                if (b23.getTextFill() == Color.RED) {
                    b23.setText("\uD83D\uDCA3");
                }
                if (b24.getTextFill() == Color.RED) {
                    b24.setText("\uD83D\uDCA3");
                }
                if (b25.getTextFill() == Color.RED) {
                    b25.setText("\uD83D\uDCA3");
                }
                if (b26.getTextFill() == Color.RED) {
                    b26.setText("\uD83D\uDCA3");
                }
                if (b27.getTextFill() == Color.RED) {
                    b27.setText("\uD83D\uDCA3");
                }
                if (b28.getTextFill() == Color.RED) {
                    b28.setText("\uD83D\uDCA3");
                }
                if (b29.getTextFill() == Color.RED) {
                    b29.setText("\uD83D\uDCA3");
                }
                if (b30.getTextFill() == Color.RED) {
                    b30.setText("\uD83D\uDCA3");
                }
                if (b31.getTextFill() == Color.RED) {
                    b31.setText("\uD83D\uDCA3");
                }
                if (b32.getTextFill() == Color.RED) {
                    b32.setText("\uD83D\uDCA3");
                }
                defuseCheck(b1);
                defuseCheck(b2);
                defuseCheck(b3);
                defuseCheck(b4);
                defuseCheck(b5);
                defuseCheck(b6);
                defuseCheck(b7);
                defuseCheck(b8);
                defuseCheck(b9);
                defuseCheck(b10);
                defuseCheck(b11);
                defuseCheck(b12);
                defuseCheck(b13);
                defuseCheck(b14);
                defuseCheck(b15);
                defuseCheck(b16);
                defuseCheck(b17);
                defuseCheck(b18);
                defuseCheck(b19);
                defuseCheck(b20);
                defuseCheck(b21);
                defuseCheck(b22);
                defuseCheck(b23);
                defuseCheck(b24);
                defuseCheck(b25);
                defuseCheck(b26);
                defuseCheck(b27);
                defuseCheck(b28);
                defuseCheck(b29);
                defuseCheck(b30);
                defuseCheck(b31);
                defuseCheck(b32);
            } else {
                b.setDisable(true);
                b.setText("" + getNeighbors(b));
                count = 0;
            }
    }
    }
    int count;
    public int getNeighbors(Button b){
        if(b==b1){
            if(b2.getTextFill() == Color.RED){
                count++;
            }
            if(b9.getTextFill()== Color.RED){
                count++;
            }
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b2){
            if(b1.getTextFill()== Color.RED) {
                count++;
            }
            if(b3.getTextFill()== Color.RED) {
                count++;
            }
            if(b9.getTextFill()== Color.RED) {
                count++;
            }
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b3){
            if(b2.getTextFill()== Color.RED) {
                count++;
            }
            if(b4.getTextFill()== Color.RED) {
                count++;
            }
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b4){
            if(b3.getTextFill()== Color.RED) {
                count++;
            }
            if(b5.getTextFill()== Color.RED) {
                count++;
            }
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b5){
            if(b4.getTextFill()== Color.RED) {
                count++;
            }
            if(b6.getTextFill()== Color.RED) {
                count++;
            }
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b6){
            if(b5.getTextFill()== Color.RED) {
                count++;
            }
            if(b7.getTextFill()== Color.RED) {
                count++;
            }
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b7){
            if(b6.getTextFill()== Color.RED) {
                count++;
            }
            if(b8.getTextFill()== Color.RED) {
                count++;
            }
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
            if(b16.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b8){
            if(b7.getTextFill()== Color.RED) {
                count++;
            }
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
            if(b16.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b9){
            if(b1.getTextFill()== Color.RED) {
                count++;
            }
            if(b2.getTextFill()== Color.RED) {
                count++;
            }
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
            if(b17.getTextFill()== Color.RED) {
                count++;
            }
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b10){
            if(b1.getTextFill()== Color.RED) {
                count++;
            }
            if(b2.getTextFill()== Color.RED) {
                count++;
            }
            if(b3.getTextFill()== Color.RED) {
                count++;
            }
            if(b9.getTextFill()== Color.RED) {
                count++;
            }
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
            if(b17.getTextFill()== Color.RED) {
                count++;
            }
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b11){
            if(b2.getTextFill()== Color.RED) {
                count++;
            }
            if(b3.getTextFill()== Color.RED) {
                count++;
            }
            if(b4.getTextFill()== Color.RED) {
                count++;
            }
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b12){
            if(b3.getTextFill()== Color.RED) {
                count++;
            }
            if(b4.getTextFill()== Color.RED) {
                count++;
            }
            if(b5.getTextFill()== Color.RED) {
                count++;
            }
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b13){
            if(b4.getTextFill()== Color.RED) {
                count++;
            }
            if(b5.getTextFill()== Color.RED) {
                count++;
            }
            if(b6.getTextFill()== Color.RED) {
                count++;
            }
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b14){
            if(b5.getTextFill()== Color.RED) {
                count++;
            }
            if(b6.getTextFill()== Color.RED) {
                count++;
            }
            if(b7.getTextFill()== Color.RED) {
                count++;
            }
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b15){
            if(b6.getTextFill()== Color.RED) {
                count++;
            }
            if(b7.getTextFill()== Color.RED) {
                count++;
            }
            if(b8.getTextFill()== Color.RED) {
                count++;
            }
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
            if(b16.getTextFill()== Color.RED) {
                count++;
            }
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
            if(b24.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b16){
            if(b7.getTextFill()== Color.RED) {
                count++;
            }
            if(b8.getTextFill()== Color.RED) {
                count++;
            }
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
            if(b24.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b17){
            if(b9.getTextFill()== Color.RED) {
                count++;
            }
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
            if(b25.getTextFill()== Color.RED) {
                count++;
            }
            if(b26.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b18){
            if(b9.getTextFill()== Color.RED) {
                count++;
            }
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
            if(b17.getTextFill()== Color.RED) {
                count++;
            }
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
            if(b25.getTextFill()== Color.RED) {
                count++;
            }
            if(b26.getTextFill()== Color.RED) {
                count++;
            }
            if(b27.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b19){
            if(b10.getTextFill()== Color.RED) {
                count++;
            }
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
            if(b26.getTextFill()== Color.RED) {
                count++;
            }
            if(b27.getTextFill()== Color.RED) {
                count++;
            }
            if(b28.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b20){
            if(b11.getTextFill()== Color.RED) {
                count++;
            }
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
            if(b27.getTextFill()== Color.RED) {
                count++;
            }
            if(b28.getTextFill()== Color.RED) {
                count++;
            }
            if(b29.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b21){
            if(b12.getTextFill()== Color.RED) {
                count++;
            }
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
            if(b28.getTextFill()== Color.RED) {
                count++;
            }
            if(b29.getTextFill()== Color.RED) {
                count++;
            }
            if(b30.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b22){
            if(b13.getTextFill()== Color.RED) {
                count++;
            }
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
            if(b29.getTextFill()== Color.RED) {
                count++;
            }
            if(b30.getTextFill()== Color.RED) {
                count++;
            }
            if(b31.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b23){
            if(b14.getTextFill()== Color.RED) {
                count++;
            }
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
            if(b16.getTextFill()== Color.RED) {
                count++;
            }
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
            if(b24.getTextFill()== Color.RED) {
                count++;
            }
            if(b30.getTextFill()== Color.RED) {
                count++;
            }
            if(b31.getTextFill()== Color.RED) {
                count++;
            }
            if(b32.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b24){
            if(b15.getTextFill()== Color.RED) {
                count++;
            }
            if(b16.getTextFill()== Color.RED) {
                count++;
            }
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
            if(b31.getTextFill()== Color.RED) {
                count++;
            }
            if(b32.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b25){
            if(b17.getTextFill()== Color.RED) {
                count++;
            }
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
            if(b26.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b26){
            if(b17.getTextFill()== Color.RED) {
                count++;
            }
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
            if(b25.getTextFill()== Color.RED) {
                count++;
            }
            if(b27.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b27){
            if(b18.getTextFill()== Color.RED) {
                count++;
            }
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
            if(b26.getTextFill()== Color.RED) {
                count++;
            }
            if(b28.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b28){
            if(b19.getTextFill()== Color.RED) {
                count++;
            }
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
            if(b27.getTextFill()== Color.RED) {
                count++;
            }
            if(b29.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b29){
            if(b20.getTextFill()== Color.RED) {
                count++;
            }
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
            if(b28.getTextFill()== Color.RED) {
                count++;
            }
            if(b30.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b30){
            if(b21.getTextFill()== Color.RED) {
                count++;
            }
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
            if(b29.getTextFill()== Color.RED) {
                count++;
            }
            if(b31.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b31){
            if(b22.getTextFill()== Color.RED) {
                count++;
            }
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
            if(b24.getTextFill()== Color.RED) {
                count++;
            }
            if(b30.getTextFill()== Color.RED) {
                count++;
            }
            if(b32.getTextFill()== Color.RED) {
                count++;
            }
        }
        if(b==b32){
            if(b23.getTextFill()== Color.RED) {
                count++;
            }
            if(b24.getTextFill()== Color.RED) {
                count++;
            }
            if(b31.getTextFill()== Color.RED) {
                count++;
            }
        }
        return count;
    }

    @FXML
    void b10c(ActionEvent event) {
        mineSweep(b10);
        count = 0;
    }

    @FXML
    void b11c(ActionEvent event) {
        mineSweep(b11);
        count = 0;
    }

    @FXML
    void b12c(ActionEvent event) {
        mineSweep(b12);
        count = 0;
    }

    @FXML
    void b13c(ActionEvent event) {
        mineSweep(b13);
        count = 0;
    }

    @FXML
    void b14c(ActionEvent event) {
        mineSweep(b14);
        count = 0;
    }

    @FXML
    void b15c(ActionEvent event) {
        mineSweep(b15);
        count = 0;
    }

    @FXML
    void b16c(ActionEvent event) {
        mineSweep(b16);
        count = 0;
    }

    @FXML
    void b17c(ActionEvent event) {
        mineSweep(b17);
        count = 0;
    }

    @FXML
    void b18c(ActionEvent event) {
        mineSweep(b18);
        count = 0;
    }

    @FXML
    void b19c(ActionEvent event) {
        mineSweep(b19);
        count = 0;
    }

    @FXML
    void b1c(ActionEvent event) {
        mineSweep(b1);
        count = 0;
    }

    @FXML
    void b20c(ActionEvent event) {
        mineSweep(b20);
        count = 0;
    }

    @FXML
    void b21c(ActionEvent event) {
        mineSweep(b21);
        count = 0;
    }

    @FXML
    void b22c(ActionEvent event) {
        mineSweep(b22);
        count = 0;
    }

    @FXML
    void b23c(ActionEvent event) {
        mineSweep(b23);
        count = 0;
    }

    @FXML
    void b24c(ActionEvent event) {
        mineSweep(b24);
        count = 0;
    }

    @FXML
    void b25c(ActionEvent event) {
        mineSweep(b25);
        count = 0;
    }

    @FXML
    void b26c(ActionEvent event) {
        mineSweep(b26);
        count = 0;
    }

    @FXML
    void b27c(ActionEvent event) {
        mineSweep(b27);
        count = 0;
    }

    @FXML
    void b28c(ActionEvent event) {
        mineSweep(b28);
        count = 0;
    }

    @FXML
    void b29c(ActionEvent event) {
        mineSweep(b29);
        count = 0;
    }

    @FXML
    void b2c(ActionEvent event) {
        mineSweep(b2);
        count = 0;
    }

    @FXML
    void b30c(ActionEvent event) {
        mineSweep(b30);
        count = 0;
    }

    @FXML
    void b31c(ActionEvent event) {
        mineSweep(b31);
        count = 0;
    }

    @FXML
    void b32c(ActionEvent event) {
        mineSweep(b32);
        count = 0;
    }

    @FXML
    void b3c(ActionEvent event) {
        mineSweep(b3);
        count = 0;
    }

    @FXML
    void b4c(ActionEvent event) {
        mineSweep(b4);
        count = 0;
    }

    @FXML
    void b5c(ActionEvent event) {
        mineSweep(b5);
        count = 0;
    }

    @FXML
    void b6c(ActionEvent event) {
        mineSweep(b6);
        count = 0;
    }

    @FXML
    void b7c(ActionEvent event) {
        mineSweep(b7);
        count = 0;
    }

    @FXML
    void b8c(ActionEvent event) {
        mineSweep(b8);
        count = 0;
    }

    @FXML
    void b9c(ActionEvent event) {
        mineSweep(b9);
        count = 0;
    }

    public void flagBomb(Button b, MouseEvent e){
        if(e.getButton()==MouseButton.SECONDARY){
            if(b.getText().equals("\uD83D\uDEA9")){
                bombcount++;
                bombcountLbl.setText("\uD83D\uDEA9 " + bombcount);
                b.setText("");
                if(b.getTextFill() != Color.RED){
                    b.setTextFill(Color.BLACK);
                }
            }else if(b.getText().equals("")){
                bombcount--;
                bombcountLbl.setText("\uD83D\uDEA9 " + bombcount);
                b.setText("\uD83D\uDEA9");
                if(b.getTextFill() != Color.RED){
                    b.setTextFill(Color.rgb(255, 0, 0));
                }
            }
        }
    }

    @FXML
    void bc1(MouseEvent event) {
        flagBomb(b1,event);
    }

    @FXML
    void bc10(MouseEvent event) {
        flagBomb(b10,event);
    }

    @FXML
    void bc11(MouseEvent event) {
        flagBomb(b11,event);
    }

    @FXML
    void bc12(MouseEvent event) {
        flagBomb(b12,event);
    }

    @FXML
    void bc13(MouseEvent event) {
        flagBomb(b13,event);
    }

    @FXML
    void bc14(MouseEvent event) {
        flagBomb(b14,event);
    }

    @FXML
    void bc15(MouseEvent event) {
        flagBomb(b15,event);
    }

    @FXML
    void bc16(MouseEvent event) {
        flagBomb(b16,event);
    }

    @FXML
    void bc17(MouseEvent event) {
        flagBomb(b17,event);
    }

    @FXML
    void bc18(MouseEvent event) {
        flagBomb(b18,event);
    }

    @FXML
    void bc19(MouseEvent event) {
        flagBomb(b19,event);
    }

    @FXML
    void bc2(MouseEvent event) {
        flagBomb(b2,event);
    }

    @FXML
    void bc20(MouseEvent event) {
        flagBomb(b20,event);
    }

    @FXML
    void bc21(MouseEvent event) {
        flagBomb(b21,event);
    }

    @FXML
    void bc22(MouseEvent event) {
        flagBomb(b22,event);
    }

    @FXML
    void bc23(MouseEvent event) {
        flagBomb(b23,event);
    }

    @FXML
    void bc24(MouseEvent event) {
        flagBomb(b24,event);
    }

    @FXML
    void bc25(MouseEvent event) {
        flagBomb(b25,event);
    }

    @FXML
    void bc26(MouseEvent event) {
        flagBomb(b26,event);
    }

    @FXML
    void bc27(MouseEvent event) {
        flagBomb(b27,event);
    }

    @FXML
    void bc28(MouseEvent event) {
        flagBomb(b28,event);
    }

    @FXML
    void bc29(MouseEvent event) {
        flagBomb(b29,event);
    }

    @FXML
    void bc3(MouseEvent event) {
        flagBomb(b3,event);
    }

    @FXML
    void bc30(MouseEvent event) {
        flagBomb(b30,event);
    }

    @FXML
    void bc31(MouseEvent event) {
        flagBomb(b31,event);
    }

    @FXML
    void bc32(MouseEvent event) {
        flagBomb(b32,event);
    }

    @FXML
    void bc4(MouseEvent event) {
        flagBomb(b4,event);
    }

    @FXML
    void bc5(MouseEvent event) {
        flagBomb(b5,event);
    }

    @FXML
    void bc6(MouseEvent event) {
        flagBomb(b6,event);
    }

    @FXML
    void bc7(MouseEvent event) {
        flagBomb(b7,event);
    }

    @FXML
    void bc8(MouseEvent event) {
        flagBomb(b8,event);
    }

    @FXML
    void bc9(MouseEvent event) {
        flagBomb(b9,event);
    }

}