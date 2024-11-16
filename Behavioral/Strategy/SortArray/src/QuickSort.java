import java.util.Arrays;
public class QuickSort implements Sort{

    @Override
    public int[] sort(int[] nums) {
        System.out.println("Array sorted with Quick Sort");
        Arrays.sort(nums);
        return nums;
    }
}
