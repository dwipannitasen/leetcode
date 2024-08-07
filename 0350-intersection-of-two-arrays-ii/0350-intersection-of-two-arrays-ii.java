class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums2.length;i++){
            if(map.getOrDefault(nums2[i],0)>0){
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int [] intersection = new int[result.size()];
        for(int i=0; i<result.size();i++){
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}