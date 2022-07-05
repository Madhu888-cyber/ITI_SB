package com.iti.DBC;

import org.springframework.stereotype.Component;

@Component
public class MyUtil {

	public static String ChDate1(String s1) {
        String day, month, year, date;
        day = s1.substring(0, 2);
        month = s1.substring(3, 5);
        year = s1.substring(6, 10);
        date = year + '-' + month + '-' + day;
        return date;
    }
}
