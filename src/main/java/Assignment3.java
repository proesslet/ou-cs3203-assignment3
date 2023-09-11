
import java.util.List;
import java.util.Scanner;

public class Assignment3 {
    public static Integer listSum(List<Integer> nums) {
        Integer sum = 0;

        for (Integer num : nums) {
            sum += num;
        }

        return sum;
    }

    public static Integer listProduct(List<Integer> nums) {
        Integer product = 1;

        for (Integer num : nums) {
            product *= num;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        Integer numCount = scanner.nextInt();

        System.out.println("Please enter " + numCount + " numbers - one at a time:");
        List<Integer> nums = List.of(scanner.nextInt());

        System.out.println("Sum: " + listSum(nums));
        System.out.println("Product: " + listProduct(nums));
    }
}
