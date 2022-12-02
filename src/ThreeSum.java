import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> combinations = new ArrayList<>();


        for (int i = 0; i < nums.length / 3; i++) {
            for (int j = nums.length / 3; j < (nums.length * 2) / 3; j++) {
                for (int k = (nums.length * 2) / 3; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0)   {

                            combinations.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        }
                    }
                }
            }
        return combinations;
    }
}
