package org.example;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            uniqueNums.add(nums[i]);
        }
        HashMap<Integer, Integer> numsCount = new HashMap<>();
        for(Integer num : uniqueNums){
            numsCount.put(num, 0);
        }
        for(int i = 0; i < nums.length; i++){
            int increased = numsCount.get(nums[i]);
            increased++;
            numsCount.put(nums[i], increased);
        }
        ArrayList<Integer> maxValues = new ArrayList<>();
        while (k > 0){
            int max = Collections.max(numsCount.entrySet(), Map.Entry.comparingByValue()).getKey();
            maxValues.add(max);
            numsCount.remove(max);
            k--;
        }


        System.out.println(maxValues);

       return maxValues.stream().mapToInt(i->i).toArray();
    }
}
