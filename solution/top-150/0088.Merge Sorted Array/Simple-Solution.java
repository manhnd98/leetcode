class SimpleSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m || j < n) {

            if(i == m) {
                nums[k++] = nums2[j++];
            }else if(j == n) {
                nums[k++] = nums1[i++];
            }else if(nums1[i] < nums2[j]) {
                nums[k++] = nums1[i++];
            } else if (nums1[i] >= nums2[j]) {
                nums[k++] = nums2[j++];
            }
        }

        // loop and assign back to nums1
        for(int l = 0; l < m+n; l++) {
            nums1[l] = nums[l];
        }
    }


}