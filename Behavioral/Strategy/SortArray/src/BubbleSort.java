import java.util.Arrays;
public class BubbleSort implements Sort{

    @Override
    public int[] sort(int[] nums) {
        System.out.println("Array sorted with Bubble Sort");
        Arrays.sort(nums);
        return nums;
    }
}
