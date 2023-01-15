package com.spartan.gamepalace;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class BlackJackController implements Initializable {

    int count;
    int oppcount;
    boolean aceChoiceOne = false;
    boolean aceChoiceTwo = false;

    @FXML
    private Button aceoneBtn;

    @FXML
    private Label msgLbl;

    @FXML
    private Button acetwoBtn;

    @FXML
    private Label countLbl;

    @FXML
    private Label cardLbl;

    @FXML
    private Button hitBtn;

    @FXML
    private Button stayBtn;

    @FXML
    private Button newgameBtn;

    @FXML
    private Label oppcountLbl;

    @FXML
    void menuButtonClick(ActionEvent event){
        ViewManager.switchTo(View.MAINMENU);
    }

    @FXML
    void hitButtonClick(ActionEvent event) {
        oppHit();
        Cards card = Cards.getCard();
        cardLbl.setText("" + card);
        switch (card) {
            case TWO:
                count += 2;
                break;
            case THREE:
                count += 3;
                break;
            case FOUR:
                count += 4;
                break;
            case FIVE:
                count += 5;
                break;
            case SIX:
                count += 6;
                break;
            case SEVEN:
                count += 7;
                break;
            case EIGHT:
                count += 8;
                break;
            case NINE:
                count += 9;
                break;
            case TEN:
            case KING:
            case JACK:
            case QUEEN:
                count += 10;
                break;
            case ACE: {
                hitBtn.setDisable(true);
                aceoneBtn.setDisable(false);
                acetwoBtn.setDisable(false);
            }
        }
        if(count>21){
            newgameBtn.setDisable(false);
            aceoneBtn.setDisable(true);
            acetwoBtn.setDisable(true);
            hitBtn.setDisable(true);
            stayBtn.setDisable(true);
            countLbl.setText("" + count);
            msgLbl.setVisible(true);
            oppcountLbl.setText(""+oppcount);
        }else {
            countLbl.setText("" + count);
        }
        if(oppcount>21){
            newgameBtn.setDisable(false);
            aceoneBtn.setDisable(true);
            acetwoBtn.setDisable(true);
            hitBtn.setDisable(true);
            stayBtn.setDisable(true);
            msgLbl.setText("Victory");
            msgLbl.setStyle("-fx-text-fill: green");
            msgLbl.setVisible(true);
            oppcountLbl.setText("Busted");
        }
    }

    @FXML
    void aceoneButtonClick(ActionEvent event) {
        aceChoiceOne = true;
        aceChoiceTwo = false;
        aceoneBtn.setDisable(true);
        acetwoBtn.setDisable(true);
        hitBtn.setDisable(false);
        count += 1;
        if(count>21){
            newgameBtn.setDisable(false);
            aceoneBtn.setDisable(true);
            acetwoBtn.setDisable(true);
            hitBtn.setDisable(true);
            stayBtn.setDisable(true);
            countLbl.setText("" + count);
            msgLbl.setVisible(true);
        }else {
            countLbl.setText("" + count);
        }
    }

    @FXML
    void acetwoButtonClick(ActionEvent event) {
        aceChoiceOne = false;
        aceChoiceTwo = true;
        aceoneBtn.setDisable(true);
        acetwoBtn.setDisable(true);
        hitBtn.setDisable(false);
        count += 11;
        if(count>21){
            newgameBtn.setDisable(false);
            aceoneBtn.setDisable(true);
            acetwoBtn.setDisable(true);
            hitBtn.setDisable(true);
            stayBtn.setDisable(true);
            countLbl.setText("" + count);
            msgLbl.setVisible(true);
        }else {
            countLbl.setText("" + count);
        }
    }


    @FXML
    void stayButtonClick(ActionEvent event) {
        newgameBtn.setDisable(false);
        aceoneBtn.setDisable(true);
        acetwoBtn.setDisable(true);
        hitBtn.setDisable(true);
        stayBtn.setDisable(true);
        oppcountLbl.setText(""+oppcount);
        if(oppcount<count) {
            msgLbl.setText("Victory");
            msgLbl.setStyle("-fx-text-fill: green");
            msgLbl.setVisible(true);
        }else if(oppcount>count){
            msgLbl.setText("Defeat");
            msgLbl.setStyle("-fx-text-fill: red");
            msgLbl.setVisible(true);
        }else if(oppcount==count){
            msgLbl.setText("Draw");
            msgLbl.setStyle("-fx-text-fill: blue");
            msgLbl.setVisible(true);
        }
    }

    @FXML
    void newgameButtonClick(ActionEvent event) {
        oppcountLbl.setText("?");
        countLbl.setText("0");
        cardLbl.setText("");
        newgameBtn.setDisable(true);
        hitBtn.setDisable(false);
        stayBtn.setDisable(false);
        aceoneBtn.setDisable(true);
        acetwoBtn.setDisable(true);
        newgameBtn.setDisable(true);
        count = 0;
        oppcount = 0;
        aceChoiceOne = false;
        aceChoiceTwo = false;
        msgLbl.setVisible(false);
        oppHit();
        hitButtonClick(null);
        hitButtonClick(null);
        countLbl.setText(""+count);
        msgLbl.setVisible(false);
        msgLbl.setText("Bust");
        msgLbl.setStyle("-fx-text-fill: red");
        if(oppcount>21){
            newgameBtn.setDisable(false);
            aceoneBtn.setDisable(true);
            acetwoBtn.setDisable(true);
            hitBtn.setDisable(true);
            stayBtn.setDisable(true);
            msgLbl.setText("Victory");
            msgLbl.setStyle("-fx-text-fill: green");
            msgLbl.setVisible(true);
            oppcountLbl.setText("Busted");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        oppcountLbl.setText("?");
        countLbl.setText("0");
        cardLbl.setText("");
        newgameBtn.setDisable(false);
        aceoneBtn.setDisable(true);
        acetwoBtn.setDisable(true);
        hitBtn.setDisable(true);
        stayBtn.setDisable(true);
        msgLbl.setText("Welcome To BlackJack");
        msgLbl.setStyle("-fx-text-fill: black");
        msgLbl.setVisible(true);
    }

    public void oppHit(){
        if(oppcount<15){
            Cards card = Cards.getCard();
            switch (card) {
                case TWO:
                    oppcount += 2;
                    break;
                case THREE:
                    oppcount += 3;
                    break;
                case FOUR:
                    oppcount += 4;
                    break;
                case FIVE:
                    oppcount += 5;
                    break;
                case SIX:
                    oppcount += 6;
                    break;
                case SEVEN:
                    oppcount += 7;
                    break;
                case EIGHT:
                    oppcount += 8;
                    break;
                case NINE:
                    oppcount += 9;
                    break;
                case TEN:
                case KING:
                case JACK:
                case QUEEN:
                    oppcount += 10;
                    break;
                case ACE: {
                    oppcount += 1;
                }
            }
        }
    }
}