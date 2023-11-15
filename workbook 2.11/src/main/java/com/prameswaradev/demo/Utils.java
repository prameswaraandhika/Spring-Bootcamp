package com.prameswaradev.demo;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    public static String format(BigDecimal amount) {
        // Using Locale for Indonesia and formatting the amount to Indonesian Rupiah
        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(indonesia);

        return rupiahFormat.format(amount);
    }
}
