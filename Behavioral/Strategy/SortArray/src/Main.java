public class Main {
    public static void main(String[] args) {
        SortStrategy sortStrategy = new SortStrategy();
        int nums1[] = {10, 8, 15, 18};
        sortStrategy.setSortTechnique(new QuickSort());
        nums1 = sortStrategy.sort(nums1);
        for(int num : nums1) System.out.print(num + ", ");
        System.out.println();

        int nums2[] = {10, 8, 15, 18};
        sortStrategy.setSortTechnique(new BubbleSort());
        sortStrategy.sort(nums2);
        for(int num : nums2) System.out.print(num + ", ");
    }
}