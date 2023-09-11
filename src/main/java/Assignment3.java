
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
    // Find the sum of a list of numbers
    public static Integer listSum(List<Integer> nums) {
        Integer sum = 0;

        for (Integer num : nums) {
            sum += num;
        }

        return sum;
    }

    // Find the product of a list of numbers
    public static Integer listProduct(List<Integer> nums) {
        Integer product = 1;

        for (Integer num : nums) {
            product *= num;
        }

        return product;
    }

    public static List<Integer> reverseList(List<Integer> nums) {
        List<Integer> reversed = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            reversed.add(nums.get(i));
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's do some math magic!");

        System.out.println("How many numbers would you like to enter?");
        Integer numCount = scanner.nextInt();

        System.out.println("Please enter " + numCount + " numbers - one at a time:");
        List<Integer> nums = List.of(scanner.nextInt());

        System.out.println("Sum: " + listSum(nums));
        System.out.println("Product: " + listProduct(nums));
        System.out.println("Reversed: " + reverseList(nums));
    }
}
