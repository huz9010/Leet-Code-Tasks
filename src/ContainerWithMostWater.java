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

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int currentArea = Math.min(height[i], height[j]) * (j - i);

                if (currentArea > maxArea)  {
                    maxArea = currentArea;
                }
            }
        }
        return maxArea;
    }
}
