import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int target = Integer.parseInt(scanner.nextLine());

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    private static int[] searchRange(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int[] positions = {-1, -1};

        if (nums.length == 1 && nums[0] == target)  {
            positions[0] = 0;
            positions[1] = 0;
            return positions;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                if (nums[mid + 1] == target) {
                    positions[0] = mid;
                    positions[1] = mid + 1;
                } else {
                    positions[0] = mid - 1;
                    positions[1] = mid;
                }
                if (positions[0] == -1) {
                    positions[0] = positions[1];
                }
                return positions;
            } else {
                if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return positions;
    }
}
