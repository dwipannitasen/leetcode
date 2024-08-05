class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
        // Map<Integer,Integer> map = new LinkedHashMap<>();
        // int n = nums.length;
        // for(int i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }
        // int index=0;
        // for(Integer key : map.keySet())
        // {
        //     nums[index++] = key;
        // }
        // return index;
    }
}