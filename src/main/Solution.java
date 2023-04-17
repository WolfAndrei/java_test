package main;

import java.util.HashMap;

public class Solution {

  public int[] twoSum(int[] nums, int target) {
    // number - index
    int[] result = new int[2];
    HashMap<Integer, Integer> hash = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (hash.containsKey(target - nums[i])) {
        result[0] = i;
        result[1] = hash.get(target - nums[i]);
        break;
      } else {
        hash.put(nums[i], i);
      }
    }
    return result;
  }
}
