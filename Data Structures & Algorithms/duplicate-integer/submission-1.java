class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) == false) {
                return true;
            }
        }
        return false;


        /*
        Arrays.sort(nums);
        for (int i = 1; i < nums.length ; ++i) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    */
    }
}




