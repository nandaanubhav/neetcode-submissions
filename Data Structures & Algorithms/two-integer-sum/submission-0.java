class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numSet = new HashMap<>();
        for(int i=0; i<nums.length; ++i) {
            int compliment = target - nums[i];
            if(numSet.containsKey(compliment)) {
                return new int[]{numSet.get(compliment), i};
            }
            numSet.put(nums[i], i);
        }
        return new int[]{-1, -1};   
    }
}
