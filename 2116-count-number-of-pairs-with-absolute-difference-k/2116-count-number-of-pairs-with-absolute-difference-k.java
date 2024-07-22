class Solution {
    public int countKDifference(int[] arr, int k) {
        int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int num: arr){
				if(map.containsKey(num+k)) count += map.get(num+k);
				if(map.containsKey(num-k)) count += map.get(num-k);

				map.put(num, map.getOrDefault(num, 0)+1);
			}
			
		return count;
    }
}