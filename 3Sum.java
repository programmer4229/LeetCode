class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 3 && (nums[0] + nums[1] + nums[2]) == 0) {
            result.add(new ArrayList<Integer>());
            result.get(0).add(nums[0]);
            result.get(0).add(nums[1]);
            result.get(0).add(nums[2]);
            return result;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int left = i+1;
                int right = nums.length - 1;

                while (right > left) {
                    int threeSum = nums[i] + nums[left] + nums[right];
                    if (threeSum > 0) {
                        right--;
                    } else if (threeSum < 0) {
                        left++;
                    } else {
                        ArrayList<Integer> newL = new ArrayList<Integer>();
                        newL.add(nums[i]);
                        newL.add(nums[left]);
                        newL.add(nums[right]);
                        result.add(newL);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (nums[right] == nums[right - 1] && left < right) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return result;
    }
        
}