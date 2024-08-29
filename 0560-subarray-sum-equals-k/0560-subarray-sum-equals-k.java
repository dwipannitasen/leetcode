class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int preSum=0, count=0;

        map.put(0,1);
        for(int i=0;i<n;i++){
            preSum+=nums[i];
            int check = preSum-k;

            count+=map.getOrDefault(check,0);
            
            
            map.put(preSum, map.getOrDefault(preSum,0)+1);
        }

        return count;



    }
}