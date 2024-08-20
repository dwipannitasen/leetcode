class Solution {
    public int singleNonDuplicate(int[] nums) {

        int n = nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low = 1, high=n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            //left half
            if((mid%2==1 && nums[mid-1]==nums[mid])
            || (mid%2==0 && nums[mid+1]==nums[mid])) low=mid+1;
            //right half
            else high = mid-1;
        }

        return -1;


        // HashMap<Integer,Integer> map = new  HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }

        // for(int i: nums){
        //     if(map.get(i)==1){
        //         return i;
        //     }
        // }
        // return -1;
    }
}