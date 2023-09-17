class LinearSolution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;

        for(int i = 0; i < nums.length; i++) {

            if(map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            }else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return 0;
    }
}