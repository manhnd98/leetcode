class EffectiveSolution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;
        for (int i = m; i < length; i++) {
            // start with m, not 0
            // by using i - m, we can get the index of nums2
            nums1[i] = nums2[i - m];
        }

        Arrays.sort(nums1);
    }
}