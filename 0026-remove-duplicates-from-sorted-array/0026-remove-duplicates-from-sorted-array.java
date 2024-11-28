class Solution {
    public int removeDuplicates(int[] nums) {
        // int i = 0;
        // for(int j=1; j<nums.length; j++){
        //     if(nums[j] != nums[i]){
        //         nums[i+1] = nums[j];
        //         i++;
        //     }
        // }
        // return i+1;

        int idx = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[idx++] = nums[i];
            }
        }
        return idx;

        // HashSet<Integer> set = new HashSet<>();
        // int index = 0;

        // for (int i : nums) {
        //     if (!set.contains(i)) {
        //         set.add(i);
        //         nums[index++] = i; 
        //     }
        // }
        // return index;
    }
}