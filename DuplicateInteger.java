package org.example;

import java.util.HashSet;

public class DuplicateInteger {
    public static boolean hasDuplicate(int[] nums) {
        int length = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
            length++;
        }
        if(set.size() < length){
            return true;
        } else{
            return false;
        }
    }
}
