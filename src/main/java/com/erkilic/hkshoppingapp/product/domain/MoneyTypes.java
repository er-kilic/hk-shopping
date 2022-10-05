package com.erkilic.hkshoppingapp.product.domain;

public enum MoneyTypes {
    USD("Dolar","$"),
    EUR("Euro","E"),
    TL("Türk Lirası","TL ");

    private String label;
    private String symbol;

    MoneyTypes (String label, String symbol){
        this.label = label;
        this.symbol = symbol;
    }
}
