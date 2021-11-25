package com.example.cryptopricewatcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EthController implements Initializable {

    public LineChart ethChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            APIUtil.getCurrencyData("ETH","CAD");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
