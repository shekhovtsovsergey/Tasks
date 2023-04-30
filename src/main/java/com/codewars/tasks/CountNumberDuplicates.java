package com.codewars.tasks;

import java.lang.String;    // базовый класс для работы со строками
import java.lang.System;    // базовый класс для работы с системой
import java.lang.*;         // импортирует все базовые классы, но не рекомендуется
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNumberDuplicates {

    public static void main(String[] args) {
        var count = new CountNumberDuplicates();
        System.out.println(count.duplicateCount("indivisibility"));
    }

    private int count (String text){
        int count = 0;
        String a;
        String b;

        char[] array = text.toLowerCase().toCharArray();

        for (int i = 0; i < text.length(); i++) {
            a = String.valueOf(array[i]);

                for (int j = i+1; j <text.length() ; j++) {
                    b = String.valueOf(array[j]);
                    if (a.equals(b)) {
                        count++;
                        array[j] ='\0';
                        break;
                    }
                }
        }
        return count;
    }


    private int countMap (String text){
        int count = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();

        char[] charArray = text.toLowerCase().toCharArray();

        for(int i=0; i<charArray.length; i++) {
            char c = charArray[i];
                charCount.put(c, charCount.getOrDefault(c, 0) + 1); // добавляем символ в HashMap
        }

        for(Map.Entry<Character, Integer> entry: charCount.entrySet()) {
            if(entry.getValue() > 1) { // если символ встречается более одного раза, увеличиваем счетчик
                count++;
            }
        }
        return count;
    }


    public static int duplicateCount(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (text.length() > 0) {
            String firstLetter = text.substring(0,1);// берем первый символ
            text = text.substring(1);//обрезаем строку чтобы первого не было
            if (text.contains(firstLetter)) ans ++;// если содержит то переменная ++
            text = text.replace(firstLetter, "");//заменяем все символы на ""
        }
        return ans;
    }



}
