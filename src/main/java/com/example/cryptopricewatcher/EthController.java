package com.example.cryptopricewatcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EthController implements Initializable {

    public CategoryAxis dateAxis;
    public NumberAxis priceAxis;

    public LineChart ethChart;
    public Label priceLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dateAxis.setLabel("Month");
        priceAxis.setLabel("Price");
        try {
            Currency ethereum = APIUtil.getCurrencyData("ETH","CAD");
            priceLabel.setText(String.format("%.2f", Double.parseDouble(ethereum.getAmount())) + " " + ethereum.getCurrency());
            ethChart.getData().add(APIUtil.getHistoricalCurrencyData("ETH", "CAD"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
   }

    @FXML
    protected void goHome(ActionEvent e) throws IOException {
        SceneUtil.changeScene(e, "selection-view.fxml");
    }
}
