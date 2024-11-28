class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k%n;

        reverse(nums,0,n-1);//full
        reverse(nums,0,k-1);//first
        reverse(nums,k,n-1);//second
    }

    public void reverse(int [] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}