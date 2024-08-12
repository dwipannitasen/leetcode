class Solution {
    public int findNumbers(int[] nums) {
        int total = 0;
        for(int i:nums){
            int count = countDigits(i);
            if(count%2==0) total++;
        }
        return total;
    }

    public int countDigits(int i){
        return (int)(Math.log10(i)+1);
    }
}