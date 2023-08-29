package com.example;

import java.util.HashMap;
import java.util.Map;

public class WriteStringsToColumn {

    public static void main(String[] args) {
//        String[] strings = {"String1", "VeryLongString2", "Short3", "AnotherLongString4", "MediumString5", "String6", "YetAnotherVeryLongString7"};
        String[] strings = {"1", "2", "3", "x", "5","1", "6", "33fvdfgfdgdrffffffffffgd", "x", "533", "dfgfdgdfgd","1", "6", "s", "x", "533", };

        int columns = 5;
        int maxStringLength = getMaxStringLength(strings);
        int columnWidth = maxStringLength + 2;

        for (int i = 0; i < strings.length; i++) {
            System.out.printf("%-" + columnWidth + "s", strings[i]);

            if ((i + 1) % columns == 0) {
                System.out.println();
            }
        }
    }

    private static int getMaxStringLength(String[] strings) {
        int max = 0;
        for (String str : strings) {
            if (str.length() > max) {
                max = str.length();
            }
        }
        return max;
    }

}
