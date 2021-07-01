//BF method by nested loop
//using hashmap to speed up
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(hash_map.containsKey(target-nums[i]))
                return(new int[]{hash_map.get(target-nums[i]), i});
            else
                hash_map.put(nums[i], i);
            
        }
        return( new int[]{-1,-1});

        
    }
}
