package com.wodric.cryptlaserbackend.domain;

public enum CurrencyType {
    /**
     * LIke EUR or USD
     */
    PHYSICAL(0),
    /**
     * Like BTC or LTC
     */
    CRYPTO(1),
    /**
     * Like Gold
     */
    METAL(2);

    private int id;

    private CurrencyType(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
