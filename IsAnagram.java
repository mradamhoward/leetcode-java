package org.example;

import java.util.Arrays;

public class IsAnagram {

    public boolean isAnagram(String s, String t) {
            char[] sortedFirst = s.toCharArray();
            Arrays.sort(sortedFirst);
            String first = new String(sortedFirst);

            char[] sortedSecond = t.toCharArray();
            Arrays.sort(sortedSecond);
            String second = new String(sortedSecond);

            if(first.equalsIgnoreCase(second)){
                return true;
            } else {
                return false;
            }
    }
}
