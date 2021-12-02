package com.example.cryptopricewatcher;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BtcController implements Initializable {
    public Label priceLabel;
    public LineChart btcChart;
    public Button homeButton;

    public void goHome(ActionEvent e) throws IOException {
        SceneUtil.changeScene(e, "selection-view.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Currency bitcoin = APIUtil.getCurrencyData("BTC","CAD");
            priceLabel.setText(String.format("%.2f", Double.parseDouble(bitcoin.getAmount())) + " " + bitcoin.getCurrency());
            btcChart.getData().add(APIUtil.getHistoricalCurrencyData("BTC", "CAD"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
