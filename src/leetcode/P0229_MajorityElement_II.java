package leetcode;

import java.util.*;

public class P0229_MajorityElement_II {
    public List<Integer> majorityElement(int[] nums) {
        int cut = nums.length / 3;

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for(int num : nums){
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num) + 1);
            }else{
                hm.put(num, 1);
            }
        }

        hm.forEach((key, value) -> {
            if(value > cut) result.add(key);
        });

        return result;
    }
}
