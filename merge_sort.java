class merge_sort {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1, i = m+n-1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            }
            else {
                nums1[i--] = nums2[p2--];
            }
        }
    }
    public static void main(String[] args) {
        merge_sort ms = new merge_sort();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        ms.merge(nums1, 3, nums2, 3);
        for(int i=0;i<6;i++)
        System.out.println(nums1[i]);
    }
    
}