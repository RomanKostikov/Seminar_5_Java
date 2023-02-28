package org.example.cw3;

import java.util.HashMap;
import java.util.Map;

/**
 * Написать перевод их Римских цифр в арабские:
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 1)	ввод: s = "LVIII"
 * вывод: 58
 * разбор: L = 50, V= 5, III = 3.
 * 2)	ввод: s = "MCMXCIV"
 * вывод: 1994
 * разбор: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class Main {
    public static void main(String[] args) {
        String text = "LVIII";
        String text2 = "MCMXCIV";
        System.out.println(translateNum(text));
        System.out.println(translateNum(text2));
    }

    public static int translateNum(String str) {
        Map<Character, Integer> mapList = new HashMap<>();
        mapList.put('I', 1);
        mapList.put('V', 5);
        mapList.put('X', 10);
        mapList.put('L', 50);
        mapList.put('C', 100);
        mapList.put('D', 500);
        mapList.put('M', 1000);
        int num = mapList.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if (mapList.get(str.charAt(i + 1)) > mapList.get(str.charAt(i))) {
                num -= mapList.get(str.charAt(i));
            } else num += mapList.get(str.charAt(i));
        }
        return num;
    }
}
