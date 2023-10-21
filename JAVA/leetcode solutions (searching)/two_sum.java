// 1. Two Sum
//   https://leetcode.com/problems/two-sum/description/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] y = new int[2];
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x =(target-nums[i]);
            if(m.containsKey(x) && m.get(x)!=i){
                y[0] =m.get(x);
                y[1] = i;
            System.out.println(m);

                return y;
            }
            m.put(nums[i],i);

        }
        return y;
    }
}
