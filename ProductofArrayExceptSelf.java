package org.example;

import java.util.ArrayList;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();

        ArrayList<Integer> multiplyThese = new ArrayList<>();
        int currentCounter = 0;

        while (currentCounter < nums.length){
            for(int i = 0; i < nums.length; i++){
                if(currentCounter != i) {
                    multiplyThese.add(nums[i]);
                }
            }
            answer.add(multiplyThese.stream().mapToInt(x->x).reduce(1, Math::multiplyExact));
            multiplyThese.clear();
            currentCounter++;
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
