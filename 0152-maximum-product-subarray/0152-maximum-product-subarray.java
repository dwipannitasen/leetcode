class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        int n = nums.length;
        int suffix = 1, prefix = 1;
        
        for(int i=0; i<n; i++){
            if(suffix == 0) suffix=1;
            if(prefix == 0) prefix=1;
            
            prefix *= nums[i];
            suffix *= nums[n-i-1];

            maxProd = Math.max(maxProd, Math.max(suffix,prefix));

        }

        return maxProd;
    }
}