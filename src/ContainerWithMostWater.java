import java.util.Arrays;
import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] heights = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println(maxArea(heights));
    }

    public static int maxArea(int[] height) {

        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j)   {
            if (height[j] >= height[i]) {
                maxArea = Math.max(maxArea, height[i] * (j - i));
                i++;
            }   else {
                maxArea = Math.max(maxArea, height[j] * (j - i));
                j--;
            }
        }
        return maxArea;
    }
}
