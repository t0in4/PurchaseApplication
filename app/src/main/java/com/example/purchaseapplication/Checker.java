package com.example.purchaseapplication;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Checker {
    static boolean result(String s){
        return "2022".equals(s) ? true : false;
    }

    public static boolean checkPurchase() {
        Date currentTime = Calendar.getInstance().getTime();
        Format formatter = new SimpleDateFormat("yyyy");
        String s = formatter.format(currentTime);
        boolean res = result(s);
        return res;
    }
}
