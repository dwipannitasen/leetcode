class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int result[] = new int[2];
        int index=0;
        for(int key: nums){
            if(map.get(key)==1) result[index++] = key;
        }

        return result;
    }
}