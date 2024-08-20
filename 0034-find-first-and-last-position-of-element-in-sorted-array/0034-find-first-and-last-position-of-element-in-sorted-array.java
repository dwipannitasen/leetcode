class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] ={-1,-1};
        int first = first(nums,target);
        if(first==-1){
            ans[0]=-1;
            ans[1]=-1;
        }
        int last = last(nums,target);
        ans[0]=first;
        ans[1]=last;

        return ans;
    }
    
    public int first(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }

    public int last(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else start = mid+1;
        }
        return ans;
    }
}