package com.example.cryptopricewatcher;

import com.google.gson.annotations.SerializedName;

import java.io.Serial;

public class Currency {
    @SerializedName("data")
    private String data;

    @SerializedName("amount")
    private String amount;

    @SerializedName("currency")
    private String currency;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
