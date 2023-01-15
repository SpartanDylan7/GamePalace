package com.spartan.gamepalace;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.*;

public class TicTacToeController implements Initializable {

    @FXML
    private Text oScore;

    @FXML
    private Text xScore;

    @FXML
    private Line aLine;

    @FXML
    private Line bLine;

    @FXML
    private Line cLine;

    @FXML
    private Line dLine;

    @FXML
    private Button eightBtn;

    @FXML
    private Line eLine;

    @FXML
    private Line fLine;

    @FXML
    private Button fiveBtn;

    @FXML
    private Button fourBtn;

    @FXML
    private Line gLine;

    @FXML
    private Line hLine;

    @FXML
    private Button nineBtn;

    @FXML
    private Button oneBtn;

    @FXML
    private Button sevenBtn;

    @FXML
    private Button sixBtn;

    @FXML
    private Button threeBtn;

    @FXML
    private Button twoBtn;

    int scorex = 0;
    int scoreo = 0;

    @FXML
    void onGameBtnClick(ActionEvent event) {
        oneBtn.setText("");
        twoBtn.setText("");
        threeBtn.setText("");
        fourBtn.setText("");
        fiveBtn.setText("");
        sixBtn.setText("");
        sevenBtn.setText("");
        eightBtn.setText("");
        nineBtn.setText("");
        aLine.setVisible(false);
        bLine.setVisible(false);
        cLine.setVisible(false);
        dLine.setVisible(false);
        eLine.setVisible(false);
        fLine.setVisible(false);
        gLine.setVisible(false);
        hLine.setVisible(false);
        setBtnEnabled();
        Random r = new Random();
        int i = r.nextInt(2) + 1;
        if(i == 1){
            return;
        }
        if(i == 2){
            setBtnDisabled();
            OClick();
        }
    }

    @FXML
    void onMenuBtnClick(ActionEvent event) {
        ViewManager.switchTo(View.MAINMENU);
    }

    @FXML
    void onEightBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            eightBtn.setText("X");
            eightBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onFiveBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            fiveBtn.setText("X");
            fiveBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onFourBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            fourBtn.setText("X");
            fourBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onNineBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            nineBtn.setText("X");
            nineBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onOneBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            oneBtn.setText("X");
            oneBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onSevenBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            sevenBtn.setText("X");
            sevenBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onSixBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            sixBtn.setText("X");
            sixBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onThreeBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            threeBtn.setText("X");
            threeBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }

    @FXML
    void onTwoBtnClick(ActionEvent event) {
        if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
            twoBtn.setText("X");
            twoBtn.setDisable(true);
            getWinX();
            getClick();
            OClick();
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        oneBtn.setText("");
        twoBtn.setText("");
        threeBtn.setText("");
        fourBtn.setText("");
        fiveBtn.setText("");
        sixBtn.setText("");
        sevenBtn.setText("");
        eightBtn.setText("");
        nineBtn.setText("");
        aLine.setVisible(false);
        bLine.setVisible(false);
        cLine.setVisible(false);
        dLine.setVisible(false);
        eLine.setVisible(false);
        fLine.setVisible(false);
        gLine.setVisible(false);
        hLine.setVisible(false);
        oScore.setText("" + scoreo);
        xScore.setText("" + scorex);
        Random r = new Random();
        int i = r.nextInt(2) + 1;
        if(i == 1){
            return;
        }
        if(i == 2){
            setBtnDisabled();
            OClick();
        }
    }

    public void getWinX(){
        if(oneBtn.getText().equals("X") && twoBtn.getText().equals("X") && threeBtn.getText().equals("X")){
            hLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
        if(fourBtn.getText().equals("X") && fiveBtn.getText().equals("X") && sixBtn.getText().equals("X")){
            fLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
        if(sevenBtn.getText().equals("X") && eightBtn.getText().equals("X") && nineBtn.getText().equals("X")){
            gLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
        if(oneBtn.getText().equals("X") && fourBtn.getText().equals("X") && sevenBtn.getText().equals("X")){
            cLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
        if(twoBtn.getText().equals("X") && fiveBtn.getText().equals("X") && eightBtn.getText().equals("X")){
            dLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
        if(threeBtn.getText().equals("X") && sixBtn.getText().equals("X") && nineBtn.getText().equals("X")){
            eLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
        if(oneBtn.getText().equals("X") && fiveBtn.getText().equals("X") && nineBtn.getText().equals("X")){
            aLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
        if(threeBtn.getText().equals("X") && fiveBtn.getText().equals("X") && sevenBtn.getText().equals("X")){
            bLine.setVisible(true);
            getClick();
            scorex++;
            xScore.setText(""+scorex);
        }
    }

    public void getClick(){
        setBtnDisabled();
    }

    public void getWinO(){
        if(oneBtn.getText().equals("O") && twoBtn.getText().equals("O") && threeBtn.getText().equals("O")){
            hLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
        if(fourBtn.getText().equals("O") && fiveBtn.getText().equals("O") && sixBtn.getText().equals("O")){
            fLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
        if(sevenBtn.getText().equals("O") && eightBtn.getText().equals("O") && nineBtn.getText().equals("O")){
            gLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
        if(oneBtn.getText().equals("O") && fourBtn.getText().equals("O") && sevenBtn.getText().equals("O")){
            cLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
        if(twoBtn.getText().equals("O") && fiveBtn.getText().equals("O") && eightBtn.getText().equals("O")){
            dLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
        if(threeBtn.getText().equals("O") && sixBtn.getText().equals("O") && nineBtn.getText().equals("O")){
            eLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
        if(oneBtn.getText().equals("O") && fiveBtn.getText().equals("O") && nineBtn.getText().equals("O")){
            aLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
        if(threeBtn.getText().equals("O") && fiveBtn.getText().equals("O") && sevenBtn.getText().equals("O")){
            bLine.setVisible(true);
            getClick();
            scoreo++;
            oScore.setText(""+scoreo);
        }
    }
    Random r = new Random();
    int i = r.nextInt(9);
    public void OClick(){
        setBtnEnabled();
        if(oneBtn.getText().equals("O") && twoBtn.getText().equals("O") && threeBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                threeBtn.setText("O");
                threeBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(fourBtn.getText().equals("O") && fiveBtn.getText().equals("O") && sixBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sixBtn.setText("O");
                sixBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(sevenBtn.getText().equals("O") && eightBtn.getText().equals("O") && nineBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                nineBtn.setText("O");
                nineBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("O") && fourBtn.getText().equals("O") && sevenBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sevenBtn.setText("O");
                sevenBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(twoBtn.getText().equals("O") && fiveBtn.getText().equals("O") && eightBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                eightBtn.setText("O");
                eightBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("O") && sixBtn.getText().equals("O") && nineBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                nineBtn.setText("O");
                nineBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("O") && fiveBtn.getText().equals("O") && nineBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                nineBtn.setText("O");
                nineBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("O") && fiveBtn.getText().equals("O") && sevenBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sevenBtn.setText("O");
                sevenBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("O") && twoBtn.getText().equals("") && threeBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                twoBtn.setText("O");
                twoBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(fourBtn.getText().equals("O") && fiveBtn.getText().equals("") && sixBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(sevenBtn.getText().equals("O") && eightBtn.getText().equals("") && nineBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                eightBtn.setText("O");
                eightBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("O") && fourBtn.getText().equals("") && sevenBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fourBtn.setText("O");
                fourBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(twoBtn.getText().equals("O") && fiveBtn.getText().equals("") && eightBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("O") && sixBtn.getText().equals("") && nineBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sixBtn.setText("O");
                sixBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("O") && fiveBtn.getText().equals("") && nineBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("O") && fiveBtn.getText().equals("") && sevenBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("") && twoBtn.getText().equals("O") && threeBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                oneBtn.setText("O");
                oneBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(fourBtn.getText().equals("") && fiveBtn.getText().equals("O") && sixBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fourBtn.setText("O");
                fourBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(sevenBtn.getText().equals("") && eightBtn.getText().equals("O") && nineBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sevenBtn.setText("O");
                sevenBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("") && fourBtn.getText().equals("O") && sevenBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                oneBtn.setText("O");
                oneBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(twoBtn.getText().equals("") && fiveBtn.getText().equals("O") && eightBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                twoBtn.setText("O");
                twoBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("") && sixBtn.getText().equals("O") && nineBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                threeBtn.setText("O");
                threeBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("") && fiveBtn.getText().equals("O") && nineBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                oneBtn.setText("O");
                oneBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("") && fiveBtn.getText().equals("O") && sevenBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                threeBtn.setText("O");
                threeBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("X") && twoBtn.getText().equals("X") && threeBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                threeBtn.setText("O");
                threeBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(fourBtn.getText().equals("X") && fiveBtn.getText().equals("X") && sixBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sixBtn.setText("O");
                sixBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(sevenBtn.getText().equals("X") && eightBtn.getText().equals("X") && nineBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                nineBtn.setText("O");
                nineBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("X") && fourBtn.getText().equals("X") && sevenBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sevenBtn.setText("O");
                sevenBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(twoBtn.getText().equals("X") && fiveBtn.getText().equals("X") && eightBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                eightBtn.setText("O");
                eightBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("X") && sixBtn.getText().equals("X") && nineBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                nineBtn.setText("O");
                nineBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("X") && fiveBtn.getText().equals("X") && nineBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                nineBtn.setText("O");
                nineBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("X") && fiveBtn.getText().equals("X") && sevenBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sevenBtn.setText("O");
                sevenBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("X") && twoBtn.getText().equals("") && threeBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                twoBtn.setText("O");
                twoBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(fourBtn.getText().equals("X") && fiveBtn.getText().equals("") && sixBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(sevenBtn.getText().equals("X") && eightBtn.getText().equals("") && nineBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                eightBtn.setText("O");
                eightBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("X") && fourBtn.getText().equals("") && sevenBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fourBtn.setText("O");
                fourBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(twoBtn.getText().equals("X") && fiveBtn.getText().equals("") && eightBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("X") && sixBtn.getText().equals("") && nineBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sixBtn.setText("O");
                sixBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("X") && fiveBtn.getText().equals("") && nineBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("X") && fiveBtn.getText().equals("") && sevenBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fiveBtn.setText("O");
                fiveBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("") && twoBtn.getText().equals("X") && threeBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                oneBtn.setText("O");
                oneBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(fourBtn.getText().equals("") && fiveBtn.getText().equals("X") && sixBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                fourBtn.setText("O");
                fourBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(sevenBtn.getText().equals("") && eightBtn.getText().equals("X") && nineBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                sevenBtn.setText("O");
                sevenBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("") && fourBtn.getText().equals("X") && sevenBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                oneBtn.setText("O");
                oneBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(twoBtn.getText().equals("") && fiveBtn.getText().equals("X") && eightBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                twoBtn.setText("O");
                twoBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("") && sixBtn.getText().equals("X") && nineBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                threeBtn.setText("O");
                threeBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(oneBtn.getText().equals("") && fiveBtn.getText().equals("X") && nineBtn.getText().equals("X")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                oneBtn.setText("O");
                oneBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(sevenBtn.getText().equals("X") && fiveBtn.getText().equals("X") && threeBtn.getText().equals("")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                threeBtn.setText("O");
                threeBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        }else if(threeBtn.getText().equals("") && fiveBtn.getText().equals("X") && sevenBtn.getText().equals("O")){
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                threeBtn.setText("O");
                threeBtn.setDisable(true);
                setBtnEnabled();
                getWinO();
            }
        } else if (oneBtn.getText().equals("") && twoBtn.getText().equals("") && threeBtn.getText().equals("") && fourBtn.getText().equals("") && fiveBtn.getText().equals("") && sixBtn.getText().equals("") && sevenBtn.getText().equals("") && eightBtn.getText().equals("") && nineBtn.getText().equals("")) {
            if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                Random r = new Random();
                int i = r.nextInt(9) + 1;
                if(i==1){
                    oneBtn.setText("O");
                    oneBtn.setDisable(true);
                }
                if(i==2){
                    twoBtn.setText("O");
                    twoBtn.setDisable(true);
                }
                if(i==3){
                    threeBtn.setText("O");
                    threeBtn.setDisable(true);
                }
                if(i==4){
                    fourBtn.setText("O");
                    fourBtn.setDisable(true);
                }
                if(i==5){
                    fiveBtn.setText("O");
                    fiveBtn.setDisable(true);
                }
                if(i==6){
                    sixBtn.setText("O");
                    sixBtn.setDisable(true);
                }
                if(i==7){
                    sevenBtn.setText("O");
                    sevenBtn.setDisable(true);
                }
                if(i==8){
                    eightBtn.setText("O");
                    eightBtn.setDisable(true);
                }
                if(i==9){
                    nineBtn.setText("O");
                    nineBtn.setDisable(true);
                }
            }
        }else if(oneBtn.getText().equals("")){
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    oneBtn.setText("O");
                    oneBtn.setDisable(true);
                }
            }else if(twoBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    twoBtn.setText("O");
                    twoBtn.setDisable(true);
                }
            }else if(fiveBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    fiveBtn.setText("O");
                    fiveBtn.setDisable(true);
                }
            }else if(sevenBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    sevenBtn.setText("O");
                    sevenBtn.setDisable(true);
                }
            }else if(fourBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    fourBtn.setText("O");
                    fourBtn.setDisable(true);
                }
            }else if(sixBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    sixBtn.setText("O");
                    sixBtn.setDisable(true);
                }
            }else if(nineBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    nineBtn.setText("O");
                    nineBtn.setDisable(true);
                }
            }else if(eightBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    eightBtn.setText("O");
                    eightBtn.setDisable(true);
                }
            }else if(threeBtn.getText().equals("")) {
                if(!aLine.isVisible() &&!bLine.isVisible() &&!cLine.isVisible() &&!dLine.isVisible() &&!eLine.isVisible() &&!fLine.isVisible() &&!gLine.isVisible() &&!hLine.isVisible()) {
                    threeBtn.setText("O");
                    threeBtn.setDisable(true);
                }
            }
        }

    public void setBtnDisabled(){
        oneBtn.setDisable(true);
        twoBtn.setDisable(true);
        threeBtn.setDisable(true);
        fourBtn.setDisable(true);
        fiveBtn.setDisable(true);
        sixBtn.setDisable(true);
        sevenBtn.setDisable(true);
        eightBtn.setDisable(true);
        nineBtn.setDisable(true);
    }

    public void setBtnEnabled(){
        if (oneBtn.getText().equals("")) {
            oneBtn.setDisable(false);
        }
        if (twoBtn.getText().equals("")) {
            twoBtn.setDisable(false);
        }
        if (threeBtn.getText().equals("")) {
            threeBtn.setDisable(false);
        }
        if (fourBtn.getText().equals("")) {
            fourBtn.setDisable(false);
        }
        if (fiveBtn.getText().equals("")) {
            fiveBtn.setDisable(false);
        }
        if (sixBtn.getText().equals("")) {
            sixBtn.setDisable(false);
        }
        if (sevenBtn.getText().equals("")) {
            sevenBtn.setDisable(false);
        }
        if (eightBtn.getText().equals("")) {
            eightBtn.setDisable(false);
        }
        if (nineBtn.getText().equals("")) {
            nineBtn.setDisable(false);
        }
    }
}
