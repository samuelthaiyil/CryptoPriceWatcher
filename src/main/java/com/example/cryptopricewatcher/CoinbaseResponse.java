package com.example.cryptopricewatcher;

import com.google.gson.annotations.SerializedName;

public class CoinbaseResponse {
    @SerializedName("data")
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
