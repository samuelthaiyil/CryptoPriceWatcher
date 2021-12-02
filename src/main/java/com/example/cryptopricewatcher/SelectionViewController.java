package com.example.cryptopricewatcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class SelectionViewController {
    public Button ethButton;

    public Button btcButton;

    @FXML
    protected void onEthBtnClick(ActionEvent e) throws IOException {
        SceneUtil.changeScene(e, "eth-view.fxml");
    }

    @FXML
    protected void onBtcBtnClick(ActionEvent e) throws IOException {
        SceneUtil.changeScene(e, "btc-view.fxml");
    }
}