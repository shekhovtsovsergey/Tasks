package com.codewars.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverse("This    is an example!"));
    }


    private String reverse (final String original){

        String[] bigArray = original.split(" ");
        for (int i = 0; i < bigArray.length; i++) {
            String tmp = bigArray[i];

                char[] smallArray = tmp.toCharArray();
                char[] reverse = new char[smallArray.length];
                int z = smallArray.length-1;
                for (int j = 0; j < smallArray.length; j++) {
                    reverse[z] = smallArray[j];
                    z--;
                }
                String str = Arrays.toString(reverse).replaceAll("\\[|\\]|,|\\s", "");

            bigArray[i] = str;

        }

        String output="";
        for (int i = 0; i < bigArray.length; i++) {
            output = output.concat(bigArray[i]);
            output = output.concat(" ");
        }
        return output.trim();
    }
}
